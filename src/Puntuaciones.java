/*Crea un array con las puntuaciones de 6 partidas (valores enteros).
Recorre el array para calcular:

Puntuación total.
Media de puntos por partida.
Mayor puntuación conseguida.
Muestra todo con mensajes tipo:
"Tu récord fue de 2380 puntos en una partida."*/

public class Puntuaciones {
    public static void main(String[] args) {
        int[]puntuaciones=new int[6];
        int total=0;
        int max=0;
        int partidaMax=0;

        for (int i=0; i<puntuaciones.length; i++){
            puntuaciones[i]=(int)(Math.random()*1501)+1000;
            total=total+puntuaciones[i];

            if(puntuaciones[i]>max){
                max=puntuaciones[i];
                partidaMax=i+1;
            }
        }
        int media=(int) total/puntuaciones.length;

        System.out.println("Puntuaciones obtenidas:");
        for(int i=0; i<puntuaciones.length; i++){
            System.out.println("Partida "+(i+1)+": "+puntuaciones[i]+ " puntos");
        }

        System.out.println("\nPuntuación total: "+total+" puntos");
        System.out.println("Media de puntos por partida: "+media);
        System.out.println("Tu récord fue de "+max+" puntos en la partida nº "+partidaMax);
    }
}
