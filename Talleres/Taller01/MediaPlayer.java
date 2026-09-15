package Talleres.Taller01;

public class MediaPlayer {
 

    public enum PlaybackState {
        PLAYING,
        STOPPED
    }
 
    private static final int VOLUMEN_MINIMO = 0;
    private static final int VOLUMEN_MAXIMO = 100;
    private static final int PASO_VOLUMEN = 5;
 

    private int volume;
    private PlaybackState playbackState;
 


    public MediaPlayer(int volumeInicial) {
        if (volumeInicial < VOLUMEN_MINIMO || volumeInicial > VOLUMEN_MAXIMO) {
            throw new IllegalArgumentException("El volumen inicial debe estar entre "
                    + VOLUMEN_MINIMO + " y " + VOLUMEN_MAXIMO + ".");
        }
        this.volume = volumeInicial;
        this.playbackState = PlaybackState.STOPPED;
    }
 

    public MediaPlayer() {
        this(50);
    }
 

 
    public int getVolume() {
        return volume;
    }
 
    public PlaybackState getPlaybackState() {
        return playbackState;
    }
 
    public boolean isPlaying() {
        return playbackState == PlaybackState.PLAYING;
    }
 

 
    public boolean increaseVolume() {
        if (volume >= VOLUMEN_MAXIMO) {
            System.out.println("No se puede aumentar el volumen: ya está en el máximo ("
                    + VOLUMEN_MAXIMO + ").");
            return false;
        }
        volume = Math.min(volume + PASO_VOLUMEN, VOLUMEN_MAXIMO);
        System.out.println("Volumen aumentado a: " + volume);
        return true;
    }
 

    public boolean decreaseVolume() {
        if (volume <= VOLUMEN_MINIMO) {
            System.out.println("No se puede disminuir el volumen: ya está en el mínimo (" + VOLUMEN_MINIMO + ").");
            return false;
        }
        volume = Math.max(volume - PASO_VOLUMEN, VOLUMEN_MINIMO);
        System.out.println("Volumen disminuido a: " + volume);
        return true;
    }
 



    public boolean play() {
        if (playbackState == PlaybackState.PLAYING) {
            System.out.println("El reproductor ya se encuentra reproduciendo.");
            return false;
        }
        playbackState = PlaybackState.PLAYING;
        System.out.println("Reproducción iniciada.");
        return true;
    }
 

    
    public boolean stop() {
        if (playbackState == PlaybackState.STOPPED) {
            System.out.println("El reproductor ya se encuentra detenido.");
            return false;
        }
        playbackState = PlaybackState.STOPPED;
        System.out.println("Reproducción detenida.");
        return true;
    }
 
    @Override
    public String toString() {
        return String.format("Reproductor[Volumen: %d - Estado: %s]", volume, playbackState);
    }
}
