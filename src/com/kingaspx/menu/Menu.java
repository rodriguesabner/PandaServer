package com.kingaspx.menu;

import com.kingaspx.util.ConectaBanco;
import com.kingaspx.util.ModeloTabela;
import com.kingaspx.util.PreencherCbo;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import static javafx.util.Duration.seconds;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableModel;

public class Menu extends javax.swing.JFrame {

    ConectaBanco conecta = new ConectaBanco();

    public Menu() {
        initComponents();
        paint_table();
        fill_table_database();
        fill_combo("SELECT * FROM funcionarios ORDER BY nome ASC");
        sum_hours_total();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        dar_folga = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        add_hora_btn = new javax.swing.JMenuItem();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        combo5 = new javax.swing.JComboBox<>();
        combo1 = new javax.swing.JComboBox<>();
        combo6 = new javax.swing.JComboBox<>();
        combo4 = new javax.swing.JComboBox<>();
        combo2 = new javax.swing.JComboBox<>();
        combo3 = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        campoimagem = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        combo7 = new javax.swing.JComboBox<>();
        combo8 = new javax.swing.JComboBox<>();
        combo9 = new javax.swing.JComboBox<>();
        combo10 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        combo11 = new javax.swing.JComboBox<>();
        combo12 = new javax.swing.JComboBox<>();
        combo13 = new javax.swing.JComboBox<>();
        combo14 = new javax.swing.JComboBox<>();
        server_btn = new keeptoo.KButton();
        jLabel12 = new javax.swing.JLabel();

        dar_folga.setText("Folga Concedida");
        dar_folga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dar_folgaActionPerformed(evt);
            }
        });
        jPopupMenu1.add(dar_folga);
        jPopupMenu1.add(jSeparator2);

        add_hora_btn.setText("Adicionar Hora");
        add_hora_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_hora_btnActionPerformed(evt);
            }
        });
        jPopupMenu1.add(add_hora_btn);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkFillBackground(false);
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 250, 250)));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabela.setFillsViewportHeight(true);
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabelaMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        kGradientPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 700, 190));

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel3.setText("Funcionários");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        combo5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo5ItemStateChanged(evt);
            }
        });
        kGradientPanel1.add(combo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 100, 20));

        combo1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo1ItemStateChanged(evt);
            }
        });
        kGradientPanel1.add(combo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 100, 20));

        combo6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo6ItemStateChanged(evt);
            }
        });
        kGradientPanel1.add(combo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, 100, 20));

        combo4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo4ItemStateChanged(evt);
            }
        });
        kGradientPanel1.add(combo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 100, 20));

        combo2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo2ItemStateChanged(evt);
            }
        });
        kGradientPanel1.add(combo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 100, 20));

        combo3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo3ItemStateChanged(evt);
            }
        });
        kGradientPanel1.add(combo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 100, 20));

        jSeparator3.setForeground(new java.awt.Color(219, 219, 219));
        kGradientPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 720, 10));

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Trabalha");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 100, 20));

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Total:");
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 250, -1));

        jSeparator4.setForeground(new java.awt.Color(219, 219, 219));
        kGradientPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 200, 10));

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoimagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(campoimagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 270));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("0");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 240, -1));

        jSeparator1.setForeground(new java.awt.Color(219, 219, 219));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 110, 10));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Nome");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 240, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(105, 105, 105));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Horas Restantes:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 240, -1));

        jSeparator6.setForeground(new java.awt.Color(219, 219, 219));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 110, 10));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(105, 105, 105));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Conversão em dias:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 240, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("0");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 240, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(105, 105, 105));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Conversão em pagamento:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 240, -1));

        jSeparator7.setForeground(new java.awt.Color(219, 219, 219));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 110, 10));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("0");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 240, -1));

        jSeparator8.setForeground(new java.awt.Color(219, 219, 219));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 110, 10));

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 490, 280));

        jSeparator5.setForeground(new java.awt.Color(219, 219, 219));
        kGradientPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 110, 10));

        combo7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo7ItemStateChanged(evt);
            }
        });
        kGradientPanel1.add(combo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 100, 20));

        combo8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo8ItemStateChanged(evt);
            }
        });
        kGradientPanel1.add(combo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 100, 20));

        combo9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo9ItemStateChanged(evt);
            }
        });
        kGradientPanel1.add(combo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, 100, 20));

        combo10.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo10ItemStateChanged(evt);
            }
        });
        kGradientPanel1.add(combo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, 100, 20));

        jLabel11.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Folga");
        kGradientPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 100, 20));

        combo11.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo11ItemStateChanged(evt);
            }
        });
        kGradientPanel1.add(combo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 100, 20));

        combo12.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo12ItemStateChanged(evt);
            }
        });
        kGradientPanel1.add(combo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 440, 100, 20));

        combo13.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo13ItemStateChanged(evt);
            }
        });
        kGradientPanel1.add(combo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, 100, 20));

        combo14.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo14ItemStateChanged(evt);
            }
        });
        kGradientPanel1.add(combo14, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, 100, 20));

        server_btn.setText("Gerar Escala");
        server_btn.setkAllowGradient(false);
        server_btn.setkAllowTab(false);
        server_btn.setkBackGroundColor(new java.awt.Color(94, 179, 138));
        server_btn.setkHoverColor(new java.awt.Color(77, 153, 116));
        server_btn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        server_btn.setkPressedColor(new java.awt.Color(63, 123, 94));
        server_btn.setOpaque(false);
        server_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                server_btnActionPerformed(evt);
            }
        });
        kGradientPanel1.add(server_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, 210, 30));
        server_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel12.setForeground(new java.awt.Color(157, 157, 157));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Escala Semanal");
        kGradientPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 530, 210, 20));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void server_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_server_btnActionPerformed

    }//GEN-LAST:event_server_btnActionPerformed

    private void combo1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo1ItemStateChanged
    }//GEN-LAST:event_combo1ItemStateChanged

    private void combo2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo2ItemStateChanged
    }//GEN-LAST:event_combo2ItemStateChanged

    private void combo3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo3ItemStateChanged
    }//GEN-LAST:event_combo3ItemStateChanged

    private void combo4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo4ItemStateChanged
    }//GEN-LAST:event_combo4ItemStateChanged

    private void combo5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo5ItemStateChanged
    }//GEN-LAST:event_combo5ItemStateChanged

    private void combo6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo6ItemStateChanged
    }//GEN-LAST:event_combo6ItemStateChanged

    private void dar_folgaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dar_folgaActionPerformed
        folga_concedida(id);
        fill_table_database();
    }//GEN-LAST:event_dar_folgaActionPerformed

    private void add_hora_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_hora_btnActionPerformed
        add_horas(id);
        fill_table_database();
    }//GEN-LAST:event_add_hora_btnActionPerformed

    private void tabelaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseReleased
        if (evt.isPopupTrigger()) {//Se o mouse foi clicado com o botão de PopupMenu default do sistema operacional em uso
            jPopupMenu1.show(tabela, evt.getX(), evt.getY()); //p é o JPopupMenu, t é a tabela, e.getX() recupera a posição horizontal do mouse e e.getY() recupera a posição vertical.
        }
    }//GEN-LAST:event_tabelaMouseReleased

    int id, horas_atuais;
    String foto;

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        conecta.conexao();
        String table = "" + tabela.getValueAt(tabela.getSelectedRow(), 0);
        try {
            conecta.executaSQL("select * from funcionarios where id='" + table + "'");
            conecta.rs.first();
            id = conecta.rs.getInt("id");
            String nome = conecta.rs.getString("nome");
            horas_atuais = conecta.rs.getInt("qtd_horas");
            foto = conecta.rs.getString("foto");

            ImageIcon icon = new ImageIcon(new ImageIcon(foto).getImage().getScaledInstance(campoimagem.getWidth(), campoimagem.getHeight(), Image.SCALE_SMOOTH));
            campoimagem.setIcon(icon);

            jLabel8.setText(nome);
            jLabel6.setText(String.valueOf(horas_atuais));
            jLabel10.setText(horas_atuais / 12 + " dia(s)");
            
            String formato = "R$ #,##0.00";
            DecimalFormat d = new DecimalFormat(formato);
            double valor = horas_atuais * 8.33;
            jLabel14.setText(String.valueOf(d.format(valor)));
        } catch (SQLException s) {
            s.printStackTrace();
        } finally {
            conecta.desconecta();
        }
    }//GEN-LAST:event_tabelaMouseClicked

    private void combo7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo7ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_combo7ItemStateChanged

    private void combo8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo8ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_combo8ItemStateChanged

    private void combo9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo9ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_combo9ItemStateChanged

    private void combo10ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo10ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_combo10ItemStateChanged

    private void combo11ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo11ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_combo11ItemStateChanged

    private void combo12ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo12ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_combo12ItemStateChanged

    private void combo13ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo13ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_combo13ItemStateChanged

    private void combo14ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo14ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_combo14ItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem add_hora_btn;
    private javax.swing.JLabel campoimagem;
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JComboBox<String> combo10;
    private javax.swing.JComboBox<String> combo11;
    private javax.swing.JComboBox<String> combo12;
    private javax.swing.JComboBox<String> combo13;
    private javax.swing.JComboBox<String> combo14;
    private javax.swing.JComboBox<String> combo2;
    private javax.swing.JComboBox<String> combo3;
    private javax.swing.JComboBox<String> combo4;
    private javax.swing.JComboBox<String> combo5;
    private javax.swing.JComboBox<String> combo6;
    private javax.swing.JComboBox<String> combo7;
    private javax.swing.JComboBox<String> combo8;
    private javax.swing.JComboBox<String> combo9;
    private javax.swing.JMenuItem dar_folga;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KButton server_btn;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

    private void paint_table() {
        jScrollPane1.getViewport().setBackground(Color.WHITE);
        tabela.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tabela.getTableHeader().setOpaque(false);
        tabela.getTableHeader().setBackground(new Color(60, 127, 177));
        tabela.getTableHeader().setForeground(new Color(255, 255, 255));
        tabela.setRowHeight(50);
    }

    private void fill_table_database() {
        conecta.conexao();

        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID", "Nome", "Horas Acumuladas"};

        conecta.executaSQL("SELECT * FROM funcionarios ORDER BY nome ASC");
        try {
            conecta.rs.first();
            do {
                dados.add(new Object[]{
                    conecta.rs.getString("id"),
                    conecta.rs.getString("nome"),
                    conecta.rs.getString("qtd_horas"),});
            } while (conecta.rs.next());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conecta.desconecta();
        }

        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        tabela.setModel((TableModel) modelo);
        tabela.getColumnModel().getColumn(0).setMaxWidth(0);
        tabela.getColumnModel().getColumn(0).setMinWidth(0);
        tabela.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        tabela.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        //Product
        tabela.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    private void fill_combo(String SQL) {
        PreencherCbo pec = new PreencherCbo();
        pec.preencherCombo(SQL, combo1, "nome");
        pec.preencherCombo(SQL, combo2, "nome");
        pec.preencherCombo(SQL, combo3, "nome");
        pec.preencherCombo(SQL, combo4, "nome");
        pec.preencherCombo(SQL, combo5, "nome");
        pec.preencherCombo(SQL, combo6, "nome");
    }

    int horas_total;

    private void sum_hours_total() {
        conecta.conexao();
        try {
            conecta.executaSQL("SELECT SUM(qtd_horas) AS horas FROM funcionarios");
            conecta.rs.first();
            horas_total = conecta.rs.getInt("horas");
            String total = "Total: " + conecta.rs.getString("horas") + " horas acumuladas";
            jLabel4.setText(total);
        } catch (Exception e) {
            e.printStackTrace();
        }
        conecta.desconecta();
    }

    public void folga_concedida(int id) {
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("UPDATE funcionarios SET qtd_horas= ? WHERE id=? ");
            pst.setInt(1, horas_atuais - 12);
            pst.setInt(2, id);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Alterado com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar apartamento. Tente Novamente!");
        } finally {
            conecta.desconecta();
        }
    }

    public void add_horas(int id) {
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("UPDATE funcionarios SET qtd_horas= ? WHERE id=? ");
            pst.setInt(1, horas_atuais + 12);
            pst.setInt(2, id);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Alterado com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar apartamento. Tente Novamente!");
        } finally {
            conecta.desconecta();
        }
    }

}
