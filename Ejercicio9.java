/*
 * 9 Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax2 + bx + c = 0).
 * 
 * @author jotaeme
 */


import java.util.Scanner;
import java.lang.Math;

public class Ejercicio9 {
    public static void main(String args []){
            Scanner sc = new Scanner (System.in);
            System.out.print("Dime el valor de a: ");
            float  a = sc.nextFloat();
            System.out.print("Dime el valor de b: ");
            float  b = sc.nextFloat();
            System.out.print("Dime el valor de c: ");
            float  c = sc.nextFloat();

            if (a != 0){
            System.out.println("El resultado sería: " + (((b*(-1))+(Math.sqrt(b*b)-4*a*c)))/2*a );
            System.out.print("El resultado sería: " + (((b*(-1))-(Math.sqrt(b*b)-4*a*c)))/2*a );
            }else 
            System.out.print("La ecuación no tiene resultado, vuelva a decir los datos");

        sc.close();

    } 
}
