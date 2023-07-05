public class Midia {
    private int codigo;
    private double preco;
    private String nome;

    public Midia() {}

    public Midia(int codigo, double preco, String nome) {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }

    public String getTipo() {
        return "Midia";
    }

    public String getDetalhes() {
        return "Código: " + codigo + "\nPreço: R$" + preco + "\nNome: " + nome;
    }

    public void printDados() {
        System.out.println("Tipo: " + getTipo());
        System.out.println(getDetalhes());
    }

    public void inserirDados(int codigo, double preco, String nome) {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }
}
