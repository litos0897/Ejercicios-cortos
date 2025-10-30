import java.util.Scanner;
/*Crea un array de Strings con los objetos del inventario de un jugador - tiene que tener 5 objetos - (por ejemplo: "espada", "pico", "manzana dorada", "bloques de piedra", "antorchas").
Usa un bucle for para imprimir:
        "Tienes en tu inventario: [objeto]".
Luego muestra cuántos objetos tiene el jugador.*/

public class ObjetosMinecraft {
    public static void main(String[] args) {
        String[]objeto = new String[5];
        objeto[0]="espada";
        objeto[1]="pico";
        objeto[2]="manzana dorada";
        objeto[3]="bloques de piedra";
        objeto[4]="antorchas";

        String[]cantidad = new String[5];
        cantidad[0]="1";
        cantidad[1]="2";
        cantidad[2]="3";
        cantidad[3]="4";
        cantidad[4]="5";

        System.out.println("Tienes en tu inventario: ");
        int i;
        for (i = 0; i < 4; i++) {

            System.out.println(" - "+cantidad[i]+" "+objeto[i]);
        }
    }
    }