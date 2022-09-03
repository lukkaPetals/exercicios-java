public class ex20 {
    public static void main(String[] args) {
        //é tipo lista em python
        int numAlunos = 5;
        double[] notasAlunos  = new double[numAlunos];
        int[] x = {1, 2, 3, 4, 5};


        notasAlunos[3] = 8;
        System.out.println(notasAlunos[0]);
        
        java.util.Arrays.fill(notasAlunos, 2, 5, 3);
        //array, inicio, limite e valor
        for(int i = 0; i < notasAlunos.length; ++i) {
            System.out.println(notasAlunos[i]);
        
        System.out.println(x);
        }
    }
}
