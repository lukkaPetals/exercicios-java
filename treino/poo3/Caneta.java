package poo3;


//public = todo mundo pode usar
//private = this is my privaty domicile and I will no be arrested, bitch
//protected = se estende a classe pode usar 

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada?: " + this.tampada);
    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Erro! Caneta tampada, não posso rabiscar");
        }
        else {
            System.out.println("Estou Rabiscando");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}