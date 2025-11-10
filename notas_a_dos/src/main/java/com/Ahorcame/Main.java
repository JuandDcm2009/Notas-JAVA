package com.Ahorcame;
import java.util.Scanner;


public class Main {
    public static void main(String[] agrs) {
        Scanner scan = new Scanner(System.in);
        Boolean startApp = true;
        Ahorcame Ahorcado = new Ahorcame();

        while (startApp) {
            switch (scan.nextInt()) {
                case 1:
                    Ahorcado.start();
                    Ahorcado.eject(scan);
                    break;
            
                default:
                    break;
            }
        }
        scan.close();

    }
}
