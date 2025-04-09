package Exercicio01;

public class TesteCalculadora {
    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 5;
        double num3 = 0;

        System.out.println("Soma: " + Calculadora.somar(num1, num2));
        System.out.println("Subtração: " + Calculadora.subtrair(num1, num2));
        System.out.println("Multiplicação: " + Calculadora.multiplicar(num1, num2));
        System.out.println("Divisão: " + Calculadora.dividir(num1, num2));
    }
}

