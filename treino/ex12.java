import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Qual seu nome?: ");
        String primeiroNome = input.next();
        System.out.print("Qual o seu segundo nome?: ");
        String segundoNome = input.next();
        System.out.print("Qual sua idade?: ");
        int idade = input.nextInt();

        System.out.println("Olá " + primeiroNome + " " + segundoNome + " de " + idade + " anos");

        input.close();
    }
}