import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto Curso
        Curso curso = new Curso();
        curso.setNome("Ciência da Computação");

        // Criando um objeto Aluno
        Aluno aluno = new Aluno();
        aluno.setCurso(curso);

        // Definindo as notas do aluno
        List<Double> notas = new ArrayList<>();
        notas.add(8.5);
        notas.add(9.0);
        notas.add(7.5);
        aluno.setNotas(notas);

        // Calculando a média do aluno
        double media = aluno.calcularMedia();

        // Imprimindo informações do aluno
        aluno.imprimir();
        System.out.println("Média: " + media);

        // Criando um objeto Endereco
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Principal");
        endereco.setCidade("Cidade Exemplo");
        endereco.setEstado("Estado Exemplo");

        // Criando uma lista de telefones
        List<Telefone> telefones = new ArrayList<>();

        // Criando objetos Telefone
        Telefone telefone1 = new Telefone();
        telefone1.setTipo("Celular");
        telefone1.setDdd("99");
        telefone1.setNumero("99999-9999");

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("Residencial");
        telefone2.setDdd("99");
        telefone2.setNumero("8888-8888");

        // Adicionando telefones à lista
        telefones.add(telefone1);
        telefones.add(telefone2);

        // Criando um objeto Pessoa
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João da Silva");
        pessoa.setCpf("123.456.789-00");
        pessoa.setEmail("joao.silva@example.com");
        pessoa.setTelefones(telefones);
        pessoa.setEndereco(endereco);

        // Imprimindo informações da pessoa
        pessoa.imprimir();

        // Criando um objeto Professor
        Professor professor = new Professor();
        professor.setTitulacao("Doutorado");
        professor.setSalario(5000.0);

        // Criando uma lista de cursos
        List<Curso> cursos = new ArrayList<>();

        // Adicionando cursos à lista
        cursos.add(curso);

        professor.setCursos(cursos);

        // Imprimindo informações do professor
        professor.imprimir();
    }
}
