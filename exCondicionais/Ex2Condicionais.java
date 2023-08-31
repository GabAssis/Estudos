package exCondicionais;

import java.util.Scanner;

public class Ex2Condicionais {

	public static void main(String[] args) {
		
		int num1;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de um número real inteiro: ");
		num1 = leia.nextInt();
		
		if(num1%2==0) {
			if(num1  < 0) {
				System.out.printf(" O número %d é par e negativo",num1);
			}else {
				System.out.printf("O núemero %d é par e postivo",num1);
			}
		}else if(num1%2!=0) {
			if(num1 < 0) {
				System.out.printf("O número %d é ímpar e negativo",num1);
			}else {
				System.out.printf("O número %d é ímpar e positivo",num1);
			}
		}
		
		
	}
	
	
}
