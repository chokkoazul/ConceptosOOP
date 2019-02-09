package sobrecarga;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = 18;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        this.apellido = nombre;
        this.edad = 18;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }

    public static void main(String[] args){
        Persona personaBasica = new Persona("Cristian");
        Persona personaIntermedia = new Persona("Cristian", "Osorio");
        Persona personaCompleta = new Persona("Cristian", "Osorio", 34);

        System.out.println(personaBasica.toString());
        System.out.println(personaIntermedia.toString());
        System.out.println(personaCompleta.toString());

    }
}
