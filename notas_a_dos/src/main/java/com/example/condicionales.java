package com.example;

public class condicionales {
    // Crea un programa que diga si un numero es par o impar
    int numero = 1;

    public void verificarNumero() {
        if (numero % 2 == 0) {
            System.out.println("Si es par jejots"); 
        } else {
            System.out.println("Es im-par");
           }
    }

    public void diaSemana(int dia) {
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("SabaGOD");
                break;
            default:
                break;
        }
    }
    
    public void longText(String txt) {
        System.out.println(txt.length());
    }

    // int[] numeros = new int[100];
}