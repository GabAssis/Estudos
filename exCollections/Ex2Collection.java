package exCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex2Collection {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2,5,1,3,4,9,7,8,10,6));
        int num1;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o número que deseja encontrar: ");
        num1 = leia.nextInt();

        if(nums.contains(num1)){
            int indice = nums.indexOf(num1);
            System.out.printf("O número %d está localizado na posição: %d",num1,indice);
        }else{
            System.out.printf("O número %d não foi encontrado!",num1);
        }
    }
}
