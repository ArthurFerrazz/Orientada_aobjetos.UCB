public class CD extends Midia {
    private int numMusicas;

    public CD() {}

    public CD(int codigo, double preco, String nome, int numMusicas) {
        super(codigo, preco, nome);
        this.numMusicas = numMusicas;
    }

    public String getTipo() {
        return "CD";
    }

    public String getDetalhes() {
        return super.getDetalhes() + "\nNúmero de Músicas: " + numMusicas;
    }

    public void setMusica(int numMusicas) {
        this.numMusicas = numMusicas;
    }

    public void inserirDados(int codigo, double preco, String nome, int numMusicas) {
        super.inserirDados(codigo, preco, nome);
        this.numMusicas = numMusicas;
    }
}
