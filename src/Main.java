import java.lang.Math;
public class Main {

    public static int somar(int num1, int num2) {
        return num1 + num2;
    }

    public static int sub(int num1, int num2) {
        return num1 - num2;
    }

    public static int multi(int num1, int num2) {
        return num1 * num2;
    }

    public static double div(double num1, double num2) {
        return num1 / num2;
    }
    public static double exp(double num1, double num2) {
        return Math.pow(num1,num2);
    }

    public static void main(String[] args) {

        String operacao = args[1];
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[2]);

        switch (operacao) {
            case "+" -> {
                int resultado = somar(num1, num2);
                System.out.printf("Resultado da soma: %d\n", resultado);
            }
            case "-" -> {
                int resultado = sub(num1, num2);
                System.out.printf("Resultado da subtração: %d\n", resultado);
            }
            case "x" -> {
                int resultado = multi(num1, num2);
                System.out.printf("Resultado da multiplicação: %d\n", resultado);
            }
            case ":" -> {
                double resultado = div(num1, num2);
                System.out.printf("Resultado da divisão: %.2f\n", resultado);
            }
            case "^" -> {
                double resultado = exp(num1, num2);
                System.out.printf("Resultado da exponenciação: %.2f\n", resultado);
            }
            default -> System.out.println("Operação Inválida!");
        }
    }
}