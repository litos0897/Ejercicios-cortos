/*Crea un array de tamaño 5, de String, pero no le des valor a ningún.
En un bucle:
Pregunta al usuario el nombre del Pokemon que acaba de capturar.
Guárdalo en la posición correcta del array.
Después, imprime el nombre de todos los Pokemon, pero en orden inverso.*/

import java.util.Scanner;
public class capturaPokemon {
    public static void main(String[] args) {
        String[] pokemon = new String[5];
        Scanner lector = new Scanner(System.in);
        for(int i=0; i<pokemon.length; i++){
            System.out.println("Introduce el nombre del Pokémon capturado nº "+(i+1)+" :");
            String pokemonCapturado = lector.nextLine();
            pokemon[i] = pokemonCapturado;
    }
        for(int i=pokemon.length-1; i>=0; i--){
            int numeroCaptura=i+1;
            System.out.println("Posición "+numeroCaptura+": "+pokemon[i]);
        }
    }
}
