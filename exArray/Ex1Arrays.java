package exArray;

import java.util.Scanner;

public class Ex1Arrays {
    public static void main(String[] args) {

        int vetorInteiros[] = {50, 7, 22, 31, 5, 1, 44, 15, 27, 40};
        int numSearch;
        boolean find = false;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o número que deseja procurar: ");
        numSearch = leia.nextInt();

        for (int i = 0; i < vetorInteiros.length; i++) {
            if (numSearch == vetorInteiros[i]) {
                System.out.println("O número " + numSearch + " está  localizado na  posicão " + i);
                find = true;
                break;
            }
        }
        if (!find) {
            System.out.println("O número " + numSearch + " não foi localizado!");
        }
        leia.close();
    }
}
