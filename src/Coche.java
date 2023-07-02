
public class Coche {
    //atributos
    String color;
    String marca;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad = 0;

    //constructor
    public Coche(String color, String marca, String modelo, Double peso, Double largo){
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
    }

    //metodos
    public void arrancar(Integer velocidad){
        this.velocidad += velocidad;
        if (this.velocidad > 0){
            System.out.println("El coche ha arrancado");
        } else {
            System.out.println("El coche no ha arrancado");
        }
    }

    //toString
    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }

};