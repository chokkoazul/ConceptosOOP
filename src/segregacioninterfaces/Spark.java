package segregacioninterfaces;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class Spark implements Auto {
    @Override
    public void encenderMotor() {
        System.out.println("Encender motor del chevrolet spark");
    }

    @Override
    public void acelerarMotor() {
        System.out.println("Acelerar motor del chevrolet spark");
    }
}
