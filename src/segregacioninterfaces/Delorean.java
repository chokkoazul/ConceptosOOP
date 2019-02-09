package segregacioninterfaces;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class Delorean implements Auto, MaquinaDelTiempo {
    @Override
    public void encenderMotor() {
        System.out.println("Encender motor del DMC DeLorean");
    }

    @Override
    public void acelerarMotor() {
        System.out.println("Acelerar motor del DMC DeLorean");
    }

    @Override
    public void volverAlPasado() {
        System.out.println("Volver al pasado en el DMC DeLorean");
    }

    @Override
    public void volverAlFuturo() {
        System.out.println("Volver al futuro en el DMC DeLorean");
    }
}
