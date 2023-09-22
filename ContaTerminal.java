import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String agencia = scanner.nextLine();
        System.out.println("Programa: Por favor, digite o número da Agência!");
        
        int numero = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Programa: Por favor, digite o número da Conta!");
        
        String nomeCliente = scanner.nextLine();
        System.out.println("Programa: Por favor, digite o nome do Cliente!");
        
        double saldo = scanner.nextDouble();
        System.out.println("Programa: Por favor, digite o saldo da Conta!");
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
