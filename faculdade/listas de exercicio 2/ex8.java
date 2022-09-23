import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int num2;

        System.out.println("Digite um número: ");
        num = Integer.parseInt(input.nextLine());

        System.out.println("Digite um número: ");
        num2 = Integer.parseInt(input.nextLine());
        
       while(num <= num2) {
        System.out.println(num);
        num++;
       }

        input.close();
    }
}
