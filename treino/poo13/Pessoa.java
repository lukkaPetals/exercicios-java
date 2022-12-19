package poo13;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected char sexo;
    protected int exp;

    Pessoa(int id, String n, char s) {
        setExp(0);
        setIdade(id);
        setNome(n);
        setSexo(s);
    }

    protected void ganharExp() {
        setExp(+1);
        System.out.println("Ganhou Exp");
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

}
