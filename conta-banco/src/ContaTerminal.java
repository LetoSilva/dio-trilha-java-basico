import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner
		
		// Exibir as mensagens para o nosso usuário
		
		// Obter pela scanner os valores digítados no terminal
		
		// Exibir a mensagem conta criada
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta:");
        int numero = scanner.nextInt();

        scanner.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()

        System.out.println("Digite a agência:");
        String agencia = scanner.nextLine();

        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nossa agência " + agencia + ", sua conta é " + numero + " e seu saldo é " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
