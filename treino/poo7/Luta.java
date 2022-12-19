package poo7;

import java.util.Random;

public class Luta {
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria() == l2.getCategoria() && l1.getNome() != l2.getNome()) {
            this.desafiado = l1;
            this.desafiante = l2;

            setAprovada(true);
        }
        else {
            setAprovada(false);
            setDesafiado(null);
            setDesafiante(null);
        }
    }

    public void lutar() {
        if (this.aprovada = true) {
            desafiado.apresentar();
            desafiante.apresentar();
            Random r = new Random();
            int vencedor = r.nextInt(3);
            switch (vencedor) {
                case 0:
                    System.out.println("Empate!");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;

                case 1:
                    System.out.println(desafiado.getNome());
                    desafiado.ganharLuta();
                    desafiante.perderLuta();    
                    break;

                case 2:
                    System.out.println(desafiante.getNome());
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
            
                default:
                    System.out.println("Deu ruim");
                    break;
            }
        }

        else {
            System.out.println("A luta não pode acontecer");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }


}
