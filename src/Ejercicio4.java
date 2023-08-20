/*Desarrollar una calculadora básica en Java que permita a los usuarios realizar operaciones aritméticas 
simples, como suma, resta, multiplicación y división*/
import java.util.*;

/**
 *
 * @author carlo
 */
public class Ejercicio4 {

    private static final Scanner Dato = new Scanner(System.in);

    public static void main(String[] args) {
        int Datoa, Datob, s, C, S;

        do {
            System.out.println("----CALCULADORA BASICA----");
            System.out.println("Elija la operacion matematica deseada: ");
            System.out.println("1- SUMA");
            System.out.println("2- RESTA");
            System.out.println("3- MULTIPLICACION");
            System.out.println("4- DIVISION");
            s = Dato.nextInt();
            switch (s) {
                case 1 -> {
                    System.out.println("Digite valor para A: ");
                    Datoa = Dato.nextInt();
                    System.out.println("Digite un valor para B: ");
                    Datob = Dato.nextInt();

                    C = Datoa + Datob;

                    System.out.println("Su resultado es: " + C);
                }
                case 2 -> {
                    System.out.println("Digite valor para A: ");
                    Datoa = Dato.nextInt();
                    System.out.println("Digite un valor para B: ");
                    Datob = Dato.nextInt();

                    C = Datoa - Datob;

                    System.out.println("Su resultado es: " + C);
                }
                case 3 -> {
                    System.out.println("Digite valor para A: ");
                    Datoa = Dato.nextInt();
                    System.out.println("Digite un valor para B: ");
                    Datob = Dato.nextInt();

                    C = Datoa * Datob;

                    System.out.println("Su resultado es: " + C);
                }
                case 4 -> {
                    System.out.println("Digite valor para A: ");
                    Datoa = Dato.nextInt();
                    System.out.println("Digite un valor para B: ");
                    Datob = Dato.nextInt();

                    C = Datoa / Datob;

                    System.out.println("Su resultado es: " + C);
                }
            }

            System.out.println("¿Desea hacer otra operación?");
            System.out.println("1- SI");
            System.out.println("2- NO");
            S = Dato.nextInt();
            System.out.println("---------------------------------");
        } while (S == 1);
    }
}
