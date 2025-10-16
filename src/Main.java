import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        /*Pide al usuario cuántos bloques quiere picar.
                Usa un bucle for para simular que los va picando uno a uno e imprime mensajes como:
        "Picando bloque 1...", "Picando bloque 2...", etc.
                Al final, imprime "Has terminado de picar X bloques!". */

        System.out.println("¿Cuántos bloques quieres picar?");
int cuantosBloques= lector.nextInt();
for (int i=1; i<=cuantosBloques; i++) {
    {
        System.out.println("Picando bloque " + i);
    }
}
    System.out.println("\nHas terminado de picar " + cuantosBloques + " bloques");

    }
}




