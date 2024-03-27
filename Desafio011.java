package aula2003;

import java.util.Scanner;

public class Desafio011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ds;
		System.out.println("Digite o número do mês (1-12): ");
		ds = sc.nextInt();
		
		if(ds == 1) {
			System.out.println("-----------------------");
			System.out.println("Janeiro");
			System.out.println("-----------------------");
		}
		else if(ds == 2) {
			System.out.println("-----------------------");
			System.out.println("Fevereiro");
			System.out.println("-----------------------");
		}
		else if(ds == 3) {
			System.out.println("-----------------------");
			System.out.println("Março");
			System.out.println("-----------------------");
		}
		else if(ds == 4) {
			System.out.println("-----------------------");
			System.out.println("Abril");
			System.out.println("-----------------------");
		}
		else if(ds == 5) {
			System.out.println("-----------------------");
			System.out.println("Maio");
			System.out.println("-----------------------");
		}
		else if(ds == 6) {
			System.out.println("-----------------------");
			System.out.println("Junho");
			System.out.println("-----------------------");
		}
		else if(ds == 7) {
			System.out.println("-----------------------");
			System.out.println("Julho");
			System.out.println("-----------------------");
		}
		else if(ds == 8) {
			System.out.println("-----------------------");
			System.out.println("Agosto");
			System.out.println("-----------------------");
		}
		else if(ds == 9) {
			System.out.println("-----------------------");
			System.out.println("Setembro");
			System.out.println("-----------------------");
		}
		else if(ds == 10) {
			System.out.println("-----------------------");
			System.out.println("Outubro");
			System.out.println("-----------------------");;
		}
		else if(ds == 11) {
			System.out.println("-----------------------");
			System.out.println("Novembro");
			System.out.println("-----------------------");
		}
		else if(ds == 12) {
			System.out.println("-----------------------");
			System.out.println("Dezembro");
			System.out.println("-----------------------");
		}
		else {
			System.out.println("-----------------------");
			System.out.println("Mês inválido");
			System.out.println("-----------------------");
		}
		
		
		
		sc.close();
	}

}
