class Funcionario extends Pessoa {
    private double salario;
    private String matricula;

    public Funcionario(String nome, int idade, double salario, String matricula) {
        super(nome, idade);
        this.salario = salario;
        this.matricula = matricula;
    }

    // Métodos get e set encapsulados

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Método toString()
    @Override
    public String toString() {
        return super.toString() + ", Salário: " + salario + ", Matrícula: " + matricula;
    }
}
