import java.util.Scanner;

public class Moto extends Veiculo {
    private int ano;

    public Moto(String modelo, double preco, int ano) {
        super(modelo, preco);
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void insertData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o modelo da moto:");
        String modelo = scanner.nextLine();
        System.out.println("Digite o preço da moto:");
        double preco = scanner.nextDouble();
        System.out.println("Digite o ano da moto:");
        int ano = scanner.nextInt();

        setAno(ano);
    }

    @Override
    public double getPreco() {
        if (ano >= 2008) {
            return super.getPreco() * 1.1;
        }
        return super.getPreco();
    }
}
