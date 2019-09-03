package com.kingaspx.util;

import static com.kingaspx.util.UtilClass.PANDAPATH;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ThemeClass {

    public String read_theme() {
        String theme = null;
        String filename = PANDAPATH + "/theme.panda";
        try {
            FileReader arq = new FileReader(filename);
            BufferedReader readArq = new BufferedReader(arq);
            String line = readArq.readLine();
            theme = line;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return theme;
    }
    
    public void save_theme(String theme) {
        FileWriter arq = null;
        try {
            arq = new FileWriter(new File(PANDAPATH + "/" + "theme.panda"));
            PrintWriter writeArq = new PrintWriter(arq);
            writeArq.printf(theme);
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
