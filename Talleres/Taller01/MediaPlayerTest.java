package Talleres.Taller01;

public class MediaPlayerTest {

 
    public static void main(String[] args) {
        MediaPlayer reproductor = new MediaPlayer(95);
 
        System.out.println(reproductor);
 
        reproductor.play();             // válido
        reproductor.play();             // inválido: ya está reproduciendo
 
        reproductor.increaseVolume();   // válido -> 100
        reproductor.increaseVolume();   // inválido: ya está en el máximo
 
        reproductor.decreaseVolume();   // válido -> 95
        reproductor.stop();             // válido
        reproductor.stop();             // inválido: ya está detenido
 
        System.out.println(reproductor);
    }
}

