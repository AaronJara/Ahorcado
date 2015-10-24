/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author Aaron Jara Molina
 */
public class Palabras { //Inicia mi clase llamda palabras //
    
    //Declaro mis variables//
    String palabra[] = {"naranja", "manzana", "melocoton", "sandia", "mango", "pera"};
 
    public void Game() {
        int var;
        var = (int) (Math.random() * 10);
        String resp;
        String ingresado = "";

        char tecla[] = new char[palabra[var].length()];

        String soga[] = new String[8];

        soga[7] = "-!";
        soga[6] = "-!\6";
        soga[5] = "-!\0";
        soga[4] = "-!\0 \n !";
        soga[3] = "-!\0 \n /!\\";
        soga[2] = "-!\0 \n /!\\";
        soga[1] = "-!\0 \n /!\\\n";
        soga[1] = "-!\0 \n /!\\\n//\\";

        for (int i = 0; i < palabra[var].length(); i++) {
            tecla[i] = '_';
        }
        int contador = 8;
        int contador2 = 0;
        int salir = 0;

        System.out.println("              Bienvenido  al Juego            ");
        System.out.println("-----------------------------------");
        System.out.println("               Reglas             ");
        System.out.println("-----------------------------------");
        System.out.println("1.  Tiene 8 intentos para adivinar ");
        System.out.println("2. Utilize letras solo minusculas ");

        /*
         for (int x=0;x<palabra[var].length();x++)
         {
				
         System.out.println(palabra[x]+" ");
				
				
         }
         */
        System.out.println("");
        System.out.println("");
        System.out.println("");

        while (contador > 0) {
            resp = JOptionPane.showInputDialog("Ingrese una letra en minuscula:");
            ingresado = ingresado + resp.charAt(0);

            System.out.println("Las letras ingresadas son:" + ingresado);
            System.out.println("");

            for (int j = 0; j < palabra[var].length(); j++) {

                if (resp.charAt(0) == palabra[var].charAt(j)) {
                    tecla[j] = palabra[var].charAt(j);
                    contador2++;
                }

            }

            System.out.println("");
            if (contador2 < 1) {
                contador--;
                System.out.println("");
                System.out.println("Esa letra no existe en esta palabra, intenta de nuevo ");
                System.out.println("");
                System.out.println("Intentons restanes:" + contador + "intentos");
                System.out.println("");
                System.out.println(soga[contador]);

                contador2 = 0;
            } else {
                System.out.println("Felicidades esta letra esta en la palabra");
                System.out.println("ingresa otra letra");
                contador2 = 0;

            }

            for (int s = 0; s < palabra[var].length(); s++) {
                System.out.print(tecla[s] + " ");

            }
            System.out.println("");

            for (int d = 0; d < palabra[var].length(); d++) {
                if (palabra[var].charAt(d) == tecla[d]) {
                    salir++;
                } else {

                    salir = 0;
                }

                if (salir == palabra[var].length()) {
                    System.out.println("");
                    System.out.println("**********************************************");
                    System.out.println("              Usted Ha Ganado                   ");
                    System.out.println("**********************************************");
                    contador = 0;
                    contador2 = 0;

                }

            }

        }

        if (salir < palabra[var].length()) {

            System.out.println("");
            System.out.println("********************************");
            System.out.println("ha perdido , Gracias por jugar");
            System.out.println("*********************************");

        }

    }

}
