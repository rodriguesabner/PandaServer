package com.kingaspx.util;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JDialog;
import javax.swing.JLabel;
import keeptoo.KGradientPanel;

public class Toast {

    String message;

    public Toast(String message) {
        this.message = message;
        ToastMessage tMessage = new ToastMessage(message, 3000);
        tMessage.setVisible(true);
    }

    public class ToastMessage extends JDialog {

        int miliseconds;

        public ToastMessage(String toastString, int time) {
            this.miliseconds = time;
            setUndecorated(true);
            getContentPane().setLayout(new BorderLayout(0, 0));

            KGradientPanel panel = new KGradientPanel();
            panel.setkStartColor(new Color(6, 190, 182));
            panel.setkEndColor(new Color(71, 177, 191));
            panel.setOpaque(false);
            getContentPane().add(panel, BorderLayout.CENTER);
            setBackground(new Color(0, 0, 0, 0));

            JLabel toastLabel = new JLabel("");
            toastLabel.setText(toastString);
            toastLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
            toastLabel.setForeground(Color.WHITE);

            setBounds(100, 100, toastLabel.getPreferredSize().width + 20, 31);

            setAlwaysOnTop(true);

            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            int y = dim.height / 2 - getSize().height / 2;
            int half = y / 2;
            setLocation(dim.width / 2 - getSize().width / 2, y + half);

            panel.add(toastLabel);
            setVisible(false);

            new Thread() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(miliseconds);
                        dispose();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }.start();

        }

    }

}
