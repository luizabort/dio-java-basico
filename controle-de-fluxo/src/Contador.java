import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int primeiroNumero = terminal.nextInt();

        System.out.println("Digite o segundo número");
        int segundoNumero = terminal.nextInt();

        try {
            comparaNumeros(primeiroNumero, segundoNumero);
        } catch (ParametrosInvalidosException e) {
                System.out.println("O segundo parâmetro deve ser maior que o primeiro");

        }
    }

    public static void comparaNumeros(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException{
        if (segundoNumero > primeiroNumero) {
            int diferenca = segundoNumero - primeiroNumero;
            for (int i = 1; i <= diferenca; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } else {
            throw new ParametrosInvalidosException();
        }
    }
}
