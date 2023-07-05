
package com.mycompany.nullpointerexception;

import java.util.ArrayList;

public class ListaNumeros {

    private ArrayList<Integer> listaDeNumeros;

 

    public ListaNumeros () { } // El constructor está vacío

 

    public Integer sumatorio () {
try{
     Integer suma = 0;

        for (Integer numero : listaDeNumeros) { suma = suma + numero; }

        return suma;
}catch(NullPointerException e)
    {
        System.out.println("error detectado");

    }
        return null;
    } //Cierre del método sumatorio

 

    public void añadirItem (Integer item) {

          listaDeNumeros.add (item);

    } //Cierre del método

} //Cierre de la clase