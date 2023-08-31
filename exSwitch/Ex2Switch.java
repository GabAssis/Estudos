package exSwitch;

import java.util.Scanner;

public class Ex2Switch {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o seu nome: ");
		String nome = leia.nextLine();
		
		System.out.println("Escolha o seu cargo abaixo: ");
		System.out.println("Digite 1 para Gerente         ");
		System.out.println("Digite 2 para Vendedor        ");
		System.out.println("Digite 3 para Supervisor      ");
		System.out.println("Digite 4 para Motorista       ");
		System.out.println("Digite 5 para Estoquista      ");
		System.out.println("Digite 6 para Técnico de  TI  ");
		int cargo = leia.nextInt();
		
		System.out.println("\nDigite o seu salário: ");
		double salario = leia.nextDouble();
		double newSalario;
		
		switch(cargo) {
		case 1:
			newSalario = (salario * 1.10);
			System.out.printf("\nNome colaborador: %s",nome);
			System.out.printf("\nCargo: Gerente");
			System.out.printf("\nSalário: R$ %.2f",newSalario);
			break;
		case 2:
			newSalario = (salario * 1.07);
			System.out.printf("\nNome colaborador: %s",nome);
			System.out.printf("\nCargo: Vendedor");
			System.out.printf("\nSalário: R$ %.2f",newSalario);
			break;
		case 3:
			newSalario = (salario * 1.09);
			System.out.printf("\nNome colaborador: %s",nome);
			System.out.printf("\nCargo: Supervisor");
			System.out.printf("\nSalário: R$ %.2f",newSalario);
			break;
		case 4:
			newSalario = (salario * 1.06);
			System.out.printf("\nNome colaborador: %s",nome);
			System.out.printf("\nCargo: Motorista");
			System.out.printf("\nSalário: R$ %.2f",newSalario);
			break;
		case 5:
			newSalario = (salario * 1.05);
			System.out.printf("\nNome colaborador: %s",nome);
			System.out.printf("\nCargo: Estoquista");
			System.out.printf("\nSalário: R$ %.2f",newSalario);
			break;
		case 6:
			newSalario = (salario * 1.08);
			System.out.printf("\nNome colaborador: %s",nome);
			System.out.printf("\nCargo: Técnico de TI");
			System.out.printf("\nSalário: R$ %.2f",newSalario);
			break;
		default:
			System.out.println("Cargo inválido!");
					
		}
	}
}
