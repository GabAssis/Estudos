package exCondicionais;

import java.util.Scanner;

public class Ex1Condicional {

	public static void main(String[] args) {
		
		int A, B, C, soma;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de  A: ");
		A = leia.nextInt();
		System.out.println("Digite o valor de  B: ");
		B = leia.nextInt();
		System.out.println("Digite o valor de  C: ");
		C = leia.nextInt();
				
		soma = A + B;
		
		if(soma > C) {
			System.out.printf("A soma de %d + %d é maior que %d", A, B, C);
		}else if(soma < C) {
			System.out.printf("A soma de %d + %d é menor que %d", A, B, C);
		}else {
			System.out.printf("A soma de %d + %d é igual a %d", A, B, C);
			
		}
		
			
	}
	
}
