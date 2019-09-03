package com.kingaspx.util;

import java.sql.SQLException;
import javax.swing.JComboBox;

public class PreencherCbo {

    ConectaBanco conecta = new ConectaBanco();

    public void preencherCombo(String SQL, JComboBox combo, String coluna) {
        conecta.conexao();
        conecta.executaSQL(SQL);
        try {
            combo.removeAllItems();
            conecta.rs.first();
            do {
                combo.addItem(conecta.rs.getString(coluna));
                combo.setSelectedItem(null);
            } while (conecta.rs.next());
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro ao receber dados");
            System.out.println(ex);
        }
        conecta.desconecta();
    }
    
}
