import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    private static final Scanner scanner = new Scanner(System.in).useLocale(Locale.getDefault());

    public static void main(String[] args) {
        Conta conta = getUserInput();
        showMessage(conta);
        scanner.close();
    }

    private static Conta getUserInput() {
        int accountNumber = readAccountNumber();
        String agency = readAgency();
        String name = readName();
        double balance = readBalance();
        return new Conta(accountNumber, agency, name, balance);
    }

    private static int readAccountNumber() {
        System.out.println("Por favor, digite o número da conta:");
        return readIntegerInput("Número inválido! Por favor, digite um número válido:");
    }

    private static String readAgency() {
        System.out.println("Por favor, digite a agência:");
        return scanner.next();
    }

    private static String readName() {
        System.out.println("Por favor, digite o seu nome:");
        return scanner.next();
    }

    private static double readBalance() {
        System.out.println("Por favor, informe uma quantia para depositar:");
        return readDoubleInput("Valor inválido! Por favor, digite uma quantia válida:");
    }

    private static int readIntegerInput(String errorMessage) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(errorMessage);
                scanner.next();
            }
        }
    }

    private static double readDoubleInput(String errorMessage) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println(errorMessage);
                scanner.next();
            }
        }
    }

    private static void showMessage(Conta conta) {
        String message = createMessage(conta);
        System.out.println(message);
    }

    private static String createMessage(Conta conta) {
        return String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo é de %.2f.\nO saldo Já está disponível para saque.",
                conta.getNome(), conta.getAgencia(), conta.getNumero(), conta.getSaldo());
    }
}