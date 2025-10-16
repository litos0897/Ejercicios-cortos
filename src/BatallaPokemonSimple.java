import java.util.Scanner;

public class BatallaPokemonSimple {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);


    /*Pide al usuario los puntos de vida (HP) de su Pokémon y los del rival.
Mientras ambos tengan vida (while), resta daño en cada turno y muestra el resultado. no tienes que elegir tipo de ataque; simplemente, resta un daño concreto que has guardado en una variable previamente.
Usa condicionales para determinar quién gana: "Tu Pokémon ha ganado!" o "Has perdido...".*/

        System.out.println("Bienvenido a esta batalla Pokemon entre Pikachu y Squirtle. Inserta aquí los puntos de vida de ambos Pokemon");
        int hpPikachu = lector.nextInt();
        int hpSquirtle = lector.nextInt();
        int hpPokemon = lector.nextInt();



    }
}