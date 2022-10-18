package com.cydeo.Z_utilities;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class FindLocationOfMouse {

    public static void main(String[] args) {
        mouseLocationSecond(10);
        //  10 second mouse tracking system
    }
        public static void mouseLocationSecond (int number){
        while(number-->0) {
            BrowserUtils.sleep(1);
            int x = (int) MouseInfo.getPointerInfo().getLocation().getX();
            int y = (int) MouseInfo.getPointerInfo().getLocation().getY();
            System.out.println("X:" + x + ", Y:" + y);
        }
    }
}
