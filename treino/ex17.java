import java.util.Scanner;
import java.util.Random;

public class ex17 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        boolean acertou = false;
        int tentativas = 10;
        int numeroSecreto = random.nextInt();
        long chute = 0;

        
        while(tentativas > 0 && acertou == false) {
            System.out.println("Qual seu chute?");
            chute = input.nextLong();
            if(numeroSecreto == chute) {
                System.out.println("PARABÉNS, VOCÊ ACERTOU!");
                acertou = true;
                input.close();
            }
            else if(chute < numeroSecreto) {
                --tentativas;
                System.out.println("Número muito pequeno! " + tentativas + " tentativas restantes.");
            }
            else {
                --tentativas;
                System.out.println("Número muito alto! " + tentativas + " tentativas restantes.");
        if (tentativas == 0 && acertou == false) {
            System.out.println("Você perdeu");
            input.close();
        }
            }
        }
    }
}
