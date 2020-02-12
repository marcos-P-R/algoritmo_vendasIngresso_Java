import java.util.Scanner;

public class VendasdeIngresso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tipoIgresso, filme, entradaVendedor;
        double meia, especial;

        //entrada do vendendor
        System.out.println("Informe a operação que deseja: \n 1 Vender Ingresso \n 2 fechar caixa \n");
        entradaVendedor = sc.nextInt();

        //entrada de valores da venda
        if (entradaVendedor == 1) {
            System.out.println("Informe qual filme deseja: \n 1 filme A \n 2 filme B \n 3 filme \n ");
            filme = sc.nextInt();
            System.out.println("Informe o tipo de Ingresso: \n 1 Meia \n 2 Especial \n 3 Inteira \n");
            tipoIgresso = sc.nextInt();

            switch (filme){
                case 1:
                    double valordofilmeA = 10.00;
                    if (tipoIgresso == 1){
                        meia = valordofilmeA/2;
                        System.out.println("FILME A \n TOTAL DE R$" + meia);
                    }else if (tipoIgresso == 2){
                        especial = valordofilmeA / 3;
                        System.out.println("FILME A \n TOTAL DE R$" + especial);
                    }else  if (tipoIgresso == 3){
                        System.out.println("FILME A \n TOTAL DE R$" + valordofilmeA);
                    }else{
                        System.out.println("Valor Não existente");
                    }

                 break;

                case 2:
                    double valordofilmeB = 20.00;
                    if (tipoIgresso == 1){
                        meia = valordofilmeB/2;
                        System.out.println("FILME A \n TOTAL DE R$" + meia);
                    }else if (tipoIgresso == 2){
                        especial = valordofilmeB / 3;
                        System.out.println("FILME A \n TOTAL DE R$" + especial);
                    }else  if (tipoIgresso == 3){
                        System.out.println("FILME A \n TOTAL DE R$" + valordofilmeB);
                    }else{
                        System.out.println("Valor Não existente");
                    }
                 break;

                case 3:
                    double valordofilmeC = 18.00;
                    if (tipoIgresso == 1){
                        meia = valordofilmeC/2;
                        System.out.println("FILME A \n TOTAL DE R$" + meia);
                    }else if (tipoIgresso == 2){
                        especial = valordofilmeC / 3;
                        System.out.println("FILME A \n TOTAL DE R$" + especial);
                    }else  if (tipoIgresso == 3){
                        System.out.println("FILME A \n TOTAL DE R$" + valordofilmeC);
                    }else{
                        System.out.println("Valor Não existente");
                    }
                 break;

            }
        }
    }
}
