package exCollections;

import java.util.*;

public class Ex3Collection {
    public static void main(String[] args) {
        Set<Integer> setNums = new HashSet<Integer>();
        Scanner leia = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %dº número: ",i+1);
            setNums.add(leia.nextInt());
        }
        Iterator<Integer> iNums = setNums.iterator();
        System.out.println("Listar dados do Set: ");
        while (iNums.hasNext()){
            System.out.println(iNums.next());
        }
    }
}
