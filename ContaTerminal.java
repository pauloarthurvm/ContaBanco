import java.util.Scanner;

// Atributo	Tipo	Exemplo
// Numero	Inteiro	1021
// Agencia	Texto	067-8
// Nome Cliente	Texto	MARIO ANDRADE
// Saldo	Decimal	237.48

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ola! Qual o seu nome?");
        String nome = scanner.nextLine();
        System.out.println("Muito bem vindo " + nome + ".");
        System.out.println("Qual o numero da sua agencia?");
        System.out.print("Agencia: ");
        String agencia = scanner.nextLine();
        System.out.println("Qual o numero da sua conta?");
        System.out.print("Conta: ");
        int numero = scanner.nextInt();
        System.out.println("Qual o saldo inicial?");
        float saldo = scanner.nextFloat();

        System.out.println("\n=================\n");

        System.out.println("Ola ".concat(nome).concat(", obrigado por criar uma conta em nosso banco, sua agencia é ")
                .concat(agencia).concat(", conta ").concat(Integer.toString(numero)).concat(" e seu saldo ")
                .concat(Float.toString(saldo)).concat(" ja esta disponivel para saque"));

        scanner.close();
    }
}