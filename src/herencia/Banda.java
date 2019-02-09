package herencia;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class Banda {
    protected Integer id;
    protected String nombre;
    protected String apellido;

    public Banda(Integer id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    protected void tocar(){
        System.out.println("Tocar");
    }

    protected void darAutografos(){
        System.out.println("Dar Autografos");
    }
}
