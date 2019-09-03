package com.kingaspx.util;

import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConectaBanco {

    public Statement stm;// responsável por preparar e realizar pesquisas no banco de dados

    public ResultSet rs;//  responsável por armazenar o resultado de uma pesquisa passada para o Statement
    private final String driver = "org.postgresql.Driver";// responsável por identificar o serviço de banco de dados
    private final String caminho = "jdbc:postgresql://localhost:5432/emp_control";// responsável por setar o local do banco de dados
    private String usuario = "postgres";
    private String senha = "consultsegur";

    public Connection conn; // responsável por realizar a conexão com o banco de dados

    public void conexao() { //Metodo Responsável por realizar a conexão com o banco
        try {// tentativa inicial
            Class.forName(driver);
            conn = DriverManager.getConnection(caminho, usuario, senha); // realiza a conexão com o banco de dados
            //JOptionPane.showMessageDialog (null, "Conectado com Sucesso ao Banco de Dados!"); // imprime uma caixa de mensagens
//            System.out.println("Conectado"); // imprime uma caixa de mensagens
        } catch (SQLException ex) { // excessão
            System.out.println("Erro ao conectar");
            Logger.getLogger(ConectaBanco.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConectaBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void executaSQL(String sql) {
        try {
            stm = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (Exception ex) {
            ex.printStackTrace();
            //JOptionPane.showMessageDialog (null, "Erro de ExecutaSQL!\n Erro:" + ex.getMessage());
        }
    }

    public void desconecta() {//metodo para fechar a conexão com o banco de dados
        try {
            conn.close(); //fecha a conexão
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão!\n Erro:" + ex.getMessage());
        }

    }

    public static void main(String[] args) {
        ConectaBanco conecta = new ConectaBanco();
        try {
            conecta.conexao();
            conecta.executaSQL("SELECT the_date, COUNT(nome) AS visitante FROM dias_do_mes() LEFT JOIN visitantes on the_date = to_date(\"dataentrada\", 'DD/MM/YYYY') GROUP BY dias_do_mes.the_date, visitantes.nome ORDER BY dias_do_mes.the_date ASC");
            while (conecta.rs.next()) {
                Date data = conecta.rs.getDate("the_date");
                String qtd = conecta.rs.getString("visitante");
                System.out.println(data);
            }
            conecta.desconecta();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
