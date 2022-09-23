import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;;

        System.out.println("Digite um número: ");
        num = Integer.parseInt(input.nextLine());
        
       while(num != -1) {
        
        System.out.println(num);
        num--;
       }

        input.close();
    }
}
