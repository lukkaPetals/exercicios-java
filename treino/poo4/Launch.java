package poo4;

public class Launch {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC", "Amarela", 0.4f);

        c1.status();    

        System.out.println("Tenho uma caneta" + c1.getModelo() + " de ponta " + c1.getPonta());
    }

}
