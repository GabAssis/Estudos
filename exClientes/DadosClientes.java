package exClientes;

import java.util.Scanner;

public class DadosClientes {
    //ATRIBUTOS
    private String nome;
    private int idade;
    private float altura;
    private char sexo;
    private float peso;
    public final Scanner leia = new Scanner(System.in);
    //CONSTRUCTORS

    public DadosClientes(String nome, int idade, float altura, char sexo, float peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.sexo = sexo;
        this.peso = peso;
    }

    //METHODS
    public float imc(){
        return getPeso()/(getAltura()*2);
    }

    public void inputCliente(){

        System.out.println("\nDigite o nome do cliente: ");
        setNome(leia.nextLine());
        System.out.println("Digite a idade do cliente: ");
        setIdade(leia.nextInt());
        System.out.println("Digite a altura do cliente: ");
        setAltura(leia.nextFloat());
        System.out.println("Digite o sexo do cliente: ");
        setSexo(leia.next().charAt(0));
        System.out.println("Digite o peso do cliente: ");
        setPeso(leia.nextFloat());
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