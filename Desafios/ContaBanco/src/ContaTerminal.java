//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public ContaTerminal() {
    }

    public static void main(String[] args) {
        Scanner scanner = (new Scanner(System.in)).useLocale(Locale.US);
        System.out.println("Digite o número de sua conta:");
        int numeroConta = scanner.nextInt();
        System.out.println("Digite o número de sua agência:");
        String agencia = scanner.next();
        System.out.println("Digite o seu nome:");
        String nomeCliente = scanner.next();
        System.out.println("Digite o saldo que vai depositar na conta:");
        double saldo = scanner.nextDouble();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de R$" + saldo * 1.0 + " já está disponível para saque.");
    }
}
