package polimorfismo;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class Concierto {

    public static void main(String[] args){
        Musico guitarrista = new Guitarrista();
        Musico baterista = new Baterista();
        Musico tecladista = new Tecladista();

        guitarrista.tocar();
        baterista.tocar();
        tecladista.tocar();

        guitarrista.darAutografos();
        baterista.darAutografos();
        tecladista.darAutografos();

    }
}
