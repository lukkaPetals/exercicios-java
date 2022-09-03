import java.util.Scanner;

public class lista_de_exercicios {
    public static void main(String[] args) {
        //variaveis
        String[] lista = new String[18];
        String nome = "Lucas";
        String sobrenome = "Lira";
        String nomeCompleto = nome + " " + sobrenome;
        Scanner input = new Scanner(System.in);
        int menu, idade;
        int x = 3;
        int y = 2;
        boolean continuar = true;
        boolean local;
        char estadoCivil;
        float peso = 53.5f;
        float altura = 1.70f;
        float peso1 = 50;
        float peso2 = 58;
        float peso3 = 60;
        float nota1 = 8.0f;
        float nota2 = 7.3f;
        float media = (nota1 + nota2) / 2;
        double x2 = x;
        double y2 = y;
        double baseMaior = 20;
        double baseMenor = 10;
        double alturaTrapezio = 10;
        double areaTrapezio = ((baseMaior + baseMenor) / 2) * alturaTrapezio;


        //exercicios
        lista[0] = "Faça um programa que escreva no console 'Olá mundo!'";
        lista[1] = "Faça um programa que escreva no console seu nome.";
        lista[2] = "Faça um programa que escreva no console seu nome em uma linha e sua idade em outra";
        lista[3] = "Faça um programa que escreva no console seu nome completo, uma palavra em cada linha";
        lista[4] = "Faça um programa que primeiro cria as variáveis nome (string), idade (inteiro), local(booleano), logo abaixo atribua seu nome as variáveis com seu nome e idade e se você for brasileiro coloque verdadeiro. Depois escreva o valor das variáveis no console.";
        lista[5] = "Faça um programa que crie uma variável do tipo caractere com o identificador ‘estadoCivil’, coloque o valor ‘s’ para solteiro(a), ‘c’ para casado(a), ‘v’ para viúvo(a), ‘u’ para união estável e escreva o valor da variável no console.";
        lista[6] = "Faça um programa com duas variáveis do tipo ponto flutuante (float) peso e altura, preencha com seu peso e altura e escreva no console.";
        lista[7] = "Faça um programa com duas variáveis do tipo string com seu nome e sobrenome. Crie uma terceira variável nomeCompleto e concatene os valores de nome e sobrenome atribuindo a ela. Escreva no console nomeCompleto";
        lista[8] = "Faça um programa que crie duas variáveis inteiro x e y, com os valores 3 e 2, respectivamente, some e mostre o resultado no console.";
        lista[9] = "Faça um programa que crie duas variáveis inteiro x e y, com os valores 3 e 2, respectivamente, subtraia e mostre o resultado no console.";
        lista[10] = "Faça um programa que crie duas variáveis inteiro x e y, com os valores 3 e 2, respectivamente, subtraia e mostre o resultado no console.";
        lista[11] = "Faça um programa que crie duas variáveis inteiro x e y, com os valores 3 e 2, respectivamente, multiplique e mostre o resultado no console.";
        lista[12] = "Faça um programa que crie duas variáveis inteiro x e y, com os valores 3 e 2, respectivamente, divida com resultado em real e mostre o resultado no console.";
        lista[13] = "Faça um programa que crie duas variáveis inteiro x e y, com os valores 3 e 2, respectivamente, divida com resultado em inteiro e mostre o resultado no console.";
        lista[14] = "Faça um programa que crie três variáveis de ponto flutuante ‘peso1’, ‘peso2’, ‘peso3’, coloque o peso de três amigos some e mostre o resultado no console.";
        lista[15] = "Faça um programa que crie duas variáveis real ‘nota1’ e ‘nota2’, digite duas notas com décimos, calcule a média e mostre o resultado no console. A média é calculada somando as duas notas e dividindo por dois.";
        lista[16] = ". Faça um programa que cria duas variáveis ‘peso’ e ‘altura’, digite seu peso e sua altura e mostre no console o IMC. O IMC é calculado dividindo o peso pela altura multiplicada pela altura.";
        lista[17] = "Faça um programa que cria três variáveis ‘baseMaior’, ‘baseMenor’ e ‘altura’ de um trapézio, e imprima no console o valor de sua área. A área do trapézio é calculada somando a base maior com a base menor, dividindo por dois e multiplicam pela altura";

        //menu
        while (continuar == true) {
            System.out.println("Digite o exercicio de 1 a 18 que você deseja ver (digite 0 para sair)");
            menu = input.nextInt();
            switch(menu) {
                case(0):
                    System.out.println("Obrigado por usar o programa");
                    continuar = false;
                    input.close();
                    break;
                case(1):
                    System.out.println(lista[menu-1]);
                    System.out.println("Olá Mundo");
                    break;
                case(2):
                    System.out.println(lista[menu-1]);
                    System.out.println("Lucas");
                    break;
                case(3):
                    System.out.println(lista[menu-1]);
                    System.out.println("Lucas");
                    System.out.println(18);
                    break;
                case(4):
                    System.out.println(lista[menu-1]);
                    System.out.println("Lucas");
                    System.out.println("Lira");
                    System.out.println("Araújo");
                    break;
                case(5):
                    System.out.println(lista[menu-1]);
                    idade = 18;
                    local = true;
                    System.out.println(nome);
                    System.out.println(idade);
                    System.out.println(local);
                    break;
                case(6):
                    System.out.println(lista[menu-1]);
                    estadoCivil = 's';
                    System.out.println(estadoCivil);
                    break;
                case(7):
                    System.out.println(lista[menu-1]);
                    System.out.println(peso + "kg");
                    System.out.println(altura + "m");
                    break;
                case(8):
                    System.out.println(lista[menu-1]);
                    System.out.println(nomeCompleto);
                    break;
                case(9):
                    System.out.println(lista[menu-1]);
                    System.out.println(x + y);
                    break;
                case(10):
                    System.out.println(lista[menu-1]);
                    System.out.println(x - y);
                    break;
                case(11):
                    System.out.println(lista[menu-1]);
                    System.out.println(x * y);
                    break;
                case(12):
                    System.out.println(lista[menu-1]);
                    System.out.println(x2 / y2);
                    break;
                case(13):
                    System.out.println(lista[menu-1]);
                    System.out.println(x / y);
                    break;
                case(14):
                    System.out.println(lista[menu-1]);
                    System.out.println(x % y);
                    break;
                case(15):
                    System.out.println(lista[menu-1]);
                    System.out.println("Peso 1: " + peso1);
                    System.out.println("Peso 2: " + peso2);
                    System.out.println("Peso 3: " + peso3);
                    break;
                case(16):
                    System.out.println(lista[menu-1]);
                    System.out.println(media);
                    break;
                case(17):
                    System.out.println(lista[menu-1]);
                    System.out.println(peso / (altura * altura));
                    break;
                case(18):
                    System.out.println(lista[menu-1]);
                    System.out.println(areaTrapezio);
                    break;
                default:
                    System.out.println("Digite uma opção valida");
            }
        }
    }
}
