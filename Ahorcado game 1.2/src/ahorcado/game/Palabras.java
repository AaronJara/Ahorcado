/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado.game;

/**
 *
 * @author Aaron Jara Molina
 */
public class Palabras {
    private String[] mospl; // Declaro el arreglo llamado mospl que significa mostrar palabra/
    private String letras;//Declaro el arreglo llamado letras/
    private String[] plcompleta; // Declaro el arrglo llamado plcompleta la cual signifca palabra completa/
    private int cont ; // Mi contador llamado cont

    /**
     *
     * @param mospl
     * @param letras
     * @param plcompleta
     * @param cont
     */
    public Palabras(String[] mospl, String letras, String[] plcompleta, int cont) {
        this.mospl = mospl;
        this.letras = letras;
        this.plcompleta = plcompleta;
        this.cont = cont;
    }
    
    
 public Palabras() // Creo una clase llamda palabras /
 
 {
     mospl = new String[10];
        mospl[0] = "perro";
        mospl[1] = "gato";
        mospl[2] = "leon";
        mospl[3] = "elefante";
        mospl[4] = "gallo";
        mospl[5] = "lobo";
        mospl[6] = "caballo";
        mospl[7] = "tigre";
        mospl[8] = "ardilla";
        mospl[9] = "mono";
        letras= escogerPalabra();
        plcompleta = new String[letras.length()];
        llenarPalabraFormada();
        cont = 0;
}
        public String escogerPalabra()
    {
        int aleatorio=(int)((Math.random()*10));
        return mospl[aleatorio];
        
    }  
    public void llenarPalabraFormada()
    {
        for(int i = 0; i < plcompleta.length; i++)
        {
            plcompleta[i] = "*";
        }
    }
}
