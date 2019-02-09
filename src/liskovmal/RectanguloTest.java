package liskovmal;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */

public class RectanguloTest {

    @Test
    public void testCalcularArea(){
        Rectangulo rectangulo = new Cuadrado();
        rectangulo.setAlto(3);
        rectangulo.setAncho(2);
        assertEquals(6, rectangulo.calcularArea());
    }
}