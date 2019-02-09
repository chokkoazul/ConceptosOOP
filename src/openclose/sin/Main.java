package openclose.sin;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class Main {

    public static void main(String[] args) {
        Vehiculo motocicleta = new Vehiculo();
        Vehiculo auto = new Vehiculo();
        motocicleta.setVehiculoTipo(VehiculoTipo.MOTOCICLETA);
        auto.setVehiculoTipo(VehiculoTipo.AUTO);

        Pintor pintor = new Pintor();
        pintor.pintar(motocicleta);
        pintor.pintar(auto);

    }
}
