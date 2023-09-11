package exLojaGames;

import exClientes.DadosClientes;

import java.util.Scanner;

public class TestaGames {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Games jogo1 = new Games();

        System.out.println("Digite o nome do jogo: ");
        jogo1.setNomeDoJogo(leia.nextLine());
        System.out.println("Digite a plataforma do jogo: ");
        jogo1.setPlataformaJogo(leia.nextLine());
        System.out.println("O jogo é para maiores de idade?(true para SIM/false para NÃO): ");
        jogo1.setMaiorIdade(leia.nextBoolean());
        System.out.println("Digite o tipo do jogo: ");
        leia.nextLine();
        jogo1.setTipoJogo(leia.nextLine());
        System.out.println("Digite o valor do jogo: ");
        jogo1.setValorJogo(leia.nextFloat());

        System.out.println("Digite a idade do comprador: ");
        jogo1.liberarVenda(leia.nextInt());

        jogo1.visualizar();
    }
}
