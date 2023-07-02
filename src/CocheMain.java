public class CocheMain {
    public static void main(String[] args) {
        
        Coche cocheObj = new Coche("rojo", "alfa romeo", "giulia", 1500.0, 4.6);

        System.out.println(cocheObj.toString());
        cocheObj.arrancar(10); 

        CocheElectrico cocheElectricoObj = new CocheElectrico("motor electrico", "rojo", "alfa romeo", "giulia", 1500.0, 4.6);

        System.out.println(cocheElectricoObj.toString());
        cocheElectricoObj.arrancar(10);
    }
}
