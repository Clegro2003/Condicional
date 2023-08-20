/*
Desarrollar un programa que combine el uso de las diferentes estructuras de control condicionales if y switch
 */

import java.util.*;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, s, S;
        do {
            System.out.println("Elija una opcion:");
            System.out.println("1- IF SIMPLE");
            System.out.println("2- IF COMPUESTO");
            System.out.println("3- IF ANIDADO");
            s = input.nextInt();

            switch (s) {
                case 1 -> {
                    System.out.print("Ingresa un número entero: ");
                    a = input.nextInt();

                    if (a > 0 && a % 2 == 0) {
                        System.out.println("El número es positivo y par.");
                    }
                }

                case 2 -> {
                    System.out.print("Ingresa un número entero: ");
                    int b = input.nextInt();

                    if (b > 0) {
                        System.out.println("El número es positivo.");
                    } else {
                        System.out.println("El número es negativo.");
                    }
                }
                case 3 -> {
                    System.out.print("Ingresa el primer número: ");
                    int a1 = input.nextInt();

                    System.out.print("Ingresa el segundo número: ");
                    int a2 = input.nextInt();

                    if (a1 > a2) {
                        System.out.println("El primer número " + a1+ " es mayor: " );
                    } else if (a2 > a1) {
                        System.out.println("El segundo número " + a2+ " es mayor: ");
                    } else {
                        System.out.println("Los dos números son iguales.");
                    }
                }
                default ->
                    System.out.println("ELIJA UNA OPCION VALIDA");
            }
            System.out.println("¿Desea continuar?");
            System.out.println("1- SI");
            System.out.println("2- NO");
            S = input.nextInt();
            System.out.println("---------------------------------");
        } while (S == 1);

    }

}
