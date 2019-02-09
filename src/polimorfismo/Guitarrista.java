package polimorfismo;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class Guitarrista extends Musico {
    private Integer numeroDePuas;

    @Override
    public void tocar() {
        System.out.println("Toca guitarra arriba de los parlantes...");
    }

    @Override
    public void darAutografos() {
        System.out.println("Da autografos y regalar una pua al fan...");
    }
}
