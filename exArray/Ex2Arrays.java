package exArray;

import java.util.Scanner;

public class Ex2Arrays {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] numerosInteiros = new int[10];
        int sum = 0;
        double media;

        for (int i = 0;i < numerosInteiros.length;i++){
            System.out.println("Digite o "+(i+1)+"º número");
            numerosInteiros[i] = leia.nextInt();
        }
        System.out.println("\nOs elementos nos indices ímpares são: ");
        for(int i = 1;i < numerosInteiros.length; i+=2){
            System.out.print(numerosInteiros[i]+",");
        }
        System.out.println("\nOs elementos pares do vetor são: ");
        for (int i = 0;i < numerosInteiros.length;i++){
            sum+=numerosInteiros[i];
            if (numerosInteiros[i]%2==0){
                System.out.print(numerosInteiros[i]+",");
            }
        }
        System.out.println("\nSoma de todos os elementos do vetor: " + sum);

        media = (sum/10.0);
        System.out.println("Média dos elementos do vetor: " + media);
    }
}
