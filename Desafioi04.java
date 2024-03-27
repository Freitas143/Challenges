package aula2003;

import java.util.Scanner;

public class Desafioi04 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double l1,l2,l3;
		System.out.println("Lado 1: ");
		l1 = sc.nextDouble();
		System.out.println("Lado 2: ");
		l2 = sc.nextDouble();
		System.out.println("Lado 3: ");
		l3 = sc.nextDouble();
		
		if(l1 == l2 && l2 == l3) {
			System.out.println("É um triangulo equilátero");
		}
		else if (l1 != l2 && l1 != l3) {
			System.out.println("é um triangulo escaleno");
		}
		else {
			System.out.println("é um triangulo isosceles");
		}
		
		
		sc.close();
	}

}
