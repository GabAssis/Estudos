package exArray;

import java.util.Scanner;

public class Ex3Matriz {
    public static void main(String[] args) {
        int numerosInteiros[][] = new int[3][3];
        int somaDPrincipal = 0, somaDSecundaria = 0;
        String dPrincipal = "Diagonal principal: \n";
        String dSecundaria = "Diagonal secundária:\n";
        Scanner leia = new Scanner(System.in);

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.println("Digite um valor para a posição [" + linha + "][" + coluna + "]: ");
                numerosInteiros[linha][coluna] = leia.nextInt();
            }
        }
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                if (linha == coluna) {
                    dPrincipal += numerosInteiros[linha][coluna] + " ";
                    somaDPrincipal += numerosInteiros[linha][coluna];
                }
                if (linha + coluna == 2) {
                    dSecundaria += numerosInteiros[linha][coluna] + " ";
                    somaDSecundaria += numerosInteiros[linha][coluna];
                }
            }
        }
        System.out.println(dPrincipal);
        System.out.println(dSecundaria);
        System.out.println("Soma da diagonal principal é: \n" + somaDPrincipal);
        System.out.println("Soma dos Elementos Diagonal Secundária: \n" + somaDSecundaria);
    }
}


