import java.util.Scanner;
public class ex03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalHabitantes = 0;
        int totalMulheresCastanhasCastanhas = 0;

        while (true) {

            System.out.print("Informe o sexo (m/f): ");
            String sexo = sc.next();
            if (!sexo.equals("m") && !sexo.equals("f")) {
                System.out.println("Sexo inválido. Tente novamente.");
                continue;
            }

            System.out.print("Informe a cor dos olhos (a/v/c/p): ");
            String corOlhos = sc.next();
            if (!corOlhos.equals("a") && !corOlhos.equals("v") && !corOlhos.equals("c") && !corOlhos.equals("p")) {
                System.out.println("Cor dos olhos inválida. Tente novamente.");
                continue;
            }

            System.out.print("Informe a cor dos cabelos (l/c/p/r): ");
            String corCabelos = sc.next();
            if (!corCabelos.equals("l") && !corCabelos.equals("c") && !corCabelos.equals("p") && !corCabelos.equals("r")) {
                System.out.println("Cor dos cabelos inválida. Tente novamente.");
                continue;
            }

            System.out.print("Informe a idade em anos: ");
            int idade = sc.nextInt();
            if (idade < 10 || idade > 100) {
                System.out.println("Idade inválida. Tente novamente.");
                continue;
            }

            System.out.print("Informe o valor do salário: ");
            double salario = sc.nextDouble();
            if (salario < 0) {
                System.out.println("Salário inválido. Tente novamente.");
                continue;
            }

            // Verifica se é uma mulher com idade entre 18 e 35 anos, olhos castanhos e cabelos castanhos
            if (sexo.equals("f") && idade >= 18 && idade <= 35 && corOlhos.equals("c") && corCabelos.equals("c")) {
                totalMulheresCastanhasCastanhas++;
            }

            totalHabitantes++;

            // Verifica se chegou ao final da pesquisa
            if (idade == -1) {
                break;
            }

        }

        // Calcula a porcentagem de mulheres com as características desejadas
        double percentualMulheresCastanhasCastanhas = (double) totalMulheresCastanhasCastanhas / totalHabitantes * 100;

        System.out.printf("Porcentagem de mulheres com idade entre 18 e 35 anos, olhos castanhos e cabelos castanhos: %.2f%%", percentualMulheresCastanhasCastanhas);

        sc.close();

    }

}
