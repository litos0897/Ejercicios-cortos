/* Crea un array con 6 jugadores de Among Us - los nombres.

Utiliza la librería Random para decir cuál de ellos es el impostor; será el 0, 1, 2, 3, 4.o 5 en el array.

Imprime los nombres de los jugadores.

Pregunta al jugador cuál cree que es el impostor - tiene que escribir el nombre.

Utilizando un bucle for, recupera cuál es el nombre del impostor que se calculó al principio.

Imprime el resultado de la partida.*/

import java.util.Scanner;
public class AmongUs {
    public static void main(String[] args) {
        String[] Jugadores = new String[6];
        Jugadores[0] = "Antón";
        Jugadores[1] = "Jose";
        Jugadores[2] = "Julia";
        Jugadores[3] = "Luis";
        Jugadores[4] = "Marcos";
        Jugadores[5] = "Lucía";

        System.out.println("Los jugadores son: ");
        for (int i = 0; i < Jugadores.length; i++) {

            System.out.println(" - "+Jugadores[i]);

        }
        int impostor = (int) (Math.random() * Jugadores.length);
        System.out.println("\n¿Quién crees que es el impostor? ");
        Scanner lector=new Scanner(System.in);
        String supuestoImpostor=lector.next();

        if (supuestoImpostor.equals (Jugadores[impostor])){
            System.out.println("\nEstás en lo cierto.");
        }
        else{
            System.out.println("\nEstás equivocado.");
        }
        System.out.println(Jugadores[impostor]+" es el impostor.");

    }
}