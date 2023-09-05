package exQueue;

import java.util.Scanner;
import java.util.Stack;

public class Ex2Queue {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Stack<String> livros = new Stack<>();
        int escolha;

        System.out.println("*********************************");
        System.out.println("1 - Adicionar livro na pilha");
        System.out.println("2 - Listar todos os livros");
        System.out.println("3 - Retirar livro da pilha");
        System.out.println("0 - Sair");
        System.out.println("*********************************");

        do {
            System.out.println("Entre com opção desejada:");
            escolha = Integer.parseInt(leia.nextLine());
            switch (escolha) {
                case 1 -> {
                    System.out.println("Digite o nome do livro que deseja adicionar:");
                    livros.add(leia.nextLine());
                }
                case 2 -> System.out.println(livros);
                case 3 -> {
                    if (livros.isEmpty()) {
                        System.out.println("A fila está vazia!");
                    } else {
                        livros.pop();
                        System.out.println("Livro retirado da pilha!");
                    }
                }
                case 0 -> System.out.println("Saiu!");
                default -> System.out.println("Opção inválida!");
            }
        } while (escolha != 0);
        System.out.println("Programa finalizado!");
    }
}
