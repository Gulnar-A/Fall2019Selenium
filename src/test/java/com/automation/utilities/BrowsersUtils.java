package com.automation.utilities;

public class BrowsersUtils {

        public static void wait(int seconds){
            try{
                Thread.sleep(1000*seconds);

            }catch (InterruptedException e){
                e.printStackTrace();
        }
    }
}
