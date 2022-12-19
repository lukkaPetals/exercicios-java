package poo13;

public class Gafanhoto extends Pessoa {
    Gafanhoto(int id, String n, char s) {
        super(id, n, s);
        setExp(0);
        setIdade(id);
        setNome(n);
        setSexo(s);
        
    }

    private String login;
    private int totAssistido;

    public void viuMaisUm() {
        setTotAssistido(+1);
        System.out.println("Assistiu mais um vídeo");
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
}
