package inversiondedependenciamal;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class CarroDeCompras {

    public void pagar(){
        SqlServerDataBase sqlServerDataBase = new SqlServerDataBase();
        sqlServerDataBase.guardarTransaccion();

        TarjetaDeCredito tarjetaDeCredito = new TarjetaDeCredito();
        tarjetaDeCredito.pagar();
    }
}
