import java.sql.SQLOutput;
import java.util.Scanner;

public class BatallaPokemonSimple {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);


    /*Pide al usuario los puntos de vida (HP) de su Pokémon y los del rival.
Mientras ambos tengan vida (while), resta daño en cada turno y muestra el resultado. no tienes que elegir tipo de ataque; simplemente, resta un daño concreto que has guardado en una variable previamente.
Usa condicionales para determinar quién gana: "Tu Pokémon ha ganado!" o "Has perdido...".*/

        System.out.println("Bienvenido a esta batalla Pokemon entre Pikachu y Squirtle. Inserta aquí los puntos de vida de ambos Pokemon");
        System.out.println("Vida Pikachu:");
        int hpPikachu = lector.nextInt();
        System.out.println("Vida Squirtle:");
        int hpSquirtle = lector.nextInt();
        int danhoPikachu = 5;
        int danhoSquirtle = 3;
        boolean turno1 = true;
        while (hpPikachu > 0 && hpSquirtle > 0) {
            if (turno1) {
                System.out.println("Es el turno de Pikachu. Le quita " + danhoPikachu + " puntos de vida a Squirtle");
                hpSquirtle = hpSquirtle - danhoPikachu;
                System.out.println("Le quedan " + hpSquirtle + " puntos de vida a Squirtle");
            } else {
                System.out.println("Es el turno de Squirtle. Le quita " + danhoSquirtle + " puntos de vida a Pikachu");
                hpPikachu = hpPikachu - danhoSquirtle;
                System.out.println("Le quedan " + hpPikachu + " puntos de vida a Pikachu");
            }
          turno1 = !turno1;
        }
        if (hpPikachu <= 0) {
            System.out.println("Has perdido...");
        } else if (hpSquirtle <= 0) {
            System.out.println("Tu Pokémon ha ganado!");
        }
    }
}