public class CocheElectrico extends Coche {

    String motorElectrico;

    public CocheElectrico(String motorElectrico, String color, String marca, String modelo, Double peso, Double largo) {
        super(color, marca, modelo, peso, largo);
        this.motorElectrico = motorElectrico;
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
    
}
