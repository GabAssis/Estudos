package exLojaGames;

import java.util.Scanner;

public class TestaGames {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Game jogo1 = new Game("a",false,0,"a");
        ConsoleGame jogo2 = new ConsoleGame("a",false,0,"a");

        jogo1.inputGameName();
        System.out.println("Digite a idade do comprador: ");
        jogo1.liberarVenda(leia.nextInt());
        jogo1.visualizar();

        jogo2.inputGameName();
        System.out.println("Digite a idade do comprador: ");
        jogo2.liberarVenda(leia.nextInt());
        jogo2.visualizar();

    }
}
