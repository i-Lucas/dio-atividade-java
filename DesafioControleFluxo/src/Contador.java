import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    private static final Scanner terminal = new Scanner(System.in);

    public static void main(String[] args) {
        int parametroUm = readIntegerInput("Digite o primeiro parâmetro: ");
        int parametroDois = readIntegerInput("Digite o segundo parâmetro: ");

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }

        terminal.close();
    }

    private static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        for (int i = 1; i <= parametroDois - parametroUm; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }

    private static int readIntegerInput(String message) {
        System.out.println(message);
        while (true) {
            try {
                return terminal.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                terminal.next();
            }
        }
    }
}
