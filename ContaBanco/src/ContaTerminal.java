import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
      

// Iniciando com metoodo Scanner.


Scanner scanner = new Scanner(System.in);

// Recolhendo informaÇões com o mesmo.

System.out.println("Por favor digite o número da conta");

int numeroConta = scanner.nextInt();

System.out.println("Por favor digite o número da agência");

String numeroAgencia = scanner.next();


System.out.println("Por favor digite o seu nome");

String nome = scanner.next();

System.out.println("Por favor digite o seu último nome");

String LastName = scanner.next();

// Usando o concat para concatenar o nome e sobrenome.

String nomeCompleto = nome.concat(" ").concat(LastName);

    

System.out.println("Por favor digite o saldo");

double saldo = scanner.nextDouble();

// Exibindo a mensagem final do desafio.

System.out.println("Olá "+ nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é: " + numeroAgencia +", Conta: " + numeroConta + " e seu saldo é: " + saldo + " já está disponível para saque!");


    }
}
