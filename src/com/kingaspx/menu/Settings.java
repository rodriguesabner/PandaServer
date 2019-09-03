package com.kingaspx.menu;

import com.kingaspx.util.RoundFrame;
import static com.kingaspx.util.UtilClass.FILENAME_BAT;
import static com.kingaspx.util.UtilClass.PANDAPATH;
import static com.kingaspx.util.UtilClass.USERPROFILE_PATH;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Settings extends javax.swing.JDialog {

    public Settings(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        new RoundFrame().corner(this, getWidth(), getHeight(), 10, 10);
        read_botfile();
        fw_lbl.setText(read_fwfile());
        fw_txt.setText(read_fwfile());
        filename_bat_lbl.setText(FILENAME_BAT + ".bat");
        authtoken_txt.setText(read_authToken());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel2 = new keeptoo.KGradientPanel();
        filename_bat_lbl = new javax.swing.JLabel();
        server_btn = new keeptoo.KButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        bot_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        close_btn = new keeptoo.KButton();
        jLabel6 = new javax.swing.JLabel();
        fw_lbl = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        fw_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        authtoken_txt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel2.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setkFillBackground(false);
        kGradientPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                kGradientPanel2MouseDragged(evt);
            }
        });
        kGradientPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kGradientPanel2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                kGradientPanel2MouseReleased(evt);
            }
        });
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        filename_bat_lbl.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        filename_bat_lbl.setForeground(new java.awt.Color(72, 72, 72));
        filename_bat_lbl.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        kGradientPanel2.add(filename_bat_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 70, 170, 20));

        server_btn.setText("Save");
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
        kGradientPanel2.add(server_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 130, 30));
        server_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jSeparator2.setForeground(new java.awt.Color(234, 234, 234));
        kGradientPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 400, 10));

        jLabel2.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(12, 29, 46));
        jLabel2.setText("Settings");
        kGradientPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        jLabel1.setFont(new java.awt.Font("Montserrat Light", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(12, 29, 46));
        jLabel1.setText("Control");
        kGradientPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 80, 30));

        jLabel5.setFont(new java.awt.Font("Montserrat Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(72, 72, 72));
        jLabel5.setText("File");
        kGradientPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));

        kGradientPanel1.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkEndColor(new java.awt.Color(103, 204, 161));
        kGradientPanel1.setkFillBackground(false);
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 131, 97));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bot_txt.setBorder(null);
        bot_txt.setOpaque(false);
        kGradientPanel1.add(bot_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 400, 30));

        kGradientPanel2.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 420, 30));

        jLabel3.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(12, 29, 46));
        jLabel3.setText("Panda");
        kGradientPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, 30));

        close_btn.setText("Close");
        close_btn.setkAllowGradient(false);
        close_btn.setkAllowTab(false);
        close_btn.setkBackGroundColor(new java.awt.Color(179, 94, 94));
        close_btn.setkHoverColor(new java.awt.Color(194, 51, 66));
        close_btn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        close_btn.setkPressedColor(new java.awt.Color(153, 58, 68));
        close_btn.setOpaque(false);
        close_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_btnActionPerformed(evt);
            }
        });
        kGradientPanel2.add(close_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 80, 30));
        close_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel6.setFont(new java.awt.Font("Montserrat Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(72, 72, 72));
        jLabel6.setText("Forwading");
        kGradientPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 20));

        fw_lbl.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        fw_lbl.setForeground(new java.awt.Color(72, 72, 72));
        fw_lbl.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        kGradientPanel2.add(fw_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 130, 20));

        jSeparator3.setForeground(new java.awt.Color(234, 234, 234));
        kGradientPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 400, 10));

        kGradientPanel3.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel3.setkEndColor(new java.awt.Color(103, 204, 161));
        kGradientPanel3.setkFillBackground(false);
        kGradientPanel3.setkStartColor(new java.awt.Color(51, 131, 97));
        kGradientPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fw_txt.setBorder(null);
        fw_txt.setOpaque(false);
        kGradientPanel3.add(fw_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 400, 30));

        kGradientPanel2.add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 420, 30));

        jLabel7.setFont(new java.awt.Font("Montserrat Light", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(72, 72, 72));
        jLabel7.setText("Auth Token");
        kGradientPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, 20));

        jSeparator4.setForeground(new java.awt.Color(234, 234, 234));
        kGradientPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 400, 10));

        kGradientPanel4.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel4.setkEndColor(new java.awt.Color(103, 204, 161));
        kGradientPanel4.setkFillBackground(false);
        kGradientPanel4.setkStartColor(new java.awt.Color(51, 131, 97));
        kGradientPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        authtoken_txt.setBorder(null);
        authtoken_txt.setOpaque(false);
        kGradientPanel4.add(authtoken_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 400, 30));

        kGradientPanel2.add(kGradientPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 420, 30));

        getContentPane().add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 350));

        setSize(new java.awt.Dimension(440, 350));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void server_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_server_btnActionPerformed
        save_botfile();
        save_fwfile();
        save_authtoken();
        JOptionPane.showMessageDialog(null, "File Saved");
        dispose();
    }//GEN-LAST:event_server_btnActionPerformed

    private void kGradientPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel2MouseDragged

    }//GEN-LAST:event_kGradientPanel2MouseDragged

    private void kGradientPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel2MousePressed
    }//GEN-LAST:event_kGradientPanel2MousePressed

    private void kGradientPanel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel2MouseReleased
    }//GEN-LAST:event_kGradientPanel2MouseReleased

    private void close_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_btnActionPerformed
        dispose();
    }//GEN-LAST:event_close_btnActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Settings dialog = new Settings(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField authtoken_txt;
    private javax.swing.JTextField bot_txt;
    private keeptoo.KButton close_btn;
    private javax.swing.JLabel filename_bat_lbl;
    private javax.swing.JLabel fw_lbl;
    private javax.swing.JTextField fw_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private keeptoo.KButton server_btn;
    // End of variables declaration//GEN-END:variables

    private void read_botfile() {
        try {
            FileReader arq = new FileReader(PANDAPATH + "/" + FILENAME_BAT + ".bat");
            BufferedReader readArq = new BufferedReader(arq);
            String line = readArq.readLine();
            bot_txt.setText(line);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void save_botfile() {
        FileWriter arq = null;
        try {
            arq = new FileWriter(new File(PANDAPATH + "/" + FILENAME_BAT + ".bat"));
            PrintWriter writeArq = new PrintWriter(arq);
            writeArq.printf(bot_txt.getText());
            arq.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                arq.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static String read_fwfile() {
        String forwading = null;
        String filename = PANDAPATH + "/forwading.panda";
        try {
            FileReader arq = new FileReader(filename);
            BufferedReader readArq = new BufferedReader(arq);
            String line = readArq.readLine();
            forwading = line;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return forwading;
    }

    private void save_fwfile() {
        FileWriter arq = null;
        try {
            arq = new FileWriter(new File(PANDAPATH +"/forwading.panda"));
            PrintWriter writeArq = new PrintWriter(arq);
            writeArq.printf(fw_txt.getText());
            arq.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                arq.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static String read_authToken() {
        String token_resposta = null;
        String filename = USERPROFILE_PATH + "/.ngrok2/ngrok.yml";

        try {
            FileReader arq = new FileReader(filename);
            BufferedReader readArq = new BufferedReader(arq);
            String line = readArq.readLine();

            Pattern p = Pattern.compile("\\s(.*)");
            Matcher response = p.matcher(line);

            if (response.find()) {
                token_resposta = response.group(0);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return token_resposta.replace(" ", "");
    }

    private void save_authtoken() {
        FileWriter arq = null;
        try {
            arq = new FileWriter(new File(USERPROFILE_PATH + "/.ngrok2/ngrok.yml"));
            PrintWriter writeArq = new PrintWriter(arq);
            writeArq.printf("authtoken: " + authtoken_txt.getText());
            arq.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                arq.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
