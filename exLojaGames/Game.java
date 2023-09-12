package exLojaGames;

public class Game extends AtributoGames{
    //ATRIBUTOS
    private String tipoDoJogo;
    //CONSTRUCTOR
    public Game(String nomeDoJogo, boolean maiorIdade, float valorJogo, String tipoDoJogo) {
        super(nomeDoJogo, maiorIdade, valorJogo);
        this.tipoDoJogo = tipoDoJogo;
    }

    @Override
    public void inputGameName(){
        super.inputGameName();
        System.out.println("Digite o estilo de jogo: ");
        leia.nextLine();
        setTipoDoJogo(leia.nextLine());
    }
    @Override
    public void visualizar(){
        super.visualizar();
        System.out.println("O estilo do jogo é: "+this.tipoDoJogo);
    }

    //GET AND SET
    public String getTipoDoJogo() {
        return tipoDoJogo;
    }
    public void setTipoDoJogo(String tipoDoJogo) {
        this.tipoDoJogo = tipoDoJogo;
    }
}
