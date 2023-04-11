public class 01 {
    private String numero;
    private String descricao;
    private int quantidade;
    private double preco;

    public Fatura(String numero, String descricao, int quantidade, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0.0) {
            this.preco = preco;
        } else {
            this.preco = 0.0;
        }
    }

    public double getTotalFatura() {
        double total = quantidade * preco;
        if (total > 0.0) {
            return total;
        } else {
            return 0.0;
        }
    }
}
/*public class 01.2 {
    public static void main(String[] args) {
        Fatura fatura1 = new Fatura("001", "Teclado USB", 2, 30.00);
        Fatura fatura2 = new Fatura("002", "Mouse sem fio", 1, -20.00);

        System.out.println("Fatura 1:");
        System.out.println("Número: " + fatura1.getNumero());
        System.out.println("Descrição: " + fatura1.getDescricao());
        System.out.println("Quantidade: " + fatura1.getQuantidade());
        System.out.println("Preço: " + fatura1.getPreco());
        System.out.println("Total: " + fatura1.getTotalFatura());

        System.out.println();

        System.out.println("Fatura 2:");
        System.out.println("Número: " + fatura2.getNumero());
        System.out.println("Descrição: " + fatura2.getDescricao());
        System.out.println("Quantidade: " + fatura2.getQuantidade());
        System.out.println("Preço: " + fatura2.getPreco());
        System.out.println("Total: " + fatura2.getTotalFatura());
    }
}
 */
