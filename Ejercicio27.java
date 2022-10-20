/*
  * 25 Una pastelería nos ha pedido realizar un programa que haga presupuestos de
 * tartas. El programa preguntará primero de qué sabor quiere el usuario la tarta:
 * manzana, fresa o chocolate. La tarta de manzana vale 18 euros y la de fresa
 * 16. En caso de seleccionar la tarta de chocolate, el programa debe preguntar
 * además si el chocolate es negro o blanco; la primera opción vale 14 euros y la
 * segunda 15. Por último se pregunta si se añade nata y si se personaliza con un
 * nombre; la nata suma 2.50 y la escritura del nombre 2.75.
 * 
 * @author jotaeme
 */

import java.util.Scanner;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class Ejercicio27 {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dimeun sabor (manzana, fresa o chocolate): ");
        String sabor = sc.nextLine();

        double precioSabor = 0;
        double precioNata = 0;
        double precioNombre = 0;
        String tipoChocolate = "";

        switch (sabor) {
            case "manzana":
            precioSabor = 18;
            break;
            case "fresa":
            precioSabor = 16;
            break;
            case "chocolate":

            System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco): ");
            tipoChocolate = ScheduledThreadPoolExecutor.nextLine();
            if (tipoChocolate.equals("negro")) {
                precioSabor = 14;
            } else if (tipoChocolate.equals("blanco")) {
                precioSabor = 15;
            }
            break;
            default:
        }

        System.out.print("¿Quiere nata? (si o no): ");
        boolean conNata = sc.nextLine().equals("si");
        
        System.out.print("¿Quiere ponerle un nombre? (si o no): ");
        boolean conNombre = sc.nextLine().equals("si");

        System.out.print("Tarta de " + sabor);

        if (sabor.equals("chocolate")) {
            System.out.print(" " + tipoChocolate);
        }

        System.out.printf(": %.2f €\n", precioSabor);
        
        if (conNata) {
            precioNata = 2.5;
            System.out.printf("Con nata: %.2f €\n", precioNata);
        }
        
        if (conNombre) {
            precioNombre = 2.75;
            System.out.printf("Con nombre: %.2f €\n", precioNombre);
        }
        
        System.out.printf("Total: %.2f €\n", precioSabor + precioNata + precioNombre);
    }

}