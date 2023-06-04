import java.util.List;
import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private String cpf;
    private String email;
    private List<Telefone> telefones;
    private Endereco endereco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Email: " + email);
        System.out.println("Telefones:");
        for (Telefone telefone : telefones) {
            telefone.imprimirTelefone();
        }
        endereco.imprimirEndereco();
    }
}
