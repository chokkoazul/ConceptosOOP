package openclose.con;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class Main {
    public static void main(String[] args){
        Vehiculo motocicleta = new Motocicleta();
        Vehiculo auto = new Auto();

        motocicleta.pintar();
        auto.pintar();
    }
}
