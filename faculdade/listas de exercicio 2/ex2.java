import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        int idade;

        System.out.println("Digite seu nome");
        nome = input.nextLine();

        System.out.println("Digite sua idade");
        idade = Integer.parseInt(input.nextLine());
        
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);

        input.close();


    }
}
