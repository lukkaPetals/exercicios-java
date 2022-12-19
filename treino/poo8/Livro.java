package poo8;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    Livro(String t, String a, int tot, Pessoa l) {
        setAberto(false);
        setPagAtual(1);
        setTitulo(t);
        setAutor(a);
        setLeitor(l);
        setTotPaginas(tot);
    }

    public void detalhes() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Total de páginas: " + getTotPaginas());
        System.out.println("Página atual: " + getPagAtual());
        System.out.println("Aberto: " + isAberto());
        System.out.println("Leitor: " + this.leitor.getNome());

    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    @Override
    public void abrir() {
        setAberto(true);
        
    }

    @Override
    public void fechar() {
        setAberto(false);
        
    }

    @Override
    public void folhear() {
        getTotPaginas();
        
    }

    @Override
    public void avançarPag() {
        setPagAtual(+1);
        
    }

    @Override
    public void voltarPag() {
        setPagAtual(-1);
        
    }
}