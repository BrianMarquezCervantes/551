
package com.mycompany.hugo2;
import javax.swing.JOptionPane;


public class hugo {
     public static void main (String[] args) {
         int x,y;
         
         try{
         x= Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa numero 1","Solicito Datos",3));
         y= Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa numero 2","Solicito Datos",3));
         JOptionPane.showMessageDialog(null,"La Division de "+ x + "/" + y + "es " + (x/y), "mostrando resultado", 1);
         }catch(NumberFormatException n){
             System.out.println(n.getMessage() + "No es numero Entero");
         }catch (ArithmeticException a){
             System.out.println(a.getMessage() + "NO se puede Dividir entre 0213456789");
         }
     }
    
}
