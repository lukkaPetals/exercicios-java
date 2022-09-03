import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Qual seu nome?: ");
        String primeiroNome = input.nextLine();
        //Lê até o space
        System.out.print("Qual sua idade?: ");
        int idade = input.nextInt();

        if(idade >= 18) {
            System.out.println(primeiroNome + ", você é maior de idade");
        }
        
        else if(idade < 1) {
            System.out.println("Idade invalida");
        }
        else {
            System.out.println(primeiroNome + ", você é menor de idade");
        }

        input.close();
    }
}
