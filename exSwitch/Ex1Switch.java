package exSwitch;

import java.util.Scanner;

public class Ex1Switch {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int opcao, quantidade;
		double result;
		
		System.out.println("XXXXXXXXXXXX MENU XXXXXXXXXXXX");
		System.out.println("\nDigite 1 para Cachorro Quente ");
		System.out.println("\nDigite 2 para X-Salada        ");
		System.out.println("\nDigite 3 para X-Bacon         ");
		System.out.println("\nDigite 4 para Bauru           ");
		System.out.println("\nDigite 5 para Refrigerante    ");
		System.out.println("\nDigite 6 para Suco de laranja ");
		opcao = leia.nextInt();
		
		System.out.println("\nDigite a quantidade desejadado item: ");
		quantidade = leia.nextInt();
		
		switch(opcao){
		case 1:
			result = (quantidade * 10.00);
			System.out.println("\nProduto: Cachorro Quente");
			System.out.printf("\n\nValor total: R$ %.2f",result);
			break;
		case 2:
			result = (quantidade * 15.00);
			System.out.println("\nProduto: X-salada");
			System.out.printf("\n\nValor total: R$ %.2f",result);
			break;
		case 3:
			result = (quantidade * 18.00);
			System.out.println("\nProduto: X-Bacon");
			System.out.printf("\n\nValor total: R$ %.2f",result);
			break;
		case 4:
			result = (quantidade * 12.00);
			System.out.println("\nProduto: Bauru");
			System.out.printf("\n\nValor total: R$ %.2f",result);
			break;	
		case 5:
			result = (quantidade * 8.00);
			System.out.println("\nProduto: Refrigerante");
			System.out.printf("\n\nValor total: R$ %.2f",result);
			break;
		case 6:
			result = (quantidade * 13.00);
			System.out.println("\nProduto: Suco de laranja");
			System.out.printf("\n\nValor total: R$ %.2f",result);
			break;
		default:
			System.out.println("Opção Inválida!");	
		}
			
	}

}
