package exClientes;

import java.util.Scanner;

public class TestaCliente {

    public static void main(String[] args) {
        PessoaFisica cliente1 = new PessoaFisica(null,0,0,'a',0,"A");
        PessoaJuridica cliente2 = new PessoaJuridica(null,0,0,'a',0,"A");

        //menu de input dos dados do cliente 1

        //validação exception dentro do método .inputCliente();
        cliente1.inputCliente();
        cliente1.visualizar();
        System.out.printf("\nO imc do cliente é: %.2f",cliente1.imc());
        cliente1.modeloCPF();

        //menu de input dos dados do cliente 2
        cliente2.inputCliente();
        cliente2.visualizar();
        System.out.printf("\nO imc do cliente é: %.2f",cliente2.imc());

    }

}
