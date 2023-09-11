package exClientes;

import java.util.Scanner;

public class TestaCliente {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        DadosClientes cliente1 = new DadosClientes();

        System.out.println("Digite o nome do cliente: ");
        cliente1.setNome(leia.nextLine());
        System.out.println("Digite a idade do cliente: ");
        cliente1.setIdade(leia.nextInt());
        System.out.println("Digite a altura do cliente: ");
        cliente1.setAltura(leia.nextFloat());
        System.out.println("Digite o sexo do cliente: ");
        cliente1.setSexo(leia.next().charAt(0));
        System.out.println("Digite o peso do cliente: ");
        cliente1.setPeso(leia.nextFloat());

        cliente1.visualizar();
        System.out.printf("\nO imc do cliente é: %f",cliente1.imc());

    }

}
