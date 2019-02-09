package polimorfismo;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public abstract class Musico {

    protected Integer id;
    protected String nombre;
    protected String apellido;

    public abstract void tocar();

    public abstract void darAutografos();

}
