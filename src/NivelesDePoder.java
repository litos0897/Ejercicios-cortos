/*Crea un array con 5 nombres de Saiyans, y otro array con sus poderes. Por ejemplo,
en la posición 0 del de nombres puede aparecer Vegeta, en la posición 0 del de poderes,
puede aparecer 9000.

A continuación, en un bucle:
Pregunta al usuario de quién quiere conocer el poder.
Imprime el poder de ese guerrero si existe; si no existe, imprime "No tengo datos".
Pregunta al usuario si quiere preguntar por otro guerrero, o si quiere acabar
Tras salir del bucle:
Calcula el saiyan más fuerte y el más débil.
Imprime "El saiyan más fuerte es [nombre] con un poder de [poder]"
Imprime "El saiyan más débil es [nombre] con un poder de [poder]"*/

import java.util.Scanner;
public class NivelesDePoder {
    public static void main(String[] args) {
        String[] Saiyans = new String[5];
        Saiyans[0] = "Goku";
        Saiyans[1] = "Vegeta";
        Saiyans[2] = "Trunks";
        Saiyans[3] = "Raditz";
        Saiyans[4] = "Broly";

        int[] Poderes = new int[5];
        Poderes[0] = 9000;
        Poderes[1] = 8000;
        Poderes[2] = 7000;
        Poderes[3] = 6000;
        Poderes[4] = 5000;

        boolean encontrado = false;

        System.out.println("Estos son los Saiyans y sus niveles de poder");

        for (int i = 0; i < Saiyans.length; i++) {
            System.out.println(" - " + Saiyans[i] + ": " + Poderes[i]);
        }
        System.out.println("\n¿De qué Saiyan quieres conocer el poder?");
        Scanner lector = new Scanner(System.in);
        String pregunta = lector.next();
        for (int i = 0; i < Saiyans.length; i++) {
            if (pregunta.equals(Saiyans[i])) {
                System.out.println(Poderes[i]);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No tengo datos");

        }
        int maxPoder = Poderes[0];
        int minPoder =Poderes[0];
        String saiyanFuerte=Saiyans[0];
        String saiyanDebil=Saiyans[0];

        for (int i=1; i< Poderes.length; i++){
            if(Poderes[i]>maxPoder){
                maxPoder=Poderes[i];
                saiyanFuerte=Saiyans[i];
            }
            if(Poderes[i]<minPoder){
                minPoder=Poderes[i];
                saiyanDebil=Saiyans[i];
            }
        }
        System.out.println("\nEl saiyan más fuerte es "+saiyanFuerte+ " con un poder de " +maxPoder);
        System.out.println("El saiyan más débil es "+saiyanDebil+ " con un poder de " +minPoder);
    }
}

