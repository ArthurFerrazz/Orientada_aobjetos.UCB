public class 02 {
    private String nome;
    private String sobrenome;
    private double salarioMensal;

    public Empregado(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public double salarioAnual() {
        return salarioMensal * 12;
    }

    public void aumentoSalario() {
        salarioMensal = salarioMensal * 1.1;
    }
}
/*public class 02.1 {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("João", "Silva", 3000);
        Empregado empregado2 = new Empregado("Maria", "Santos", 4000);

        System.out.printf("Salário anual de %s %s: R$%.2f\n", empregado1.getNome(), empregado1.getSobrenome(), empregado1.salarioAnual());
        System.out.printf("Salário anual de %s %s: R$%.2f\n", empregado2.getNome(), empregado2.getSobrenome(), empregado2.salarioAnual());

        empregado1.aumentoSalario();
        empregado2.aumentoSalario();

        System.out.printf("Novo salário anual de %s %s: R$%.2f\n", empregado1.getNome(), empregado1.getSobrenome(), empregado1.salarioAnual());
        System.out.printf("Novo salário anual de %s %s: R$%.2f\n", empregado2.getNome(), empregado2.getSobrenome(), empregado2.salarioAnual());
    }
}
 */
