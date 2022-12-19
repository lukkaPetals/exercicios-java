package poo13;

public class Video implements AcoesVideo {

    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidadas;
    private boolean reproduzindo;

    Video(String titulo) {
        setReproduzindo(false);
        setAvaliacao(1);
        setCurtidadas(0);
        setTitulo(titulo);
        
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getCurtidadas() {
        return curtidadas;
    }

    public void setCurtidadas(int curtidadas) {
        this.curtidadas = curtidadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    public int getViews() {
        return views;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    @Override
    public void play() {
        setReproduzindo(true);
        System.out.println("O vídeo está sendo reproduzido");
        
    }

    @Override
    public void pause() {
        setReproduzindo(false);
        System.out.println("O vídeo está pausado");
        
    }

    @Override
    public void like() {
        setCurtidadas(+1);
        System.out.println("O vídeo recebeu um like");
        
    }
    
}
