import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.1456;
        //Essa variavel não pode ser alterada
        System.out.print("Informe o valor do raio: ");
        double raio = input.nextDouble();

        double area = raio * raio * PI;

        System.out.println("O valor da area é = " + area);
    }
}
