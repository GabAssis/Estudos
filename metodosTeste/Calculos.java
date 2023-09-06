package metodosTeste;

public class Calculos {
    private static float numero1;
    private static float numero2;

    //SETTER
    public static void setNumero1(float numero1) {
        Calculos.numero1 = numero1;
    }

    public static void setNumero2(float numero2) {
        Calculos.numero2 = numero2;
    }



    //MÉTODOS CÁLCULO
    public static void menuCalculadora(){
        System.out.println("*Digite a operação da calculadora*");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
    }

    public static float soma(float numero1, float numero2) {
        return numero1 + numero2;
    }

    public static float mult(float numero1, float numero2) {
        return numero1 * numero2;
    }

    public static float div(float numero1, float numero2) {
        return numero1 / numero2;
    }

    public static float sub(float numero1, float numero2) {
        return numero1 - numero2;
    }

    //MÉTODO SELECÃO DE OPERAÇÃO
    public static void operationsMenu(int a) {
        switch (a) {
            case 1:
                float somaNums = soma(numero1, numero2);
                System.out.println("A soma dos números é: " + somaNums);
                break;
            case 2:
                float subNums = sub(numero1, numero2);
                System.out.println("A subtração dos números é: " + subNums);
                break;
            case 3:
                float multNums = mult(numero1, numero2);
                System.out.println("A multiplicação dos números é: " + multNums);
                break;
            case 4:
                float divNums = div(numero1, numero2);
                System.out.println("A divisão dos números é: " + divNums);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + a);
        }
    }
}



