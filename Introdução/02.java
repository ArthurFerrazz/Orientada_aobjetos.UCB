import java.util.Scanner;
public class ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha o prato (1-vegetariano, 2-peixe, 3-frango, 4-carne): ");
        int prato = input.nextInt();

        System.out.println("Escolha a sobremesa (1-abacaxi, 2-sorvete diet, 3-mousse diet, 4-mousse chocolate):");
        int sobremesa = input.nextInt();

        System.out.println("Escolha a bebida (1-chá, 2-suco de laranja, 3-suco de melão, 4-refrigerante diet): ");
        int bebida = input.nextInt();

        int caloriasPrato = 0;
        switch (prato) {
            case 1:
                caloriasPrato = 180;
                break;
            case 2:
                caloriasPrato = 230;
                break;
            case 3:
                caloriasPrato = 250;
                break;
            case 4:
                caloriasPrato = 350;
                break;
        }

        int caloriasSobremesa = 0;
        switch (sobremesa) {
            case 1:
                caloriasSobremesa = 75;
                break;
            case 2:
                caloriasSobremesa = 110;
                break;
            case 3:
                caloriasSobremesa = 170;
                break;
            case 4:
                caloriasSobremesa = 200;
                break;
        }

        int caloriasBebida = 0;
        switch (bebida) {
            case 1:
                caloriasBebida = 20;
                break;
            case 2:
                caloriasBebida = 70;
                break;
            case 3:
                caloriasBebida = 100;
                break;
            case 4:
                caloriasBebida = 65;
                break;
        }

        int totalCalorias = caloriasPrato + caloriasSobremesa + caloriasBebida;

        System.out.println("Total de calorias da refeição: " + totalCalorias);
    }
}
