package herencia;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class Baterista extends Banda {
    Integer numeroDeBaquetas;

    public Baterista(Integer numeroDeBaquetas){
        super(1, "Felipe", "Pinchokko");
        this.numeroDeBaquetas = numeroDeBaquetas;
    }

    public void armarBateria(){
        System.out.println("Armar Bateria");
    }

    public static void main(String[] args){
        Baterista baterista = new Baterista(3);
        System.out.println("baterista.id.."+baterista.id);
    }
}
