package com.kingaspx.menu;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;

public class SplashScreen extends javax.swing.JFrame {

    public SplashScreen() {
        initComponents();
        setIcon();
        setBackground(new Color(0, 0, 0, 0));
        ImageIcon icon = new ImageIcon(new ImageIcon(getClass().getResource("/com/kingaspx/icons/logo_full.png")).getImage().getScaledInstance(img_lbl.getWidth() + 500, img_lbl.getHeight() + 400, Image.SCALE_SMOOTH));
        img_lbl.setIcon(icon);
        smoothJFrame();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        img_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(img_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 800, 620));

        setSize(new java.awt.Dimension(800, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img_lbl;
    // End of variables declaration//GEN-END:variables

    public void smoothJFrame() {
        new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    double opacidade = 1.0;
                    DecimalFormat df = new DecimalFormat("#.#");
                    while (opacidade >= 0.1) {
                        opacidade -= 0.1;
                        Thread.sleep(100);
                        setOpacity(Float.valueOf(df.format(opacidade)));
                        if (Float.valueOf(df.format(opacidade)) == 0.0) {
                            dispose();
                        }

                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }

        }.start();
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/kingaspx/icons/logo.png")));
    }

}
