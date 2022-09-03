import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira um número inteiro: ");
        int numero = input.nextInt();
        input.close();
        
        if((numero % 2 != 0) || (numero < 20)) {
            System.out.println("OK");
        }

        
    }
}
//|| = ou e && = e 
