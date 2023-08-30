package exOperadores;

import java.util.Scanner;

public class NotasAlunos {

	public static void main(String[] args) {
		
		float nota1, nota2, nota3, nota4, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("\nDigite a segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("\nDigite a terceira nota: ");
		nota3 = leia.nextFloat();
		
		System.out.println("\nDigite a quarta nota: ");
		nota4 = leia.nextFloat();
		
		media = (nota1+nota2+nota3+nota4)/4 ;
		
		System.out.printf("\nA média do aluno foi: %.2f", media);
		
	}
}
