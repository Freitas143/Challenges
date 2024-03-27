package aula2003;

import java.util.Scanner;

public class Desafio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um número: ");
		int n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("Este número é PAR");
		}
		else {
			System.out.println("Este número é IMPAR");
		}
		
		
		
		
		
		sc.close();

	}

}
