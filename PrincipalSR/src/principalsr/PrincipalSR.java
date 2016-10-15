/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principalsr;

import MisRestas.Restas;
import MisSumas.Sumas;
import java.util.Scanner;

/**
 *
 * @author Leslie Callejas
 */
public class PrincipalSR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
        Scanner leer = new Scanner(System.in);
        boolean bandera = true;
        while (bandera) {
            System.out.println("\nMenu de opciones\n");
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("ingrese la opcion deseada");
            int respuesta = leer.nextInt();

            if (respuesta == 1) {
                System.out.print("Ingrese un valor: ");
                int valor1 = leer.nextInt();
                System.out.print("Ingrese un valor: ");
                int valor2 = leer.nextInt();
                Sumas s = new Sumas();
                int resultado = s.Sumas(valor1, valor2);
                System.out.println("Resultado = " + resultado);

            } else if (respuesta == 2) {
                System.out.print("Ingrese un valor; ");
                int valor1 = leer.nextInt();
                System.out.print("Ingrese un valor; ");
                int valor2 = leer.nextInt();
                Restas r = new Restas();
                int resultado = r.Sumas(valor1, valor2);
                System.out.println("Resultado = " + resultado);

            } else {
                System.out.println("La opcion" + respuesta + "no existe");
            }

        }
    }
}
    
    

