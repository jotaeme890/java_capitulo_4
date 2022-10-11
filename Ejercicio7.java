/*
 * 1 Realiza un programa que calcule la media de tres notas.
 * 
 * @author jotaeme
 */

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;

public class Ejercicio7 {
    public static void main(String args []){
        try {
            Scanner sc = new Scanner (System.in);
            System.out.print("Dime el valor de la altura en metros: ");
            float  h = sc.nextFloat();

            if(h<=0){
                System.out.print("No se puede hayar la velocidad en una altura negativa");
            } else
                System.out.print("Tradaría un total de " + Math.sqrt(2*h/9.81) + " segundos");
        
        sc.close();

        } catch (InputMismatchException ex) {
            System.out.println("Por favor dime bien los formatos");
        }  
    }
    
}