import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o primeiro número:");
        double numero1 = scanner.nextDouble();

        System.out.println("digite o segundo número:");
        double numero2 = scanner.nextDouble();

        System.out.println("digite o símbolo da operação (+, -, *, / ou ^):");
        char operacao = scanner.next().charAt(0);

        double resultado = 0;

        switch (operacao) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("divisão por zero não é permitida.");
                    return;
                }
                break;
            case '^':
                resultado = Math.pow(numero1, numero2);
                break;
            default:
                System.out.println("símbolo da operação inválido.");
                return;
        }

        System.out.println("resultado da operação: " + resultado);

        scanner.close();
    }
}
