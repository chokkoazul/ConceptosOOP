package inversiondedependenciabien;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class CarroDeCompras {

    private final Persistencia persistencia;
    private final MetodoPago metodoPago;

    public CarroDeCompras(Persistencia persistencia, MetodoPago metodoPago){
        this.persistencia = persistencia;
        this.metodoPago = metodoPago;
    }

    public void pagar(){
        persistencia.guardarTransaccion();
        metodoPago.pagar();
    }
}
