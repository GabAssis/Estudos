package exLojaGames;

public class ConsoleGame extends AtributoGames{
    //ATRIBUTOS
    private String plataformaJogo;

    //CONSTRUCTOR

    public ConsoleGame(String nomeDoJogo, boolean maiorIdade, float valorJogo, String plataformaJogo) {
        super(nomeDoJogo, maiorIdade, valorJogo);
        this.plataformaJogo = plataformaJogo;
    }

    //MÉTODOS

    @Override
    public void inputGameName(){
        super.inputGameName();
        System.out.println("Digite a plataforma do jogo: ");
        leia.nextLine();
        setPlataformaJogo(leia.nextLine());
    }
    @Override
    public void visualizar(){
        super.visualizar();
        System.out.println("A plataforma do jogo é: ");
    }

    //GET AND SET

    public String getPlataformaJogo() {
        return plataformaJogo;
    }

    public void setPlataformaJogo(String plataformaJogo) {
        this.plataformaJogo = plataformaJogo;
    }
}
