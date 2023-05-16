public class TesteClasses {
    public static void main(String[] args) {
        // Criando objetos das classes e definindo valores
        Pessoa pessoa = new Pessoa("Joao", 25);
        Funcionario funcionario = new Funcionario("Maria", 30, 2500.0, "12345");
        Gerente gerente = new Gerente("Pedro", 35, 5000.0, "54321", "RH");

        // Imprimindo os dados utilizando o método toString()
        System.out.println(pessoa.toString());
        System.out.println(funcionario.toString());
        System.out.println(gerente.toString());
    }
}
