/*Escribe un programa en Java que verifique si un número ingresado por el usuario es positivo. 
Si el número es positivo (mayor que cero), el programa deberá mostrar por pantalla el mensaje:
"El número ingresado es positivo." Si el número no es positivo, no se mostrará ningún mensaje.*/

import java.util.*;

public class Ejercicio1 {

    private static final Scanner Dato = new Scanner(System.in);

    public static void main(String[] args) {
        int a, S;
        do {
            System.out.println("Digite un numero: ");
            a = Dato.nextInt();
            if (a > 0) {
                System.out.println("El numero es positivo");
            }
            System.out.println("¿Desea continuar?");
            System.out.println("1- SI");
            System.out.println("2- NO");
            S = Dato.nextInt();
            System.out.println("---------------------------------");
        } while (S == 1);
    }

}
