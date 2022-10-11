/*
 * 1 Amplía el programa anterior para que diga la nota del boletín (insuficiente, 
 * suficiente, bien, notable o sobresaliente).
 * 
 * @author jotaeme
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String args []){
        try {
            Scanner sc = new Scanner (System.in);
            System.out.print("Dime la nota del primer examen: ");
            float  n = sc.nextFloat();
            System.out.print("Dime la nota del segundo examen: ");
            float  n2 = sc.nextFloat();
            System.out.print("Dime la nota del tercer examen: ");
            float  n3 = sc.nextFloat();

            float media = ((n+n2+n3)/3);

            if(n < 0 || n2 < 0 || n3 < 0){
                System.out.print("Por favor, dime bien los datos");
                } else if(n > 10 || n2 > 10 || n3 > 10){
                    System.out.print("Por favor, dime bien los datos");
                    }else
                        System.out.println("La media sería: " + media);
                    

                if(media < 5){
                    System.out.println("Tienes un insuficiente en la asignatura");
                } else if(media == 5){
                    System.out.println("Tienes un suficiente en la asignatura");
                    } else if(media >= 5 && media <= 6){
                        System.out.println("Tienes un bien en la asignatura");
                            }else if(media >= 7 && media <= 8){
                            System.out.println("Tienes un notable en la asignatura");
                                }else if(media >= 9  && media <= 10){
                                    System.out.println("Tienes un sobresaliente en la asignatura");
                                }
        
        sc.close();

        } catch (InputMismatchException ex) {
            System.out.println("Por favor dime bien los formatos");
        }  
    }
}