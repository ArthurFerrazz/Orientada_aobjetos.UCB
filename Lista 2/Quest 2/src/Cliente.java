class Cliente extends Pessoa {
    private double valorDivida;
    private int anoNascimento;

    public Cliente(String nome, int idade, String sexo, double valorDivida, int anoNascimento) {
        super(nome, idade, sexo);
        this.valorDivida = valorDivida;
        this.anoNascimento = anoNascimento;
    }

    // Métodos get e set encapsulados

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    // Método toString()
    @Override
    public String toString() {
        return super.toString() + ", Valor da Dívida: " + valorDivida + ", Ano de Nascimento: " + anoNascimento;
    }
}
