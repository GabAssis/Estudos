package exClientes;

public class DadosClientes {

    private String nome;
    private int idade;
    private float altura;
    private char sexo;
    private float peso;

    //CONSTRUCTORS
    //DEIXEI APENAS O PADRÃO POR JA UTILIZAR A ESTRUTURA DE GET AND SET

    //METHODS
    public float imc(){
        return getPeso()/(getAltura()*2);
    }

    public void visualizar() {
        System.out.printf("O nome do cliente é: %s",getNome());
        System.out.printf("\nA idade do cliente é: %d",getIdade());
        System.out.printf("\nA altura do cliente é: %.2f",getAltura());
        System.out.printf("\nO sexo do cliente é: %c",getSexo());
        System.out.printf("\nO peso do cliente é: %.2f",getPeso());
    }


    // GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}