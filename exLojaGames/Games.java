package exLojaGames;

import java.util.Scanner;

public class Games {

    private String nomeDoJogo;
    private String plataformaJogo;
    private boolean maiorIdade;
    private String tipoJogo;
    private float valorJogo;

    //CONSTRUCTORS
    //DEIXEI APENAS O PADRÃO POR JA UTILIZAR A ESTRUTURA DE GET AND SET

    //METHODS
    public boolean liberarVenda(int idade) {

        if ((idade >= 18) && isMaiorIdade()) {
            System.out.println("\nJOGO LIBERADO PARA O COMPRADOR!");
            return true;
        } else{
            System.out.println("\nJOGO PROIBIDO PARA O COMPRADOR!");
            return false;
        }
    }
    public void visualizar() {
        System.out.printf("O nome do jogo é: %s",getNomeDoJogo());
        System.out.printf("\nA plataforma do jogo é: %s",getPlataformaJogo());
        System.out.printf("\nO jogo é para maiores de 18 anos? %b",isMaiorIdade());
        System.out.printf("\nO jogo é do tipo: %s",getTipoJogo());
        System.out.printf("\nO valor do jogo é: %.2f",getValorJogo());
    }

    public String getNomeDoJogo() {
        return nomeDoJogo;
    }

    public void setNomeDoJogo(String nomeDoJogo) {
        this.nomeDoJogo = nomeDoJogo;
    }

    public String getPlataformaJogo() {
        return plataformaJogo;
    }

    public void setPlataformaJogo(String plataformaJogo) {
        this.plataformaJogo = plataformaJogo;
    }

    public boolean isMaiorIdade() {
        return maiorIdade;
    }

    public void setMaiorIdade(boolean maiorIdade) {
        this.maiorIdade = maiorIdade;
    }

    public String getTipoJogo() {
        return tipoJogo;
    }

    public void setTipoJogo(String tipoJogo) {
        this.tipoJogo = tipoJogo;
    }

    public float getValorJogo() {
        return valorJogo;
    }

    public void setValorJogo(float valorJogo) {
        this.valorJogo = valorJogo;
    }
}
