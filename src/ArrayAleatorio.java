/*Realiza un programa que genere un array de números aleatorios DECIMALES. Para ello:

1.- Pide por teclado el número de elementos que tendrá el array.
    Tienes que pedirlo ANTES de crear el array - recuerda, cuando inicializamos un array,
    tenemos que decir cuantos elementos va a tener.

2.- Pide por teclado el número mínimo para los valores aleatorios.

3.- Pide por teclado el número máximo para los valores aleatorios.

Una vez que tengas todos estos datos, crea el array en un bucle. A continuación, en otro bucle, imprime el array como:
posición 0: 0,32
posición 1: 5,27
posición 2: 4,31
posición 3: 2,27*/

import java.util.Scanner;
import java.util.Random;
public class ArrayAleatorio {
    public static void main(String[] args){
       Scanner lector=new Scanner(System.in);
       Random aleatorio=new Random();
        System.out.println("¿Cuántos elementos tendrá el array?");
        int elementos=lector.nextInt();
        System.out.println("Introduce el valor mínimo del array");
        double min= lector.nextDouble();
        System.out.println("Introduce el valor máximo del array");
        double max= lector.nextDouble();

        double[] decimales=new double[elementos];

        for (int i=0; i<decimales.length;i++){
            decimales[i] =aleatorio.nextDouble(min,max);
        }

        for (int i=0;i<decimales.length; i++){
            System.out.printf("posición "+i+": "+"%.2f%n",decimales[i]);

        }
    }
}
