import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int c = 0;

        System.out.println("Digite um número: ");
        num = Integer.parseInt(input.nextLine());
        
       while(c <= num) {
        System.out.println(c);
        c++;
       }

        input.close();
    }
}
