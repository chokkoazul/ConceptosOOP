package polimorfismo;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class Tecladista extends Musico {

    private Integer numeroDeTeclas;

    @Override
    public void tocar() {
        System.out.println("Toca teclados sentado en una silla...");
    }

    @Override
    public void darAutografos() {
        System.out.println("Da autografos con dedicatorias personalizadas...");
    }
}
