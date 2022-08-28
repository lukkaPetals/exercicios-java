public class ex10 {
    public static void main(String[] args) {

        int x, y, z, h;
        double a, b, c;

        x = 10;
        y = 6;
        z = 3;
        a = 3;
        b = 1;
        c = (double)x / y;
        //só precisa ser declarado o casting apenas uma vez
        h = (int)c;

        System.out.println("x = " + h);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
