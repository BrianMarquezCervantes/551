/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tressinco;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Dynky
 */
public class tressinco {
    public static void main(String[]args) throws IOException
    {
         BufferedReader bufEntrada= new BufferedReader (new InputStreamReader(System.in));
    int numero = 0;
    int mult3;
    int mult5;
    
    System.out.println("ingresa un numero ");
    numero =Integer.parseInt (bufEntrada.readLine());
    
    mult3= numero % 3;
    mult5 = numero % 5;
    
    if  (mult3 == 0 && mult5 == 0){
        System.out.println("TRIFIV"); 

    }
    else if (mult3 == 0){
        
            System.out.println("TRI");
       }
    else if (mult5 == 0)
        System.out.println("FIV");
            {
            
            }
  

}}
    
