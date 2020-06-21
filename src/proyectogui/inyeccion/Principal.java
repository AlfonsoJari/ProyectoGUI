package proyectogui.inyeccion;

public class Principal {
    public static void main(String[] args) {
        iMedio im = null;
        im = new MP3();
        im = new MP4();
        im = new iMedio() {
            @Override
            public void beginplay() {
                System.out.println("Inicio Instancia anonima");
            }

            @Override
            public void stopplay() {
                System.out.println("Detener Instancia anonima");
            }
        };
        
        MP3 mp3 = new MP3();
        ReproductorMultimedia reproductor = new ReproductorMultimedia();
        reproductor.play(mp3);
    }
}
