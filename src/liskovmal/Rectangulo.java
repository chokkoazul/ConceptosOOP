package liskovmal;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class Rectangulo {
    private int alto;
    private int ancho;

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int calcularArea(){
        return alto * ancho;
    }
}
