import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Selecione a opção desejada: 1. Depositar. 2. Sacar. 3. Consultar saldo. 0. Encerrar.");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.println("Informe o valor a ser depositado:");
                    double valorDepositado = scanner.nextDouble();
                    saldo += valorDepositado;
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.println("Informe o valor a ser sacado:");
                    double valorSacado = scanner.nextDouble();
                    if (saldo >= valorSacado) {
                        saldo -= valorSacado;
                        System.out.printf("Saldo atual: %.1f\n", saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3: // TODO: Exibir o saldo atual da conta.
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false; // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}