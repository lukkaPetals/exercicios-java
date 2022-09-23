import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double lado;

        System.out.println("Informe o tamanho do lado do quadrado: ");
        lado = Integer.parseInt(input.nextLine());
        System.out.println("O tamanho do quadrado é igual: " + lado * lado);
        
        input.close();
    
    }
}
