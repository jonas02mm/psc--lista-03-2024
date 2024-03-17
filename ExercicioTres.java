import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o valor do coeficiente 'a':");
        double a = scanner.nextDouble();

        System.out.println("digite o valor do coeficiente 'b':");
        double b = scanner.nextDouble();

        System.out.println("digite o valor do coeficiente 'c':");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;

        if (a == 0 && b == 0 && c != 0) {
            System.out.println("coeficientes informados incorretamente.");
        } else if (a == 0 && b != 0) {
            System.out.println("essa é uma equação de primeiro grau.");
            double raiz = -c / b;
            System.out.println("a raiz real da equação é: " + raiz);
        } else if (delta < 0) {
            System.out.println("esta equação não possui raízes reais.");
        } else if (delta == 0) {
            double raiz = -b / (2 * a);
            System.out.println("esta equação possui duas raízes reais iguais.");
            System.out.println("as raízes da equação são: " + raiz + " e " + raiz);
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("esta equação possui duas raízes reais diferentes.");
            System.out.println("as raízes da equação são: " + raiz1 + " e " + raiz2);
        }

        scanner.close();
    }
}
