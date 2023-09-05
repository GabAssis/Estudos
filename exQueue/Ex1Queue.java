package exQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex1Queue {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Queue<String> clientesBanco = new LinkedList<>();
        int escolha;

        System.out.println("*********************************");
        System.out.println("1 - Adicionar Clientes na fila");
        System.out.println("2 - Listar todos os clientes");
        System.out.println("3 - Retirar Cliente da fila");
        System.out.println("0 - Sair");
        System.out.println("*********************************");

        do {
            System.out.println("Entre com opção desejada:");
            escolha = Integer.parseInt(leia.nextLine());
            switch (escolha) {
                case 1 -> {
                    System.out.println("Digite o nome do cliente que deseja adicionar:");
                    clientesBanco.add(leia.nextLine());
                    System.out.println("Cliente adicionado!");
                }
                case 2 -> {
                    System.out.println(clientesBanco);
                }
                case 3 -> {
                    if (clientesBanco.isEmpty()) {
                        System.out.println("A fila está vazia!");
                    } else {
                        clientesBanco.remove();
                        System.out.println("O cliente foi chamado!");
                    }
                }
                case 0 -> System.out.println("Programa finalizado!");
                default -> System.out.println("Opção inválida!");
            }
        } while (escolha != 0);
    }
}

