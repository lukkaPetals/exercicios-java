package poo10;

public class Bolsista extends Aluno {
    private int bolsa;
    
    public void renovarBolsa() {
        System.out.println("Bolsa Reprovada");
    }

    @Override
    public void pagarMensalidade(){
        System.out.println("Mensalidade de 50 reais paga");
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
}