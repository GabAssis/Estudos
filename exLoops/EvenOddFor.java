package exLoops;

import java.util.Scanner;

public class EvenOddFor {
    public static void main(String[] args) {
        int num1, even = 0, odd = 0;
        Scanner leia = new Scanner(System.in);

        for (int i = 1;i <=10;i++){
            System.out.printf("Digite o %dº número: \n",i);
            num1 = leia.nextInt();
            if(num1%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.printf("Total de números pares: %d",even);
        System.out.printf("\nTotal de números ímpares: %d",odd);
    }
}
