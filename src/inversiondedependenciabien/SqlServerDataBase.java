package inversiondedependenciabien;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class SqlServerDataBase implements Persistencia {

    public void guardarTransaccion() {
        System.out.println("Guardar Transaccion en Sql Server!!!");
    }
}
