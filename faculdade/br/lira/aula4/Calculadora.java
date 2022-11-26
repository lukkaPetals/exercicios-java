package lira.aula4;

public class Calculadora {
    
    public static int contador = 0;

    private double memoria;

    public void m(double valor) {
        memoria = valor;
    }
    
    public void someNaMemoria(double valor) {
        memoria = memoria + valor;
        Calculadora.contador++;
    }

    public void subtraiaNaMeoria(double valor) {
        memoria = memoria - valor;
    }

    public double recuperaMemoria() {
        return memoria;
    }

    public void limpaMemoria() {
        memoria = 0;
    }

    public double soma(double num1, double num2) {
        double soma = num1 + num2;
        return soma;
    }

    public double subtração(double x, double y) {
        double sub = x - y;
        return sub;
    }

    public double multiplicacao(double x, double y) {
        double mult = x * y;
        return mult;
    }

    public double divisao(double x, double y) {
        double div = x / y;
        return div;
    }
}
