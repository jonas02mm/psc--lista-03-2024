import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o valor da compra:");
        double valorCompra = scanner.nextDouble();

        System.out.println("digite o valor pago:");
        double valorPago = scanner.nextDouble();

        double troco = valorPago - valorCompra;

        if (troco < 0) {
            System.out.println("quantia paga insuficiente para realizar a compra.");
        } else {

            int[] notas = {50, 20, 10, 5, 2, 1};


            System.out.println("troco: R$" + troco);
            for (int nota : notas) {
                int quantidadeNotas = (int) (troco / nota);
                troco %= nota;
                System.out.println("notas de R$" + nota + ": " + quantidadeNotas);
            }
        }

        scanner.close();
    }
}
