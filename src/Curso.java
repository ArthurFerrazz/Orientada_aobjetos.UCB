public class Curso {
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void imprimirCurso() {
        System.out.println("Nome do curso: " + nome);
    }
}
