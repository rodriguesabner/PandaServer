package com.kingaspx.menu;

import com.kingaspx.util.NGrokDAO;
import com.kingaspx.util.NGrokModel;
import com.kingaspx.util.RoundFrame;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URI;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

public class Dashboard extends javax.swing.JFrame {

    int xMouse = 0, yMouse = 0;
    NGrokDAO dao = new NGrokDAO();

    public Dashboard() {
        initComponents();

        setIcon();
        new RoundFrame().corner(this, getWidth(), getHeight(), 10, 10);

        pack();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice defaultScreen = ge.getDefaultScreenDevice();
        Rectangle rect = defaultScreen.getDefaultConfiguration().getBounds();
        int x = (int) rect.getMaxX() - this.getWidth() - 10;
        int y = (int) rect.getMaxY() - this.getHeight() - 50;
        setLocation(x, y);

        refresh();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        prot_txt = new javax.swing.JLabel();
        panel_status = new javax.swing.JPanel();
        status_icon = new keeptoo.KButton();
        status_txt = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        server_btn = new keeptoo.KButton();
        jSeparator2 = new javax.swing.JSeparator();
        ip_txt = new javax.swing.JButton();
        close_btn = new keeptoo.KButton();
        settings_btn1 = new keeptoo.KButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        jLabel1.setFont(new java.awt.Font("Montserrat Light", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(12, 29, 46));
        jLabel1.setText("Server");
        kGradientPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 70, 30));

        jLabel3.setFont(new java.awt.Font("Montserrat Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(72, 72, 72));
        jLabel3.setText("Protocol");
        kGradientPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 70, 20));

        jLabel4.setFont(new java.awt.Font("Montserrat Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(72, 72, 72));
        jLabel4.setText("IP Address");
        kGradientPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));

        prot_txt.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        prot_txt.setForeground(new java.awt.Color(23, 23, 23));
        prot_txt.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        kGradientPanel2.add(prot_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 150, 20));

        panel_status.setBackground(new java.awt.Color(254, 220, 224));
        panel_status.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        status_icon.setEnabled(false);
        status_icon.setkAllowGradient(false);
        status_icon.setkAllowTab(false);
        status_icon.setkBackGroundColor(new java.awt.Color(226, 34, 55));
        status_icon.setkHoverColor(new java.awt.Color(226, 34, 55));
        status_icon.setkPressedColor(new java.awt.Color(226, 34, 55));
        status_icon.setOpaque(false);
        panel_status.add(status_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 10, 10));

        status_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        status_txt.setForeground(new java.awt.Color(226, 34, 55));
        status_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        status_txt.setText("Inactive");
        panel_status.add(status_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 50, 30));

        kGradientPanel2.add(panel_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 90, 30));

        jSeparator1.setForeground(new java.awt.Color(234, 234, 234));
        kGradientPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 310, 10));

        server_btn.setText("Start Server");
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
        kGradientPanel2.add(server_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 310, 30));
        server_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jSeparator2.setForeground(new java.awt.Color(234, 234, 234));
        kGradientPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 310, 10));

        ip_txt.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        ip_txt.setForeground(new java.awt.Color(23, 23, 23));
        ip_txt.setContentAreaFilled(false);
        ip_txt.setFocusPainted(false);
        ip_txt.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        ip_txt.setMargin(new java.awt.Insets(0, 0, 0, 0));
        ip_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ip_txtActionPerformed(evt);
            }
        });
        kGradientPanel2.add(ip_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 69, 220, 20));

        close_btn.setToolTipText("Close");
        close_btn.setkAllowGradient(false);
        close_btn.setkAllowTab(false);
        close_btn.setkBackGroundColor(new java.awt.Color(226, 34, 55));
        close_btn.setkHoverColor(new java.awt.Color(226, 34, 55));
        close_btn.setkPressedColor(new java.awt.Color(226, 34, 55));
        close_btn.setOpaque(false);
        close_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_btnActionPerformed(evt);
            }
        });
        kGradientPanel2.add(close_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 30, 10));
        close_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        settings_btn1.setToolTipText("Settings");
        settings_btn1.setkAllowGradient(false);
        settings_btn1.setkAllowTab(false);
        settings_btn1.setkBackGroundColor(new java.awt.Color(47, 47, 47));
        settings_btn1.setkHoverColor(new java.awt.Color(47, 47, 47));
        settings_btn1.setkPressedColor(new java.awt.Color(47, 47, 47));
        settings_btn1.setOpaque(false);
        settings_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settings_btn1ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(settings_btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 30, 10));
        settings_btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel2.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(12, 29, 46));
        jLabel2.setText("Panda");
        kGradientPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        getContentPane().add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 220));

        setBounds(0, 0, 350, 220);
    }// </editor-fold>//GEN-END:initComponents

    private void kGradientPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel2MousePressed
        setOpacity((float) 0.8);
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_kGradientPanel2MousePressed

    private void kGradientPanel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel2MouseReleased
        setOpacity((float) 1.0);
    }//GEN-LAST:event_kGradientPanel2MouseReleased

    private void kGradientPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_kGradientPanel2MouseDragged

    boolean server_status = false;

    private void server_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_server_btnActionPerformed
        try {
            if (server_status == false) {
                Runtime.getRuntime().exec("cmd /c start /B bot.bat");
            } else {
                if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    Runtime.getRuntime().exec("taskkill /F /IM ngrok.exe");
                } else {
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_server_btnActionPerformed

    private void ip_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ip_txtActionPerformed
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                desktop.browse(new URI(ip_txt.getText() + "/" + read_fwfile()));
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_ip_txtActionPerformed

    private void close_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_btnActionPerformed
        setVisible(false);
    }//GEN-LAST:event_close_btnActionPerformed

    private void settings_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settings_btn1ActionPerformed
        new Settings(this, true).setVisible(true);
    }//GEN-LAST:event_settings_btn1ActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton close_btn;
    private javax.swing.JButton ip_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JPanel panel_status;
    private javax.swing.JLabel prot_txt;
    private keeptoo.KButton server_btn;
    private keeptoo.KButton settings_btn1;
    private keeptoo.KButton status_icon;
    private javax.swing.JLabel status_txt;
    // End of variables declaration//GEN-END:variables

    private void refresh() {
        int delay = 1000, interval = 500;
        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                get_data();
            }
        }, delay, interval);
    }

    private void get_data() {
        List<NGrokModel> list = dao.get_url();
        try {
            for (int i = 0; i < list.size(); i++) {
                String ip = list.get(i).getPublic_url();
                String protocol = list.get(i).getProto();
                ip_txt.setText(ip);
                prot_txt.setText(protocol);

                if (ip.equals("Offline")) {
                    server_status = false;

                    ip_txt.setEnabled(false);
                    status_txt.setText("Inactive");

                    server_btn.setText("Start Server");

                    panel_status.setBackground(new Color(254, 220, 224));

                    status_txt.setForeground(new Color(226, 34, 55));
                    status_icon.setkBackGroundColor(new java.awt.Color(226, 34, 55));
                    status_icon.setkHoverColor(new java.awt.Color(226, 34, 55));
                    status_icon.setkPressedColor(new java.awt.Color(226, 34, 55));

                    server_btn.setkBackGroundColor(new java.awt.Color(94, 179, 138));
                    server_btn.setkHoverColor(new java.awt.Color(77, 153, 116));
                    server_btn.setkPressedColor(new java.awt.Color(63, 123, 94));
                } else {
                    server_status = true;
                    ip_txt.setEnabled(true);
                    status_txt.setText("Active");
                    server_btn.setText("Stop Server");

                    panel_status.setBackground(new Color(221, 238, 255));

                    status_txt.setForeground(new Color(24, 145, 252));
                    status_icon.setkBackGroundColor(new java.awt.Color(24, 145, 252));
                    status_icon.setkHoverColor(new java.awt.Color(24, 145, 252));
                    status_icon.setkPressedColor(new java.awt.Color(24, 145, 252));

                    server_btn.setkBackGroundColor(new java.awt.Color(179, 94, 94));
                    server_btn.setkHoverColor(new java.awt.Color(153, 77, 77));
                    server_btn.setkPressedColor(new java.awt.Color(123, 63, 63));
                }
            }
        } catch (Exception e) {
        }
    }

    private String read_fwfile() {
        String forwading = null;
        String filename = "forwading.panda";
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

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/kingaspx/icons/logo.png")));
    }

}
