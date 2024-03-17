import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Digite o primeiro número inteiro:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        int numero2 = scanner.nextInt();

        int menorNumero = Math.min(numero1, numero2);
        int maiorNumero = Math.max(numero1, numero2);

        if (menorNumero == maiorNumero) {
            System.out.println("Os números fornecidos são iguais. Não é possível gerar um número aleatório.");
            return;
        }
        int numeroAleatorio = menorNumero + random.nextInt(maiorNumero - menorNumero + 1);

        if (numeroAleatorio % 2 == 0) {
            System.out.println("Número gerado: " + numeroAleatorio);
            System.out.println("É um número par.");
        } else {
            System.out.println("Número gerado: " + numeroAleatorio);
            System.out.println("É um número ímpar.");
        }

        scanner.close();
    }
}
