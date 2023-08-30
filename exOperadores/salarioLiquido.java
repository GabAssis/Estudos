package exOperadores;

import java.util.Scanner;

public class salarioLiquido {

	public static void main(String[] args) {

		float salarioBruto, addNoturno, horaExtra, descontos, salarioLiquido;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nDigite o salário bruto: ");
		salarioBruto = leia.nextFloat();

		System.out.println("\nDigite o  adicional noturno: ");
		addNoturno = leia.nextFloat();

		System.out.println("\nDigite a quantidade de hora extra: ");
		horaExtra = leia.nextFloat();

		System.out.println("\nDigite os descontos do mês: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + addNoturno + (horaExtra * 5) - descontos;
		
		System.out.printf("O salário líquido do funcionário: %.2f", salarioLiquido);

	}

}
