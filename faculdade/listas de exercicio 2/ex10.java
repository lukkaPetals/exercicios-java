import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um número");
        int num = Integer.parseInt(input.nextLine());

        while(num > 0) {
            System.out.println("*");
            num--;

        }
        System.out.println("");

        input.close();
    }
}