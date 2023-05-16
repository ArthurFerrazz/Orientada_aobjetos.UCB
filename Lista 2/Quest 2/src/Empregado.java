class Empregado extends Pessoa {
    private double salario;
    private String matricula;

    public Empregado(String nome, int idade, String sexo, double salario, String matricula) {
        super(nome, idade, sexo);
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

    // Método para calcular o valor do INSS
    public double valorInss() {
        return salario * 0.11;
    }

    // Método toString()
    @Override
    public String toString() {
        return super.toString() + ", Salário: " + salario + ", Matrícula: " + matricula;
    }
}
