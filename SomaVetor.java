import java.util.Scanner;

public class SomaVetor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] numeros = new double[3];
        double soma = 0;
        int tentativas = 0;

        int i = 0;

        while (i < 3) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            tentativas++;

            if (scanner.hasNextDouble()) {
                numeros[i] = scanner.nextDouble();
                soma += numeros[i];
                i++;
            } else {
                System.out.println("Valor inválido! Digite um número.");
                scanner.next();
            }
        }

        System.out.println("\nSoma dos valores: " + soma);
        System.out.println("Quantidade de vezes que foi solicitado digitar valores: " + tentativas);

        scanner.close();
    }
}
