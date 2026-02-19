
import java.util.Scanner;

class BankAccount {

    private String nome;
    private String senha;
    private int contaId;
    private double saldo;

    public BankAccount(String nome, String senha, int contaId) {
        if (senha.length() < 7) {
            System.out.println("Senha deve ter no mínimo 7 caracteres.");
            return;
        }

        this.nome = nome;
        this.senha = senha;
        this.contaId = contaId;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido.");
        } else {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        }
    }

    public void verSaldo() {
        System.out.println("Seu saldo atual é: R$ " + saldo);
    }

    public String getNome() {
        return nome;
    }
}


public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        System.out.println("=== CRIAR CONTA ===");
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua senha (mín. 7 caracteres): ");
        String senha = scanner.nextLine();

        BankAccount conta = new BankAccount(nome, senha, 1);

        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    conta.verSaldo();
                    break;

                case 2:
                    System.out.print("Digite o valor para depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;

                case 3:
                    System.out.print("Digite o valor para saque: ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}