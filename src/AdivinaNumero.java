import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        Random miGeneradorAleatorio = new Random();
        Scanner lector = new Scanner(System.in);

        /*Genera un número aleatorio del 1 al 10.
        Pide al usuario que lo adivine usando un bucle while.
        Si el número es mayor o menor, muestra una pista con un if.
        Cuando acierte, imprime "¡Correcto! Has adivinado el número en X intentos!".*/


        int numeroEntrada= miGeneradorAleatorio.nextInt(1,11);

        boolean acertado=false;
        int numUsuario=0;
        int contador=0;

        System.out.println("Adivina el número entre 1 y 10");

        while(!acertado){
            System.out.println("Introduce un número");
            numUsuario=lector.nextInt();
            contador++;
            if(numUsuario>numeroEntrada) {
                System.out.println("Te has pasado");
            }else if(numUsuario<numeroEntrada){
                System.out.println("Te has quedado corto");
            }else{
                System.out.println("Has acertado!");
                acertado=true;
            }
        }
        System.out.println("Has hecho "+contador+" intentos");
    }
}
