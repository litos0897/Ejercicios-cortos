/*Crea 4 funciones estáticas:
    sumar(int a, int b)
    restar(int a, int b)
    multiplicar(int a, int b)
    dividir(double a, double b)
Desde main, pide dos números al usuario y una operación (por ejemplo: “+”, “-”, “*”, “/”),
usa un if o switch para decidir qué función llamar,
y muestra el resultado.*/

import java.util.Scanner;

public class Calculadora {
    public static void sumar(int a, int b) {
        System.out.println("Resultado: " + (a + b));
    }

    public static void restar(int a, int b) {
        System.out.println("Resultado: " + (a - b));
    }

    public static void multiplicar(int a, int b) {
        System.out.println("Resultado: " + (a * b));
    }

    public static void dividir(int a, int b) {
        if (b == 0) {
            System.out.println("No se puede dividir entre cero");
        } else
            System.out.println("Resultado: " + (a / b));
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int numero1 = lector.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int numero2 = lector.nextInt();
        System.out.println("¿Qué tipo de operación quieres? (+, -, *, /): ");
        String operacion = lector.next();

        if (operacion.equals("+")) {
            sumar(numero1, numero2);
        } else if (operacion.equals("-")) {
            restar(numero1, numero2);
        } else if (operacion.equals("*")) {
            multiplicar(numero1, numero2);
        } else if (operacion.equals("/")) {
            dividir(numero1, numero2);
        } else {
            System.out.println("Operación no válida");
        }
    }
}