public class DVD extends Midia {
    private int numFaixas;

    public DVD() {}

    public DVD(int codigo, double preco, String nome, int numFaixas) {
        super(codigo, preco, nome);
        this.numFaixas = numFaixas;
    }

    public String getTipo() {
        return "DVD";
    }

    public String getDetalhes() {
        return super.getDetalhes() + "\nNúmero de Faixas: " + numFaixas;
    }

    public void setFaixas(int numFaixas) {
        this.numFaixas = numFaixas;
    }

    public void inserirDados(int codigo, double preco, String nome, int numFaixas) {
        super.inserirDados(codigo, preco, nome);
        this.numFaixas = numFaixas;
    }
}
