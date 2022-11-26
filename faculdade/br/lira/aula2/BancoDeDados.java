public class BancoDeDados {

    String[] turma = new String[10];
    int quantidade = 0;

    public void create(String aluno) {    
        turma[quantidade] = aluno;
        quantidade++;
        //System.out.println(quantidade);
    }

    public void read() {
        for(int i = 0; i < quantidade; i++) {
            if (turma[i] == null) {
                System.out.println();
            } else {
                System.out.println(i + turma[i]);
            }
        }
    }

    public void update(int pos, String a) {
        turma[pos] = a;
    }

    public void delete(int pos) {
        int sucessor = pos + 1;
        String valor_seguinte = turma[sucessor];
        for (int i = pos; i < quantidade; i++) {
            this.update(pos, valor_seguinte);
            pos++;
            sucessor++;
        }
        turma[quantidade-1] = null; 
            
    }
}