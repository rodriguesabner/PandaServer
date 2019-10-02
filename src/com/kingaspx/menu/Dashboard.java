package com.kingaspx.menu;

import static com.kingaspx.util.ColorClass.BLACK;
import static com.kingaspx.util.ColorClass.BLUE;
import static com.kingaspx.util.ColorClass.DARK_GRAY;
import static com.kingaspx.util.ColorClass.LIGHT_GRAY;
import static com.kingaspx.util.ColorClass.MIDDLE_GRAY;
import static com.kingaspx.util.ColorClass.PINK;
import static com.kingaspx.util.ColorClass.WHITE;
import com.kingaspx.util.NGrokDAO;
import com.kingaspx.util.NGrokModel;
import com.kingaspx.util.RoundFrame;
import com.kingaspx.util.ThemeClass;
import com.kingaspx.util.Toast;
import static com.kingaspx.util.UtilClass.ARCH;
import static com.kingaspx.util.UtilClass.OS;
import static com.kingaspx.util.UtilClass.PANDAPATH;
import static com.kingaspx.util.UtilClass.PROCESSORS;
import static com.kingaspx.util.UtilClass.PROCESS_NAME;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

public class Dashboard extends javax.swing.JFrame {

    NGrokDAO dao = new NGrokDAO();
    ThemeClass tClass = new ThemeClass();

    int xMouse = 0, yMouse = 0;

    public Dashboard() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
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
        set_theme();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel3 = new keeptoo.KGradientPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        prot_txt = new javax.swing.JLabel();
        fw_txt = new javax.swing.JLabel();
        ip_txt = new javax.swing.JButton();
        server_btn = new keeptoo.KButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panel_status = new javax.swing.JPanel();
        status_icon = new keeptoo.KButton();
        status_txt = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        os_txt = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        arch_txt = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        core_txt = new javax.swing.JLabel();
        settings_btn1 = new keeptoo.KButton();
        close_btn = new keeptoo.KButton();
        change_theme_btn = new keeptoo.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel3.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel3.setkBorderRadius(5);
        kGradientPanel3.setkFillBackground(false);
        kGradientPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Montserrat Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(78, 78, 78));
        jLabel5.setText("IP Address");
        kGradientPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 20));

        jSeparator3.setForeground(new java.awt.Color(234, 234, 234));
        kGradientPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 300, 10));

        jLabel3.setFont(new java.awt.Font("Montserrat Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(78, 78, 78));
        jLabel3.setText("Protocol");
        kGradientPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 70, 20));

        jLabel9.setFont(new java.awt.Font("Montserrat Light", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(78, 78, 78));
        jLabel9.setText("Forwarding");
        kGradientPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 100, 20));

        jSeparator5.setForeground(new java.awt.Color(234, 234, 234));
        kGradientPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 300, 10));

        jSeparator1.setForeground(new java.awt.Color(234, 234, 234));
        kGradientPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 300, 10));

        prot_txt.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        prot_txt.setForeground(new java.awt.Color(47, 47, 47));
        prot_txt.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        kGradientPanel3.add(prot_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 140, 20));

        fw_txt.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        fw_txt.setForeground(new java.awt.Color(47, 47, 47));
        fw_txt.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        kGradientPanel3.add(fw_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 140, 20));

        ip_txt.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        ip_txt.setForeground(new java.awt.Color(47, 47, 47));
        ip_txt.setContentAreaFilled(false);
        ip_txt.setFocusPainted(false);
        ip_txt.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        ip_txt.setMargin(new java.awt.Insets(0, 0, 0, 0));
        ip_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ip_txtActionPerformed(evt);
            }
        });
        kGradientPanel3.add(ip_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 210, 20));

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
        kGradientPanel3.add(server_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 280, 30));
        server_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel2.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(47, 47, 47));
        jLabel2.setText("Panda");
        kGradientPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jLabel1.setFont(new java.awt.Font("Montserrat Light", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(47, 47, 47));
        jLabel1.setText("Control");
        kGradientPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 70, 30));

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

        kGradientPanel3.add(panel_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 90, -1));

        getContentPane().add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 320, 230));

        kGradientPanel1.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkBorderRadius(5);
        kGradientPanel1.setkFillBackground(false);
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Montserrat Light", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(47, 47, 47));
        jLabel7.setText("Specifications");
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 150, 30));

        jLabel8.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(47, 47, 47));
        jLabel8.setText("OS");
        kGradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jLabel4.setFont(new java.awt.Font("Montserrat Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(78, 78, 78));
        jLabel4.setText("OS");
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 20));

        os_txt.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        os_txt.setForeground(new java.awt.Color(47, 47, 47));
        os_txt.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        kGradientPanel1.add(os_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 140, 20));

        jSeparator2.setForeground(new java.awt.Color(234, 234, 234));
        kGradientPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 300, 10));

        jLabel6.setFont(new java.awt.Font("Montserrat Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(78, 78, 78));
        jLabel6.setText("Architeture");
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 20));

        arch_txt.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        arch_txt.setForeground(new java.awt.Color(47, 47, 47));
        arch_txt.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        kGradientPanel1.add(arch_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 140, 20));

        jSeparator4.setForeground(new java.awt.Color(234, 234, 234));
        kGradientPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 300, 10));

        jLabel11.setFont(new java.awt.Font("Montserrat Light", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(78, 78, 78));
        jLabel11.setText("CPU");
        kGradientPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 20));

        jSeparator7.setForeground(new java.awt.Color(234, 234, 234));
        kGradientPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 300, 10));

        core_txt.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        core_txt.setForeground(new java.awt.Color(47, 47, 47));
        core_txt.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        kGradientPanel1.add(core_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 140, 20));

        settings_btn1.setToolTipText("Settings");
        settings_btn1.setkAllowGradient(false);
        settings_btn1.setkAllowTab(false);
        settings_btn1.setkBackGroundColor(new java.awt.Color(56, 140, 228));
        settings_btn1.setkHoverColor(new java.awt.Color(56, 140, 228));
        settings_btn1.setkPressedColor(new java.awt.Color(56, 140, 228));
        settings_btn1.setOpaque(false);
        settings_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settings_btn1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(settings_btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 10, 10));
        settings_btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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
        kGradientPanel1.add(close_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 10, 10));
        close_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        change_theme_btn.setToolTipText("Change Theme");
        change_theme_btn.setkAllowGradient(false);
        change_theme_btn.setkAllowTab(false);
        change_theme_btn.setkBackGroundColor(new java.awt.Color(47, 47, 47));
        change_theme_btn.setkHoverColor(new java.awt.Color(47, 47, 47));
        change_theme_btn.setkPressedColor(new java.awt.Color(47, 47, 47));
        change_theme_btn.setOpaque(false);
        change_theme_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_theme_btnActionPerformed(evt);
            }
        });
        kGradientPanel1.add(change_theme_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 40, 10));
        settings_btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 320, 180));

        setSize(new java.awt.Dimension(342, 439));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    boolean server_status = false;

    private void server_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_server_btnActionPerformed
        try {
            if (server_status == false) {
                if (ARCH.equals("x86")) {
                    Runtime.getRuntime().exec("cmd /c start /B start_x86.bat"); //32 bits
                } else {
                    Runtime.getRuntime().exec("cmd /c start /B start_64.bat"); //64
                }
            } else {
                if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    Runtime.getRuntime().exec("taskkill /F /IM " + PROCESS_NAME + ".exe");
                } else {
                }
            }
        } catch (HeadlessException | IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
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
        copy_clipboard();
    }//GEN-LAST:event_ip_txtActionPerformed

    private void copy_clipboard() {
        String str = ip_txt.getText();
        StringSelection strSelection = new StringSelection(str);
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        clip.setContents(strSelection, null);
        new Toast("Copied to Clipboard");
    }

    private void close_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_btnActionPerformed
        setVisible(false);
    }//GEN-LAST:event_close_btnActionPerformed

    private void settings_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settings_btn1ActionPerformed
        new Settings(this, true).setVisible(true);
    }//GEN-LAST:event_settings_btn1ActionPerformed

    boolean btn_theme_pressed = false;

    private void change_theme_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_theme_btnActionPerformed
        if (btn_theme_pressed == false) {
            setLightTheme();
            btn_theme_pressed = true;
        } else {
            setDarkTheme();
            btn_theme_pressed = false;
        }
    }//GEN-LAST:event_change_theme_btnActionPerformed

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
    private javax.swing.JLabel arch_txt;
    private keeptoo.KButton change_theme_btn;
    private keeptoo.KButton close_btn;
    private javax.swing.JLabel core_txt;
    private javax.swing.JLabel fw_txt;
    private javax.swing.JButton ip_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel3;
    private javax.swing.JLabel os_txt;
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
                set_data();
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

    private void set_data() {
        os_txt.setText(OS);
        arch_txt.setText(ARCH);
        fw_txt.setText(read_fwfile());
        core_txt.setText(String.valueOf(PROCESSORS));
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

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/kingaspx/icons/logo.png")));
    }

    private void setDarkTheme() {
        kGradientPanel1.setBackground(DARK_GRAY);
        kGradientPanel1.setkStartColor(WHITE);
        kGradientPanel1.setkEndColor(new Color(35, 224, 77));

        kGradientPanel3.setBackground(DARK_GRAY);
        kGradientPanel3.setkStartColor(WHITE);
        kGradientPanel3.setkEndColor(new Color(35, 224, 77));

        //1st column
        jSeparator2.setForeground(DARK_GRAY);
        jSeparator4.setForeground(DARK_GRAY);
        jSeparator7.setForeground(DARK_GRAY);

        jSeparator2.setBackground(MIDDLE_GRAY);
        jSeparator4.setBackground(MIDDLE_GRAY);
        jSeparator7.setBackground(MIDDLE_GRAY);

        //Title
        jLabel8.setForeground(WHITE);
        jLabel7.setForeground(WHITE);

        //Left Text
        jLabel4.setForeground(WHITE);
        jLabel6.setForeground(WHITE);
        jLabel11.setForeground(WHITE);

        //Right Text
        os_txt.setForeground(WHITE);
        arch_txt.setForeground(WHITE);
        core_txt.setForeground(WHITE);

        //2st column
        jSeparator3.setForeground(DARK_GRAY);
        jSeparator1.setForeground(DARK_GRAY);
        jSeparator5.setForeground(DARK_GRAY);

        jSeparator3.setBackground(MIDDLE_GRAY);
        jSeparator1.setBackground(MIDDLE_GRAY);
        jSeparator5.setBackground(MIDDLE_GRAY);

        //Title
        jLabel2.setForeground(WHITE);
        jLabel1.setForeground(WHITE);

        //Left Text
        jLabel5.setForeground(WHITE);
        jLabel3.setForeground(WHITE);
        jLabel9.setForeground(WHITE);

        //Right Text
        ip_txt.setForeground(WHITE);
        prot_txt.setForeground(WHITE);
        fw_txt.setForeground(WHITE);

        change_theme_btn.setkBackGroundColor(WHITE);
        change_theme_btn.setkHoverColor(WHITE);
        change_theme_btn.setkPressedColor(WHITE);

        tClass.save_theme("Dark");
    }

    private void setLightTheme() {
        kGradientPanel1.setBackground(WHITE);
        kGradientPanel1.setkStartColor(PINK);
        kGradientPanel1.setkEndColor(BLUE);

        kGradientPanel3.setBackground(WHITE);
        kGradientPanel3.setkStartColor(PINK);
        kGradientPanel3.setkEndColor(BLUE);

        //1st column
        jSeparator2.setForeground(LIGHT_GRAY);
        jSeparator4.setForeground(LIGHT_GRAY);
        jSeparator7.setForeground(LIGHT_GRAY);

        jSeparator2.setBackground(WHITE);
        jSeparator4.setBackground(WHITE);
        jSeparator7.setBackground(WHITE);

        //Title
        jLabel8.setForeground(BLACK);
        jLabel7.setForeground(BLACK);

        //Left Text
        jLabel4.setForeground(DARK_GRAY);
        jLabel6.setForeground(DARK_GRAY);
        jLabel11.setForeground(DARK_GRAY);

        //Right Text
        os_txt.setForeground(BLACK);
        arch_txt.setForeground(BLACK);
        core_txt.setForeground(BLACK);

        //2st column
        jSeparator3.setForeground(LIGHT_GRAY);
        jSeparator1.setForeground(LIGHT_GRAY);
        jSeparator5.setForeground(LIGHT_GRAY);

        jSeparator3.setBackground(WHITE);
        jSeparator1.setBackground(WHITE);
        jSeparator5.setBackground(WHITE);

        //Title
        jLabel2.setForeground(BLACK);
        jLabel1.setForeground(BLACK);

        //Left Text
        jLabel5.setForeground(DARK_GRAY);
        jLabel3.setForeground(DARK_GRAY);
        jLabel9.setForeground(DARK_GRAY);

        //Right Text
        ip_txt.setForeground(BLACK);
        prot_txt.setForeground(BLACK);
        fw_txt.setForeground(BLACK);

        change_theme_btn.setkBackGroundColor(BLACK);
        change_theme_btn.setkHoverColor(BLACK);
        change_theme_btn.setkPressedColor(BLACK);

        tClass.save_theme("Light");
    }

    String theme = tClass.read_theme();

    private void set_theme() {
        if (theme.equals("Dark")) {
            setDarkTheme();
        } else {
            setLightTheme();
        }
    }

}
