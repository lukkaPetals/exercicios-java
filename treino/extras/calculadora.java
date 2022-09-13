import java.util.Scanner;


public class calculadora {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int menu = 0;
        double pri, seg;
        int continuar = 0;


        while (continuar == 0) {
            System.out.println("Escolha a operação matématica");
            System.out.println("1- Soma");
            System.out.println("2- Subtração");
            System.out.println("3- Multiplicação");
            System.out.println("4- Divisão");
            System.out.println("5- Sair");
            menu = input.nextInt();

            switch(menu) {
                case 1:
                    System.out.print("Digite o primeiro digito: ");
                    pri = input.nextFloat();
                    System.out.print("Digite o segundo número: ");
                    seg = input.nextFloat();
                    System.out.println("A soma de  " + pri + " com " + seg + " é igual a: " + (pri + seg));
                    break;
                case 2:
                    System.out.print("Digite o primeiro digito: ");
                    pri = input.nextFloat();
                    System.out.print("Digite o segundo número: ");
                    seg = input.nextFloat();
                    System.out.println("A subtração de  " + pri + " com " + seg + " é igual a: " + (pri - seg));
                    break;
                case 3:
                    System.out.print("Digite o primeiro digito: ");
                    pri = input.nextFloat();
                    System.out.print("Digite o segundo número: ");
                    seg = input.nextFloat();
                    System.out.println("A multiplicação de  " + pri + " com " + seg + " é igual a: " + (pri * seg));
                    break;
                case 4:
                    System.out.print("Digite o primeiro digito: ");
                    pri = input.nextFloat();
                    System.out.print("Digite o segundo número: ");
                    seg = input.nextFloat();
                    if(pri % seg != 0) {}
                    System.out.println("divisão de  " + pri + " com " + seg + " é igual a: " + (pri / seg));
                    break;
                case 5:
                    System.out.print("Obrigado por usar o programa");
                    continuar = 1;
                    input.close();
                default:
                    System.out.println("Digite uma função  existente");
            }
                        }
                    }
                }
