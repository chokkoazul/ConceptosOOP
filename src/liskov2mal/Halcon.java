package liskov2mal;

import liskov2bien.AveVoladora;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class Halcon extends AveVoladora {
    @Override
    public String comer() {
        return "Comiendo patos...";
    }

    @Override
    public String volar() {
        return "Soy un halcon y estoy volando sobre las montañas...";
    }
}
