import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Insira um ano:");
        int ano = input.nextInt();

        if((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
            System.out.println("O ano é bissexto");
        }

        input.close();

    }
}
