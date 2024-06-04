import java.util.Scanner;

public class VerificacaoContaBancaria {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Informe o seu número de conta:");
        String numeroConta = scanner.nextLine();

        try {
            verificarConta(numeroConta);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void verificarConta(String numeroConta){
        if(numeroConta.length() == 8){
            System.out.println("Numero de conta valido.");
        } else {
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}
