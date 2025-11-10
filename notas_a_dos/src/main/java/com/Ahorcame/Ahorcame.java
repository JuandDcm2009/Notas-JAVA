package com.Ahorcame;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;

public class Ahorcame {
    public String secretWord, boardWord;
    public String[] words;   
    public int tries;
    public int mistakes;
    
    public Ahorcame() {
        words = new String[]{
            "Awacate", 
            "tom-mate", 
            "guanvana"
        };

        boardWord = "";

    }

    public void start() {
        var r = new Random();
        secretWord = words[r.nextInt(words.length)];
        boardWord = "";

        String flag = "_ ";
        for (int a = 0; a < secretWord.length(); a++) {
            boardWord += flag;
        }
        System.out.println(secretWord);
        System.out.println(boardWord);

    }

    public void eject(Scanner scan) {

        while (true) {
            System.out.println(menu());
            var letra = scan.next();
            var temporal = "";

            if (secretWord.contains(letra)) {
                var letras = boardWord.replace(" ", "").toCharArray();
                
                for(int a = 0; a < secretWord.length(); a++) {

                    if (String.valueOf(secretWord.charAt(a)).equals(letra)) {
                        letras[a] = letra.charAt(0);
                    }
                }

                for(char c : letras){
                    temporal += String.valueOf(c + " ");
                }

                boardWord = temporal;
            }
            else {
                mistakes += 1;
                System.out.println("\n AHH TAMAL!: EN ALGO NI MODO \n");
             }
        }
    }

    public String menu() {
        StringBuilder strBuild = new StringBuilder();
        strBuild.append("\n ____________________________");
        strBuild.append("\n|");
        strBuild.append("\n|       AHORCAME             ");
        strBuild.append("\n|");
        strBuild.append("\n| >   Intentos restantes: " + tries);
        strBuild.append("\n| >   Errores :" + mistakes );
        strBuild.append("\n| >   " + boardWord);
        strBuild.append("\n|");
        strBuild.append("____________________________");
        return strBuild.toString();
    }
    
}
