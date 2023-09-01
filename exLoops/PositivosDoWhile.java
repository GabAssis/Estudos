package exLoops;

import java.util.Scanner;

public class PositivosDoWhile {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num1,soma = 0;

        do {
            System.out.println("Digite um número: ");
            num1 = leia.nextInt();
            soma = soma + num1;

        }while (num1 != 0);
        System.out.printf("A soma dos números positivos é: %d",soma);
    }
}
