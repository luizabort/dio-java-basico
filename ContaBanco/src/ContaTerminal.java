import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Conhecer e importar a classe scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Exibir as mensagens para o usuário
        System.out.println("Por favor, digite o número de sua conta:");
        int numero = scanner.nextInt();

        System.out.println("Digite o número da sua agência:");
        String agencia = scanner.next();
     
        /*
         * Uma opção que pode ser utilizada no caso de duas strings juntas (nome e sobrenome, por exemplo), é o scanner.nextLine().
         * O scanner.nextLine() consome um enter ao invés de um espaço. Ou seja, como haviam outras formas de scanner antes, que consumiam apenas espaço, o nextLine() consome o enter que "sobrou".
         * Para contornar esse problema, deve-se utilizar o scanner.nextLine(); após os demais scanners.
         * Um exemplo:
         * int numero = scanner.nextInt();
         * scanner.nextLine(); -> vai consumir o enter que "sobrou" após ser inserida a informação pelo usuário.
         */

        // System.out.println("Qual o seu nome?");
        // String nome = scanner.nextLine();

        System.out.println("Qual o seu nome?");
        String nome = scanner.next();

        System.out.println("Qual o seu sobrenome?");
        String sobrenome = scanner.next();

        String nomeCompleto = nome.concat(" " + sobrenome);

        System.out.println("Saldo a ser sacado:");
        double saldo = scanner.nextDouble();

        // Obter pela classe scanner os valores digitados no terminal

        // Exibir a mensagem final da conta criada
        System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia
                + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
