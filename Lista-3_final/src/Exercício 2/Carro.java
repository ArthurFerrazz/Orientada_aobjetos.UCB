import java.util.Scanner;

public class Carro extends Veiculo {
    private double km;

    public Carro(String modelo, double preco, double km) {
        super(modelo, preco);
        this.km = km;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public void insertData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o modelo do carro:");
        String modelo = scanner.nextLine();
        System.out.println("Digite o preço do carro:");
        double preco = scanner.nextDouble();
        System.out.println("Digite a quilometragem do carro:");
        double km = scanner.nextDouble();

        setKm(km);
    }

    @Override
    public double getPreco() {
        if (km > 100000) {
            return super.getPreco() * 0.92;
        }
        return super.getPreco();
    }
}
