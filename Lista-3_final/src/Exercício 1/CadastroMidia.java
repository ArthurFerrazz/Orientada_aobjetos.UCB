import java.util.Scanner;

public class CadastroMidia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("Cadastro de Mídias");
        System.out.println("------------------");

        do {
            System.out.println("\nOpções:");
            System.out.println("1. Cadastrar um DVD");
            System.out.println("2. Cadastrar um CD");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    DVD dvd = new DVD();
                    System.out.print("Insira o código: ");
                    int codigoDvd = scanner.nextInt();
                    System.out.print("Insira o preço: ");
                    double precoDvd = scanner.nextDouble();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Insira o nome: ");
                    String nomeDvd = scanner.nextLine();
                    System.out.print("Insira o número de faixas: ");
                    int numFaixas = scanner.nextInt();
                    dvd.inserirDados(codigoDvd, precoDvd, nomeDvd, numFaixas);
                    System.out.println("\nDVD cadastrado com sucesso!");
                    dvd.printDados();
                    break;
                case 2:
                    CD cd = new CD();
                    System.out.print("Insira o código: ");
                    int codigoCd = scanner.nextInt();
                    System.out.print("Insira o preço: ");
                    double precoCd = scanner.nextDouble();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Insira o nome: ");
                    String nomeCd = scanner.nextLine();
                    System.out.print("Insira o número de músicas: ");
                    int numMusicas = scanner.nextInt();
                    cd.inserirDados(codigoCd, precoCd, nomeCd, numMusicas);
                    System.out.println("\nCD cadastrado com sucesso!");
                    cd.printDados();
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }
}
