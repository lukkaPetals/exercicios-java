package lira.aula4;

import java.util.Scanner;

public class Launch {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        Scanner input = new Scanner(System.in);
        double a;
        double b;
        calc.m(10);

        a = Integer.parseInt(input.nextLine());
        b = Integer.parseInt(input.nextLine());

        System.out.println(calc.soma(a, b));

        input.close();
        
    }
}
