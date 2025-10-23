/*Crea una función estática llamada saludar() que reciba un nombre como parámetro (String)
         y muestre por pantalla:
        "¡Hola, [nombre]! Bienvenido al servidor de programación."
        Desde main, pide el nombre por teclado y llama a la función*/

import java.util.Scanner;

public class Saludo{
    public static void saludar(String nombre){
        System.out.println("¡Hola, " + nombre + "!Bienvenido al servidor de programación.");
    }
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre=lector.nextLine();
        saludar(nombre);
    }
}