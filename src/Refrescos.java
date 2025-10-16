import java.util.Scanner;

public class Refrescos {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);


        /*Pide al usuario su saldo y el precio del refresco.
        Si tiene dinero suficiente, calcula el cambio y muestra "Aquí tienes tu refresco y tu cambio: X €".
                Si no, muestra "Saldo insuficiente 😞".
                Permite repetir la compra con un bucle while hasta que el usuario introduzca saldo suficiente.*/



        System.out.println("¿Cuánto dinero tienes?");
        int dinero = lector.nextInt();
        System.out.println("¿Cuánto cuesta el refresco?");
        int precio = lector.nextInt();
        while (dinero < precio) {
            System.out.println("Saldo insuficiente 😞");
            System.out.println("Reintroduce datos válidos");
            System.out.println("¿Cuánto dinero tienes?");
            dinero=lector.nextInt();

        }int cambio = dinero-precio;
        System.out.println("Aquí tienes tu refresco y tu cambio de " + cambio + " €");
        }
    }
