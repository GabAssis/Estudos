package exClientes;

import java.util.InputMismatchException;
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
    public float imc() {
        return getPeso() / (getAltura() * 2);
    }

    public void inputCliente() {


        System.out.println("\nDigite o nome do cliente: ");
        setNome(leia.nextLine());
        while (true) {
            try {
                System.out.println("Digite a idade do cliente: ");
                setIdade(Integer.parseInt(leia.nextLine()));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Input inválido para Idade.Digite um número inteiro! ");
            }
        }
        while (true) {
            try {
                System.out.println("Digite a altura do cliente: ");
                setAltura(Float.parseFloat(leia.nextLine()));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Input inválido para altura.Digite um número ! ");
            }
        }while (true) {
                System.out.println("Digite o sexo do cliente: (M ou F)");
                String sexoCliente = String.valueOf(leia.nextLine().charAt(0));
                if(sexoCliente.equalsIgnoreCase("m")  || sexoCliente.equalsIgnoreCase("f") ){
                    setSexo(sexoCliente.charAt(0));
                } else{
                    System.out.println("String inválida");
                    continue;
                }
                break;
            }
        while (true) {
            try {
                System.out.println("Digite o peso do cliente: ");
                setPeso(Float.parseFloat(leia.nextLine()));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Input inválido para o peso.Digite um peso válido ! ");
            }
        }

    }

    public void visualizar() {
        System.out.printf("O nome do cliente é: %s", getNome());
        System.out.printf("\nA idade do cliente é: %d", getIdade());
        System.out.printf("\nA altura do cliente é: %.2f", getAltura());
        System.out.printf("\nO sexo do cliente é: %c", getSexo());
        System.out.printf("\nO peso do cliente é: %.2f", getPeso());
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