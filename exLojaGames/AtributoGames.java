package exLojaGames;

import java.util.Scanner;

public class AtributoGames {

    private String nomeDoJogo;
    private boolean maiorIdade;
    private float valorJogo;
    public Scanner leia = new Scanner(System.in);

    //CONSTRUCTORS

    public AtributoGames(String nomeDoJogo, boolean maiorIdade, float valorJogo) {
        this.nomeDoJogo = nomeDoJogo;
        this.maiorIdade = maiorIdade;
        this.valorJogo = valorJogo;
    }

    //METHODS
    public void liberarVenda(int idade) {

        if ((idade >= 18) && isMaiorIdade()) {
            System.out.println("\nJOGO LIBERADO PARA O COMPRADOR!");
        } else
            System.out.println("\nJOGO PROIBIDO PARA O COMPRADOR!");

    }
    public void visualizar() {
        System.out.printf("O nome do jogo é: %s",getNomeDoJogo());
        System.out.printf("\nO jogo é para maiores de 18 anos? %b",isMaiorIdade());
        System.out.printf("\nO valor do jogo é: %.2f",getValorJogo());
    }

    public void inputGameName(){
        System.out.println("\nDigite o nome do jogo: ");
        setNomeDoJogo(leia.nextLine());
        System.out.println("O jogo é para maiores de idade?(true para SIM/false para NÃO): ");
        setMaiorIdade(leia.nextBoolean());
        System.out.println("Digite o valor do jogo: ");
        setValorJogo(leia.nextFloat());
    }

    public String getNomeDoJogo() {
        return nomeDoJogo;
    }

    public void setNomeDoJogo(String nomeDoJogo) {
        this.nomeDoJogo = nomeDoJogo;
    }

    public boolean isMaiorIdade() {
        return maiorIdade;
    }

    public void setMaiorIdade(boolean maiorIdade) {
        this.maiorIdade = maiorIdade;
    }

    public float getValorJogo() {
        return valorJogo;
    }

    public void setValorJogo(float valorJogo) {
        this.valorJogo = valorJogo;
    }
}
