/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase01;

import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author SALA H
 */
public class Clase01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {

            File file = new File("C:\\Users\\SALA A\\Desktop\\Tais\\estudiantes1.txt");
            if (file.createNewFile()) {
                System.out.println("Archivo creado: " + file.getName());
            } else {
                System.out.println("El archivo ya existe");
            }
        } catch (IOException e) {
            System.out.println("Error.");
        }

        try ( FileWriter myWriter = new FileWriter("C:\\Users\\SALA A\\Desktop\\Tais\\estudiantes1.txt")) {
            myWriter.write("Ejemplo de escritura en archivo usando Write");
            myWriter.close();
            System.out.println("El archivo ha sido creado");

        } catch (IOException e) {
            System.out.println("error de escritura.");

        }

        System.out.println("Leemos el archivo: ");
        try ( FileReader myReader = new FileReader("C:\\Users\\SALA A\\Desktop\\Tais\\estudiantes1.txt")) {
            int i;
            while ((i = myReader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println("error de lectura.");
        }

    }

}
