package herencia;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class Guitarrista extends Banda {
    Integer numeroDePuas;

    public Guitarrista(Integer id, String nombre, String apellido) {
        super(id, nombre, apellido);
    }

    public void cambiarCuerdas(){
        System.out.println("Cambiar Cuerdas");
    }
}
