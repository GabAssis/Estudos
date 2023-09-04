package exLoops;

import java.util.Scanner;

public class DevsWhile {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int idade, sexo, categoria, backend = 0, mFront = 0, hMobileMore40 = 0, mFullStackLess30 = 0;
        String menuSexo = "\n 1 - Masculino\n 2 - Feminino\n 3 - Outros\n";
        String menuCategoria = "\n 1 - Backend\n 2 - Frontend\n 3 - Mobile\n 4 - Fullstack";
        String newColaborador = "S";

        while (newColaborador.equals("S")) {
            System.out.println("Digite a idade do colaborador: ");
            idade = Integer.parseInt(leia.nextLine());
            System.out.println("Digite o sexo do colaborador: " + menuSexo);
            sexo = Integer.parseInt(leia.nextLine());
            System.out.println("Digite a categoria do  colaborador: " + menuCategoria);
            categoria = Integer.parseInt(leia.nextLine());

            if (categoria == 1) {
                backend++;
            }
            if (sexo == 2 && categoria == 2) {
                mFront++;
            }
            if (idade > 40 && sexo == 1 && categoria == 3) {
                hMobileMore40++;
            }
            if (idade < 30 && sexo == 2 && categoria == 4) {
                mFullStackLess30++;
            }
            System.out.println("Deseja um novo colaborador: (S/N)");
            newColaborador = leia.nextLine();
        }

        System.out.printf("O número de pessoas desenvolvedoras Backend: %d ", backend);
        System.out.printf("\nO número de mulheres desenvolvedoras Frontend: %d", mFront);
        System.out.printf("\nO número de homens desenvolvedores Mobile maiores de 40 anos: %d", hMobileMore40);
        System.out.printf("\nO número de mulheres desenvolvedoras FullStack menores de 30 anos: %d", mFullStackLess30);
    }
}




