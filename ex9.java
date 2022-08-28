import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double b, h, a;
        System.out.print("Infomre o valor da base: ");
        b = input.nextDouble();
        System.out.print("Informe o valor da altura>: ");
        h = input.nextDouble();
        a = (b * h);
        System.out.println("A área do retângulo é igual: " + a);
        input.close();
    }
}
