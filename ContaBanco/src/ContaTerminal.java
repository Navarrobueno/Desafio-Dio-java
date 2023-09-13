import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
      


Scanner scanner = new Scanner(System.in);


System.out.println("Por favor digite o número da conta");

int numeroConta = scanner.nextInt();

System.out.println("Por favor digite o número da agência");

String numeroAgencia = scanner.next();



System.out.println("Por favor digite o seu nome");

String nome = scanner.next();
    

System.out.println("Por favor digite o saldo");

double saldo = scanner.nextDouble();


System.out.println("Olá "+ nome + ", obrigado por criar uma conta em nosso banco, sua agência é: " + numeroAgencia +", Conta: " + numeroConta + " e seu saldo é: " + saldo + " já está disponível para saque!");


    }
}
