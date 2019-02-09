package liskov2mal;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class AveTest {

    @Test
    public void comer(){
        Ave ave = new Ave();
        assertTrue(ave.comer() instanceof String);
    }

    @Test
    public void volar(){
        Ave ave = new Pinguino();
        assertTrue(ave.volar() instanceof String);
    }

}