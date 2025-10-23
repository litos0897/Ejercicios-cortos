import java.util.Scanner;
public class Suma {
    public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);

    /*Crea una función estática llamada sumar() que reciba dos números enteros y devuelva su suma.
    En el main, pide los dos números, llama a la función y muestra el resultado con un mensaje como:
            "La suma de A + B es = X".*/


        System.out.println("Introduce el primer número");
        int num1 = lector.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2 = lector.nextInt();
        int suma = num1 + num2;
        System.out.println("El resultado de " +num1 +" + " + num2+ " es " + suma);

    }
}


