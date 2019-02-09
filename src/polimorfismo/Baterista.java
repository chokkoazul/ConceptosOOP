package polimorfismo;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class Baterista extends Musico {

    private Integer numeroDeBaquetas;

    @Override
    public void tocar() {
        System.out.println("Toca bateria con los ojos vendados...");
    }

    @Override
    public void darAutografos() {
        System.out.println("Da autografos solo en cuadernos...");
    }
}
