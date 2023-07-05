import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroVeiculos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Veiculo> veiculos = new ArrayList<>();

        System.out.println("Bem-vindo ao cadastro de veículos!");

        while (true) {
            System.out.println("Selecione o tipo de veículo que deseja cadastrar:");
            System.out.println("1 - Moto");
            System.out.println("2 - Carro");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            if (opcao == 0) {
                break;
            }

            switch (opcao) {
                case 1:
                    Moto moto =new Moto("", 0.0, 0);
                    moto.insertData();
                    veiculos.add(moto);
                    break;
                case 2:
                    Carro carro = new Carro("", 0.0, 0.0);
                    carro.insertData();
                    veiculos.add(carro);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        System.out.println("Relatório de veículos cadastrados:");
        for (Veiculo veiculo : veiculos) {
            veiculo.printDados();
        }

        double totalPrecoAntes = 0.0;
        double totalPrecoDepois = 0.0;

        for (Veiculo veiculo : veiculos) {
            totalPrecoAntes += veiculo.getPreco();
        }

        for (Veiculo veiculo : veiculos) {
            if (veiculo instanceof Moto && ((Moto) veiculo).getAno() >= 2008) {
                ((Moto) veiculo).reajustarPreco();
            } else if (veiculo instanceof Carro && ((Carro) veiculo).getKm() > 100000) {
                ((Carro) veiculo).reduzirPreco();
            }
        }

        for (Veiculo veiculo : veiculos) {
            totalPrecoDepois += veiculo.getPreco();
        }

        System.out.println("Total de preços antes do ajuste: " + totalPrecoAntes);
        System.out.println("Total de preços após o ajuste: " + totalPrecoDepois);
    }
}
