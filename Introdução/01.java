import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o numero de carros vendidos: ");
        int numCarrosVendidos = input.nextInt();

        System.out.println("Digite o valor total das vendas: ");
        double TotalVendas = input.nextDouble();

        System.out.println("Digite o salário fixo: ");
        double Salariofixo = input.nextDouble();

        System.out.println("Digite o valor recebido por carro vendido: ");
        double valorPorCarroVendido = input.nextDouble();

        double comissaoFixaPorCarroVendido = numCarrosVendidos * valorPorCarroVendido;
        double comissaoPorVendas = 0.05 * TotalVendas;
        double salarioFinal = Salariofixo + comissaoFixaPorCarroVendido + comissaoPorVendas;
        System.out.println("Salário final do vendedor: R$" + salarioFinal);

    }
}
