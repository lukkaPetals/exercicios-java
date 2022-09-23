import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double peso;
        double altura;

        System.out.println("Digite a sua altura");
        altura = Integer.parseInt(input.nextLine());
        System.out.println("Digite seu peso");
        peso = Integer.parseInt(input.nextLine());
        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);
        
        input.close();
    }
}
