import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    double temporaria = scanner.nextDouble();
                    saldo = saldo + temporaria;
                    System.out.println("Saldo atual: "+saldo);
                    break;
                case 2:
                    double temporaria2 = scanner.nextDouble();
                    if (temporaria2 <= saldo){
                        saldo = saldo - temporaria2;
                        System.out.println("Saldo atual: "+saldo);
                    }
                    else
                        System.out.println("Saldo insuficiente.");
                    break;
                case 3:
                    System.out.println("Saldo atual: "+saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}