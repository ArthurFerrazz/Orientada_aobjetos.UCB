class Gerente extends Funcionario {
    private String setor;

    public Gerente(String nome, int idade, double salario, String matricula, String setor) {
        super(nome, idade, salario, matricula);
        this.setor = setor;
    }

    // Método get e set encapsulado

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    // Método toString()
    @Override
    public String toString() {
        return super.toString() + ", Setor: " + setor;
    }
}
