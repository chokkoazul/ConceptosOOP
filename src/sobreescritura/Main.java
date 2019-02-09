package sobreescritura;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class Main {

    public static void main(String[] args) {
        Musico musico = new Musico();
        Musico guitarrista = new Guitarrista();

        musico.tocar();
        guitarrista.tocar();

    }
}
