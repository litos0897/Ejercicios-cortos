/*Crea una función estática llamada lanzarDado() que no reciba parámetros y devuelva un número aleatorio entre 1 y 6.
  Desde main, llama a la función varias veces (por ejemplo, dentro de un for) y muestra cada lanzamiento.*/

public class Dado {
    public static void lanzarDado() {
    int numero=(int) (Math.random()*6)+1;
    System.out.println("Ha salido el número " + numero);

    }
    public static void main (String[] args) {
        for (int i=1;i<=10;i++) {
            System.out.println("Lanzamiento " + i + ":");
            lanzarDado();
        }

    }

}
