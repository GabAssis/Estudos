package exCollections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Ex1Collection {
    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<>();
        Scanner leia = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite uma cor:");
            cores.add(leia.nextLine());
        }
        System.out.println("A lista de cores é: ");
        for (String cor : cores) {
            System.out.println(cor);
        }
        cores.sort(null);
        System.out.println("A lista de cores ordenadas é: ");
        for (String cor : cores) {
            System.out.println(cor);
        }
    }
}
