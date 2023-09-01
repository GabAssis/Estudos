package exLoops;

import java.util.Scanner;

public class IdadeWhile {
    public static void main(String[] args) {
        int num1, less21 = 0,  more50 = 0;

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite uma idade: ");
        num1 = leia.nextInt();

        while(num1 >= 0){
            if (num1 < 21){
                less21++;
            }else if(num1 > 50){
                more50++;
            }
            System.out.println("Digite uma idade: ");
            num1 = leia.nextInt();
        }
        System.out.printf("Total de pessoas menores de 21 anos: %d",less21);
        System.out.printf("\nTotal de pessoas maiores de 50 anos: %d",more50);
    }
}
