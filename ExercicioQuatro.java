import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o código da operação (1 para perímetro do círculo, 2 para área do círculo, 3 para volume da esfera):");
        int operacao = scanner.nextInt();

        if (operacao < 1 || operacao > 3) {
            System.out.println("código da operação inválido.");
        } else {
            System.out.println("digite o raio:");
            double raio = scanner.nextDouble();

            switch (operacao) {
                case 1:
                    calcularPerimetroCirculo(raio);
                    break;
                case 2:
                    calcularAreaCirculo(raio);
                    break;
                case 3:
                    calcularVolumeEsfera(raio);
                    break;
            }
        }

        scanner.close();
    }

    public static void calcularPerimetroCirculo(double raio) {
        double perimetro = 2 * Math.PI * raio;
        System.out.println("o perímetro do círculo é: " + perimetro);
    }

    public static void calcularAreaCirculo(double raio) {
        double area = Math.PI * raio * raio;
        System.out.println("a área do círculo é: " + area);
    }

    public static void calcularVolumeEsfera(double raio) {
        double volume = (4.0/3.0) * Math.PI * Math.pow(raio, 3);
        System.out.println("o volume da esfera é: " + volume);
    }
}
