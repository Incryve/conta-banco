import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // int numero;
        // String agencia;
        // String nome;
        // double saldo;

        // Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Exhibir a mensagem para nosso usuário 
        System.out.println("Por favor, digite o número da Conta !");
        // Obter pela scanner os valores digitados no terminal
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome !");
        String nome = scanner.next();
        scanner.nextLine();

        System.out.println("Por favor, digite seu saldo !");
        double saldo = scanner.nextDouble();

        // Exhibir a mensagem de conta criada
        System.out.println("Ola, " + nome + ", obrigado por criar uma conta em nosso banco. Sua agencia é " + agencia + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque");
        // Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque
        
    }
}
