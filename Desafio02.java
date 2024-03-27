package aula2003;

import java.util.Scanner;

public class Desafio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um número: ");
		int n1 = sc.nextInt();
		
		if (n1 == 0) {
			System.out.println(n1+" é zero");
		}
		else if (n1 > 0) {
			System.out.println(n1+" é um numero positivo");
		}
		else {
			System.out.println(n1+" é um numero negativo");
		}
		sc.close();
		

	}

}
