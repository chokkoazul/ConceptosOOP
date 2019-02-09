package liskov2mal;

import liskov2bien.AveVoladora;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class Gaviota extends AveVoladora{
    @Override
    public String comer() {
        return "comiendo insectos...";
    }

    @Override
    public String volar() {
        return "Soy una gaviota volando sobre la playa...";
    }
}
