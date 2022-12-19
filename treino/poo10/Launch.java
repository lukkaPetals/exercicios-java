package poo10;

public class Launch {
    public static void main(String[] args) {
        Bolsista b = new Bolsista();

        b.setNome("Lucas");
        b.pagarMensalidade();
        System.out.println(b.getNome());
    }
}
