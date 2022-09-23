import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pnota;
        double snota;
        
        System.out.println("Digite a primeira nota: ");
        pnota = Integer.parseInt(input.nextLine());
        System.out.println("Digite a segunda nota: ");
        snota = Integer.parseInt(input.nextLine());

        double media = (pnota + snota) / 2;

        System.out.println("Primeira nota: " + pnota);
        System.out.println("Segunda nota: " + snota);
        System.out.println("Média: " + media);
        
        input.close();
    }
}
