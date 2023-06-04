import java.util.List;
import java.util.ArrayList;

public class Professor {
    private String titulacao;
    private double salario;
    private List<Curso> cursos;

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void imprimir() {
        System.out.println("Titulação: " + titulacao);
        System.out.println("Salário: " + salario);
        System.out.println("Cursos:");
        for (Curso curso : cursos) {
            curso.imprimirCurso();
        }
    }
}
