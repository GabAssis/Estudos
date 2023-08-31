package exCondicionais;

import java.util.Scanner;

public class Ex3Condicionais {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean fDonation;
		boolean apto = false;
		
		System.out.println("Digite o seu nome: ");
		nome = leia.nextLine();
		System.out.println("Digite o sua idade ");
		idade = leia.nextInt();
		System.out.println("É sua primeira doação? true para sim e false para não?");
		fDonation = leia.nextBoolean();
		
		if(idade >= 18  && idade  <= 69 ) {
				apto = true;
			}else if((idade >=  60 && idade  <69) && fDonation == false) {
				apto =  true;
			}else if((idade >=  60 && idade  <69) && fDonation == true){
				apto = false;
				
			}else { apto = false;}
		
		if(apto) {
			System.out.printf(" %s está apto para doar sangue!",nome);
		}else {
			System.out.printf(" %s não está apto para doar sangue!",nome);
		}

	}
	
}	
