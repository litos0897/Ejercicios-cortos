/*Crea una función estática llamada celsiusAFahrenheit() que reciba una temperatura en Celsius
y devuelva su conversión a Fahrenheit usando la fórmula F = (C * 9/5) + 32.
Desde el main, pide una temperatura al usuario y muestra el resultado.*/

import java.util.Scanner;

public class conversionTemperaturas {
    public static void celsiusAFahrenheit(int celsius) {
        int fahrenheit = (celsius*9/5) + 32;
        System.out.println("La temperatura en Fahrenheit es de " + fahrenheit + " grados");
}

public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
    System.out.println("Ingresa la temperatura en Celsius: ");
    int celsius = lector.nextInt();
    celsiusAFahrenheit(celsius);


}


}

