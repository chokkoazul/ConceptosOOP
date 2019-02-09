package herencia;

import herencia.Banda;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class Tecladista extends Banda {
    Integer numeroDeTeclas;

    public Tecladista(Integer id, String nombre, String apellido) {
        super(id, nombre, apellido);
    }

    public void cambiarEfecto(){
        System.out.println("Cambiar Efecto");
    }
}
