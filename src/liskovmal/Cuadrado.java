package liskovmal;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class Cuadrado extends Rectangulo {

    @Override
    public void setAlto(int alto) {
        super.setAlto(alto);
        super.setAncho(alto);
    }

    @Override
    public void setAncho(int ancho) {
        super.setAncho(ancho);
        super.setAlto(ancho);
    }
}
