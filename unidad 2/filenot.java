
package com.mycompany.filenotfoundexception;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class filenot {
    
    public static void main(String[] args) {
        try {
            // Intenta abrir un archivo que no existe
            File archivo = new File("archivo.txt");
            Scanner scanner = new Scanner(archivo);

            // Lee el contenido del archivo línea por línea
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                System.out.println(linea);
            }

            // Cierra el scanner
            scanner.close();
        } catch (FileNotFoundException e) {
            // Captura la excepción FileNotFoundException
            System.out.println("El archivo no se encontró: " + e.getMessage());
            e.printStackTrace();
        }
    }

    
}

