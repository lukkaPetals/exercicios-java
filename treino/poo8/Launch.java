package poo8;

public class Launch {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        

        p.setNome("Lucas");
        p.setIdade(18);
        p.setSexo('M');
        Livro l = new Livro("Mahou", "Caio", 252, p);
        l.detalhes();

        
    }
}
