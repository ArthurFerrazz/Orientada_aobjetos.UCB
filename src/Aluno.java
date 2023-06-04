import java.util.List;
import java.util.ArrayList;

public class Aluno {
    private Curso curso;
    private List<Double> notas;

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public double calcularMedia() {
        double soma = 0;
        for (Double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    public void imprimir() {
        curso.imprimirCurso();
        System.out.println("Notas:");
        for (Double nota : notas) {
            System.out.println(nota);
        }
    }
}
