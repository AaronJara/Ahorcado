/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado.game;

/**
 *
 * @author AARON
 */
public class Palabras {
    private String[] mospl;
    private String letras;
    private String[] plcompleta;
    private int cont ;
    
 public Palabras()
 
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
