package com.kingaspx.util;

public class UtilClass {

    public static String OS = System.getProperty("os.name");
    public static String ARCH = System.getProperty("os.arch");
    public static String PROCESS_NAME = getProcess();
    public static String FILENAME_BAT = getFileBat();
    public static long PROCESSORS = Runtime.getRuntime().availableProcessors();
    public static String USERPROFILE_PATH = System.getProperty("user.home");

    private static String getProcess() {
        if (OS.equals("x86")) {
            PROCESS_NAME = "ngrok_x86";
        } else {
            PROCESS_NAME = "ngrok_64";
        }
        return PROCESS_NAME;
    }
    
    private static String getFileBat(){
         if (OS.equals("x86")) {
             FILENAME_BAT = "start_x86";
         } else {
              FILENAME_BAT = "start_64";
         }
         return FILENAME_BAT;
    }

}
