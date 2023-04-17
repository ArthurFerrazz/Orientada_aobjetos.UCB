package Construtores e Estáticos;
import java.time.LocalDate;
import java.time.Period;

public class ex01 {
public class Pessoa {
    private int idade;
    private LocalDate dataDeNascimento;
    private String nome;

    public Pessoa(String nome, int dia, int mes, int ano) {
        this.nome = nome;
        this.dataDeNascimento = LocalDate.of(ano, mes, dia);
        this.idade = Period.between(dataDeNascimento, LocalDate.now()).getYears();
    }

    public int informaIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Data de Nascimento: " + dataDeNascimento + ", Idade: " + idade;
    }

    public static void main(String[] args) {
        Pessoa einstein = new Pessoa("Albert Einstein", 14, 3, 1879);
        Pessoa newton = new Pessoa("Isaac Newton", 4, 1, 1643);

        System.out.println(einstein.toString());
        System.out.println(newton.toString());
    }
}

}
