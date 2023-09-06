package metodosTeste;

import java.util.Scanner;

import static metodosTeste.Calculos.menuCalculadora;
import static metodosTeste.Calculos. operationsMenu;

public class Calculadora {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número");
        Calculos.setNumero1(leia.nextFloat());
        System.out.println("\nDigite um segundo número");
        Calculos.setNumero2(leia.nextFloat());

        menuCalculadora();
        operationsMenu(leia.nextInt());

    }
}
