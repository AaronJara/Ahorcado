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
    String palabra[] = {"naranja","papaya","fresa","arandano","kiwi","arandano","cereza","piña","limon","mandarina","melon", "manzana", "melocoton", "sandia", "mango", "pera"};// Declaro las palabras que van a participar en el juego//
 
    public void Game() {
        int var; //Declaro la variable llamda var//
        var = (int) (Math.random() * 10); // Variable de tipo int para escoger una plabra aleatoria//
        String resp;//Variablede tipo string llamada resp
        String ingresado = "";// Variable tipo string llamda ingresado

        char tecla[] = new char[palabra[var].length()];//Arreglo tipo char

        String soga[] = new String[11];// Arreglo de tipo string lamdo soga
        /**
         * Asigno el valor de mis arreglos
         **/
        
        soga[10]= "______________________________________";
        soga[9] = "                                      |";
        soga[8] = "                                      |" ;
        soga[7] = "                                 --------"; 
        soga[6] = "                                 | o   o |";
        soga[5] = "                                 |   v   |";
        soga[4] = "                                 --------";
        soga[3] = "                                     |   ";
        soga[2] = "                                   / |\\   ";
        soga[1] = "                                     |   ";
        soga[0] = "                                    / \\  ";
        
        for (int i = 0; i < palabra[var].length(); i++) { // Ciclo que revela la longitud de la plabra
            tecla[i] = '_';
        }
        int contador = 11; // Variable de tipo entero llamada contador
        int contador2 = 0;//Variable de tipo entero llamada contador2
        int salir = 0;//Variable de tipo entero llamada salir
        /**
        * Imprimo los siguientes  mensajes en la consola 
        **/
        System.out.println("      Bienvenido  al Juego         ");
        System.out.println("-----------------------------------");
        System.out.println("             Reglas                ");
        System.out.println("-----------------------------------");
        System.out.println("1. Tiene 11 intentos para adivinar ");
        System.out.println("2. Use letras solo minusculas  ");
        System.out.println(""); //Imprimo estas comillas para que no quede espacios
        System.out.println("");
        System.out.println("");

        while (contador > 0) { //Ciclo while 
            resp = JOptionPane.showInputDialog("Ingrese una letra en minuscula:");// Se imprime el mesnsaje 
            ingresado = ingresado + resp.charAt(0); // La variable ingresado va a ser igual a ingresado mas resp.charAt

            System.out.println("Las letras ingresadas son:" + ingresado);//Se imprime el mensaje mas la variable ingresado
            System.out.println("");// Se inprime las comillas para que no queden espacios

            for (int j = 0; j < palabra[var].length(); j++) { 

                if (resp.charAt(0) == palabra[var].charAt(j)) {// Si condicional
                    tecla[j] = palabra[var].charAt(j);// MI variable llamada j es igual palabras[var].charAt(j)
                    contador2++;// Contador aumenta en cada vuelta
                }

            }

            System.out.println("");// Imprimo las comillas
            if (contador2 < 1) { // Si condicinsl
                contador--; // Mi contador disminuuye cada vez 1
                System.out.println(""); 
                System.out.println("Letras no valida en esta palabra, intente de nuevo "); // Se imprime el mensanje enn la consola con el tipo sistem.out.println//
                System.out.println("");// Si imprime las comillas para que no queden espacios
                System.out.println("Intentons restanes:" + contador + "intentos");
                System.out.println("");
                System.out.println(soga[contador]);

                contador2 = 0;
            } else {
                System.out.println("Felicidades esta letra esta en la palabra");// Se muetra el mensaje en la consola de uqe ha ganado//
                System.out.println("Ingresa otra letra");// Se muetra el mensaje en la consola para que el usuario ingrese otra letra//
                contador2 = 0;

            }

            for (int s = 0; s < palabra[var].length(); s++) {// Ciclo
                System.out.print(tecla[s] + " ");// Imprime la letra que esta correcta

            }
            System.out.println(""); // Linea en blanco

            for (int d = 0; d < palabra[var].length(); d++) { // ciclo
                if (palabra[var].charAt(d) == tecla[d]) { // Si condicional
                    salir++; // La variable aumenta
                } else { // Si condicional

                    salir = 0; //si no se cumple la condicion a salir se le asigna el valor de 0
                }

                if (salir == palabra[var].length()) { // Si condicional
                    System.out.println(""); //Imprimo los siguientes mennsajes //
                    System.out.println("**********************************************");
                    System.out.println("              Felicidades ha ganado           ");
                    System.out.println("**********************************************");
                    contador = 0;
                    contador2 = 0;// Le asigno el valor de 0 al contador 2

                }

            }

        }

        if (salir < palabra[var].length()) {

            System.out.println(""); 
            System.out.println("********************************");
            System.out.println("           Otro juego           "); // Imprimo el mensaje otro juego//
            System.out.println("*********************************");
            System.out.println("|______________________________________\n|                                      |\n|                                      |\n|                                 --------\n|                                 | o   o |\n|                                 |   v   |\n|                                 --------\n|                                     |   \n|                                   / | \\  \n|                                     |   \n|                                    / \\  ");
        }

    }

}
