
package com.mycompany.v4trifiv;

import java.util.Scanner;

import funciongeneral.conversionesmultiplo;

public class V4trifiv {
    public static void main (String[]args) {
        Scanner entrada = new Scanner (System.in);
        int num;
        System.out.println("Escribe un numero");
        num = entrada.nextInt();  
        
        conversionesmultiplo variableMultiplo = new conversionesmultiplo();
        
        System.out.println(variableMultiplo.retornaMultiplo(num));
                
               
    

   
    }
}
