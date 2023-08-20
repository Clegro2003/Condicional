/*Implementa un programa en Java que solicite al usuario ingresar su edad y luego
utilice una estructura 'if' para verificar si la edad ingresada es mayor o igual a 18.
Si es así, el programa mostrará por pantalla el mensaje:
'Eres mayor de edad'. En caso contrario, mostrará el mensaje: 'Eres menor de edad'*/

import java.util.*;

/**
 *
 * @author carlo
 */
public class Ejercicio2 {

    private static final Scanner Dato = new Scanner(System.in);

    public static void main(String[] args) {
        int Datoa, S;
        do {
            System.out.println("Digite su edad: ");
            Datoa = Dato.nextInt();
            if (Datoa >= 18) {
                System.out.println("Eres mayor de edad");
            } else {
                System.out.println("Eres menor de edad");
            }
            System.out.println("¿Desea continuar?");
            System.out.println("1- SI");
            System.out.println("2- NO");
            S = Dato.nextInt();
            System.out.println("---------------------------------");
        } while (S == 1);
    }

}
