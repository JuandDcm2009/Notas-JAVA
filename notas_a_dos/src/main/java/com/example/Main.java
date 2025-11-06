package com.example;

public class Main {

    //Variables Publicas
    public static final int CONSTANTE = 1;
    public static float ayjuanjooooo = 0.5f;

    public static void main(String[] args) {
        System.out.println("Hello world!");
        
        var Juan = "nombre";
        Integer age = 2;
        
        System.out.println("Hello " + Juan); // String + Concatenacion
        System.out.println(1); // Integer
        System.out.println(123L); //Biginteger
        System.out.println(true); // Boolean
        System.out.println(0.4f); // Float
        System.out.println(0.4); // Double
        System.out.println('A'); // char

        //Variables tipadas por JVM
        // var myVar = 1; //Tipado automatico
        // final var myVar2 = 2; // Variable Constante 

        // Obtener Tipo de Dato
        System.out.println(age.getClass().getSimpleName()); 

        // Array
        Integer[] numeros = {1,2,3,4,5,6};
        System.out.println(numeros[0]); // Obtener Valores de un Array.

        int dia = 0;
        actividades(dia);
        System.out.println(dia);
        actividades(++dia);
        System.out.println(dia);
        actividades(dia++); 
        System.out.println(dia);
        

        System.out.println(1+2); // sumar
        System.out.println(1-2); // restar
        System.out.println(1*2); // multiplicar
        System.out.println(1/2); // dividir
        System.out.println(10%2); // Modular
        System.out.println(Math.pow(2, 5)); // Operaciones compejas matematicas.

        // Llamar instancias
        condicionales instancia = new condicionales();
        instancia.verificarNumero();
        instancia.longText("lorem10");
        instancia.diaSemana(7);

    }

    // Funciones

    public static void actividades(int dia) {
        String[] actividades = {"Ir a la iglesia", "Nada", "Tambien", "venir a campus", "venir a campus", "No volver a campus.", "Un cachorro feli feli feli"};
        
        // Condicionales
        if(dia > 7) {
            return;
        } else {
            // algo
        }
        System.out.println("cosas por nacer");
        System.out.println(actividades[dia]);

        
    }

}







