package poo7;
public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;


    public Lutador(String no, String na, int id, double al, double pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.peso = pe;
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
        calcPeso();
    }


    private void calcPeso() {
        if (this.peso <= 70) {
            this.categoria = "Leve";
        }

        else if(this.peso < 84 && this.peso > 70) {
            this.categoria = "Médio";
        }

        else {
            this.categoria = "Pesado";
        }
    }


    public void apresentar() {
        System.out.println("Ai vem " + this.nome + "! ");
    }

    public void status() {
        System.out.println("Nacionalidade: " + this.nacionalidade);
        System.out.println("Idade: " + this.idade);
        System.out.println("ALtura: " + this.altura);
        System.out.println("Peso: " + this.peso);
        System.out.println("Categorias: " + this.categoria);
        System.out.println("Vitorias: " + this.vitorias);
        System.out.println("Derrotas: " + this.derrotas);
        System.out.println("Empates: " + this.empates);
    }

    public void ganharLuta() {
        this.vitorias += 1;
    }

    public void perderLuta() {
        this.derrotas += 1;
    }

    public void empatarLuta() {
        this.empates += 1;
    }
    
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

}