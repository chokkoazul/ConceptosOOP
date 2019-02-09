package encapsulacion;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class Main {

    public static void main(String[] args){
        Persona persona = new Persona();
        persona.setNombre("Cristian");
        System.out.println(persona.getNombre());
    }
}

