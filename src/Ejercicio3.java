/*
Escribe un programa en Java que solicite al usuario ingresar la nota de un estudiante (un valor numérico entre 0 y 5).
Luego determina si la nota es baja (menor a 3), básica (entre 3 y 4) o superior (igual o mayor a 40).
El programa deberá mostrar por pantalla un mensaje correspondiente al rango de la nota ingresada.
 */

import java.util.*;

/**
 *
 * @author carlo
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner Dato = new Scanner(System.in);

        float nota;
        int S;
        do {
            System.out.println("Digite la nota del estudiante:");
            nota = Dato.nextFloat();

            if (nota < 3) {
                System.out.println("Su nota es baja ");
                if (nota < 3) {
                    System.out.println("Esfuertame mas");
                }
            } else if (nota >= 3 && nota < 4) {
                System.out.println("Su nota es basica");
                if (nota >= 3 && nota < 4) {
                    System.out.println("Puedes hacerlo mejor");
                }
            } else {
                System.out.println("Su nota es alta");
                System.out.println("Bien hecho");
            }

            System.out.println("¿Desea continuar?");
            System.out.println("1- SI");
            System.out.println("2- NO");
            S = Dato.nextInt();
            System.out.println("---------------------------------");
        } while (S == 1);

    }

}
