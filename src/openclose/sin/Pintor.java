package openclose.sin;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class Pintor {

    public void pintar(Vehiculo vehiculo) {
        switch (vehiculo.getVehiculoTipo()) {
            case AUTO:
                pintarAuto();
                break;
            case MOTOCICLETA:
                pintarMotocicleta();
                break;
        }
    }

    private void pintarMotocicleta() {
        System.out.println("Pintando motocicleta...");
    }

    private void pintarAuto() {
        System.out.println("Pintando auto...");
    }


}
