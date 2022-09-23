import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        System.out.println("Escreva seu nome: ");
        nome = input.nextLine();
        System.out.println("Olá " + nome);
        input.close();
    }
}