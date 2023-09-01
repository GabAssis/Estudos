package exLoops;

import java.util.Scanner;

public class MediaDoWhile {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int divisor = 0;
        double media ,soma = 0,num1;

        do{
            System.out.println("Digite um número: ");
            num1 = leia.nextInt();
            if (num1%3==0 && num1 != 0){
                soma += num1;
                divisor++;
            }
        }while(num1 != 0);

        media = (soma/divisor);
        System.out.printf("A média de todos os múltiplos de 3 é: %.2f",media);
    }
}
