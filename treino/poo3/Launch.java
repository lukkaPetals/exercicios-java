package poo3;

public class Launch {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();

        c1.modelo = "BIC";
        c1.cor = "Azul";
        //c1.ponta = 0.5f -> não é visivel para as outras classes
        c1.carga = 80; //posso usar ela aqui pois estou usando uma classe com a classe Caneta
        //c1.tampada = true;
        c1.status();

    }
}