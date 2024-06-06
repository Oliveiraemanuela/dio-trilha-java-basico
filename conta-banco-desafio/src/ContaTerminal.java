import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual o número da Conta?");
        int conta = scanner.nextInt();

        System.out.println("Digite, por favor, o número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o nome do Cliente: ");
        String primeiroNome = scanner.next();

        System.out.println("Digite o nome do Cliente: ");
        String ultimoNome = scanner.next();

        System.out.println("Saldo atual: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + primeiroNome  + " " +  ultimoNome + ", obrigada por criar uma conta em nosso banco. Aqui estão os dados da sua conta: ");
        System.out.println("Agência: " + agencia);
        System.out.println("Número da Conta: " + conta);
        System.out.println("Saldo atual: R$ " + saldo);
        System.out.println("O valor do seu saldo já está disponível para saque!! Obrigada");
        
        
    }

 }