package composicion;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class Auto {
    private String numeroPatente;
    private String color;
    private String marca;
    private String modelo;
    private Motor motor;

    public Auto(Motor motor) {
        this.motor = motor;
    }
}
