
package com.mycompany.mayormenor;

import java.util.Scanner;
import procedimiento.procedimiento;


public class mayormenor {
     public static void main(String[] args) {

       Scanner in = new Scanner(System.in);

       System.out.println("Introduce tu edad");

       int age = in.nextInt();
       
       procedimiento x= new procedimiento();
       x.retornoprocedimiento(age);
         System.out.println(x.retornoprocedimiento(age));


   }

}


    

