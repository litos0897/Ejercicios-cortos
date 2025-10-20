import java.util.Scanner;

public class Moneda {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);


        /*Pide al usuario cuántas veces quiere lanzar una moneda.
        Usa un bucle for para generar resultados aleatorios (“cara” o “cruz”);
        Cuenta cuántas veces salió cada uno y muestra el total al final.
        (Sugerencia: usa Math.random() y condicionales.)*/


        System.out.println("¿Cuántas veces quieres lanzar una moneda?");
        int lanzamientos = lector.nextInt();
        int caras=0;
        int cruces=0;

        for(int i=1;i<=lanzamientos;i++){
            double resultado=Math.random();
            if (resultado>=0.5){
                System.out.println("Lanzamiento " + i+ ": Ha salido cara");
                caras++;
            }else {
                System.out.println("Lanzamiento " + i+ ": Ha salido cruz");
                cruces++;
            }
        }
        System.out.println("\nResultados finales");
        System.out.println(caras+" caras");
        System.out.println(cruces+" cruces");


    }
}
