package com.kingaspx.util;

import com.kingaspx.menu.Dashboard;
import com.kingaspx.menu.Settings;
import com.kingaspx.menu.SplashScreen;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.util.Locale;
import javax.swing.JOptionPane;

public class TrayIconPanda {
    
    public static void main(String[] args) {
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
        
        Locale.setDefault(new Locale("en", "US"));
        new SplashScreen().setVisible(true);
        Dashboard dash = new Dashboard();

        if (!SystemTray.isSupported()) {
            System.out.println("System tray is not supported!");
            return;
        }

        SystemTray systemTray = SystemTray.getSystemTray();
        URL url = System.class.getResource("/com/kingaspx/icons/small_logo.png");
        Image img = Toolkit.getDefaultToolkit().getImage(url);
        PopupMenu trayPopupMenu = new PopupMenu();
        TrayIcon trayIcon = new TrayIcon(img, "PandaControl", trayPopupMenu);

        MouseListener mouseListener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    dash.setVisible(true);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }

        };

        trayIcon.addMouseListener(mouseListener);

        MenuItem control_panel = new MenuItem("Open Control Panel");
        control_panel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Dashboard dash = new Dashboard();
                dash.setVisible(true);
            }
        });
        MenuItem shutdown = new MenuItem("Shutdown Server");
        shutdown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        Runtime.getRuntime().exec("taskkill /F /IM ngrok.exe");
                    } else {
                    }
                } catch (Exception ex) {
                }
            }
        });

        MenuItem settings = new MenuItem("Settings");
        settings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Settings(null, true).setVisible(true);
            }
        });

        MenuItem exit = new MenuItem("Exit PandaControl");
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        trayPopupMenu.add(control_panel);
        trayPopupMenu.add(settings);
        trayPopupMenu.add(shutdown);
        trayPopupMenu.addSeparator();
        trayPopupMenu.add(exit);

        try {
            systemTray.add(trayIcon);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
