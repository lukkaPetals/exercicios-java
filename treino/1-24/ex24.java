public class ex24 {
    
    public static void main(String[] args) {
        
        int[] abc = {1,2,3,4,5};
        int x = 10;

        vetor(abc);
        variavelPrimitiva(x);

    }

    public static void vetor(int[] x) {

        x[0] = 200;
        System.out.println(x[0]);
    }

    public static void variavelPrimitiva(int x) {
        x = 200;
        System.out.println(x);
    }
}
