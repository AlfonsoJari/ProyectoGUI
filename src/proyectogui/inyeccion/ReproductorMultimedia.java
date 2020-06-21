package proyectogui.inyeccion;

public class ReproductorMultimedia {

    public void play(iMedio medio) {
        medio.beginplay();
    }

    public void stop(iMedio medio) {
        medio.stopplay();
    }
}
