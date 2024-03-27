package aula2003;

import java.util.Scanner;

public class Desafio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int opcao = 0;
		String cpf = "00000000000";
		int senha = 0;
		double saldo = 0;
		System.out.println("O que deseja fazer: ");
		System.out.println("--------------------");
		System.out.println("[1] Criar Conta");
		System.out.println("[2] Entrar na conta");
		System.out.println("[3] Sair ");
		System.out.println("--------------------");
		System.out.println(" ");
		opcao = sc.nextInt();
		
		while (opcao != 3 ) {
			if (opcao == 1) {
				System.out.println(" ");
				System.out.println("Informe seu cpf: ");
				cpf = sc.next();
				System.out.println("Crie uma senha");
				senha = sc.nextInt();
				opcao = 2;
				
			}
			if (opcao == 2) {
				System.out.println(" ");
				System.out.println("ENTRAR");
				System.out.println(" ");
				System.out.println("Informe o cpf: ");
				String cpfd = sc.next();
				if(cpfd != cpf) {
					System.out.println("CFP NÃO ENCONTRADO");
					System.out.println("Infome novamente o CPF: ");
					cpfd = sc.next();
					}
				System.out.println("Digite a senha: ");
				int senhad = sc.nextInt();
				if(senhad != senha) {
					System.out.println(" ");
					System.out.println("SENHA INVALIDA");
					System.out.println("INFORME A SENHA: ");
					senhad = sc.nextInt();
					}
				int opcaoc = 0;
				System.out.println(" ");
				System.out.println("O que deseja fazer dentro de sua conta: ");
				System.out.println("--------------------");
				System.out.println("[1] Saque");
				System.out.println("[2] Depósito");
				System.out.println("[3] Sair ");
				System.out.println("--------------------");
				System.out.println(" ");
				opcaoc = sc.nextInt();
				while (opcaoc != 3) {
					if (opcaoc == 1) {
						System.out.println("Saldo na conta:R$ "+saldo);
						System.out.println(" ");
						
						System.out.println("Quanto deseja sacar: R$");
						double vlrasacar = sc.nextDouble();
						
						if (vlrasacar > saldo) {
							System.out.println("Voce não possui esse valor, deposite em sua conta");
							opcaoc = 2;
						}
						else {
							saldo = saldo - vlrasacar;
							System.out.println(" ");
							System.out.println("SAQUE CONFIRMADO!!!");
							System.out.println(" ");
							System.out.println("SALDO ATUAL: R$ "+saldo);
						}
					
						
						
					}
					else if (opcaoc == 2) {
						System.out.println(" ");
						System.out.println(" DEPOSITO ");
						System.out.println(" ");
						System.out.println("Saldo na conta:R$ "+saldo);
						System.out.println(" ");
						System.out.println("Quanto deseja Depositar: ");
						double vlradepositar= sc.nextDouble();
						saldo = saldo+vlradepositar;
						System.out.println(" ");
						System.out.println("SAQUE CONFIRMADO!!!");
						System.out.println(" ");
						System.out.println("Saldo na conta atual:R$ "+saldo);
						System.out.println(" ");
					
					}
					System.out.println(" ");
					System.out.println("O que deseja fazer dentro de sua conta: ");
					System.out.println("--------------------");
					System.out.println("[1] Saque");
					System.out.println("[2] Depósito");
					System.out.println("[3] Sair ");
					System.out.println("--------------------");
					System.out.println(" ");
					opcaoc = sc.nextInt();
						
				}
				
				opcaoc = 3;
				opcao = 3;
				
				
				
				
			}
			
		}
		System.out.println("PROGRAMA FINALIZADO");
		
		
		sc.close();
	}

}
