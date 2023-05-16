public class TesteClasses {
    public static void main(String[] args) {
        // Criando objetos das classes e definindo valores
        Pessoa pessoa = new Pessoa("Joao", 25, "Masculino");
        Empregado empregado = new Empregado("Maria", 30, "Feminino", 2500.0, "12345");
        Cliente cliente = new Cliente("Pedro", 35, "Masculino", 1500.0, 1988);
        Vendedor vendedor = new Vendedor("Ana", 28, "Feminino", 2000.0, "54321", 5000.0, 10);

        // Imprimindo os dados utilizando o método toString()
        System.out.println(pessoa.toString());
        System.out.println(empregado.toString());
        System.out.println(cliente.toString());
        System.out.println(vendedor.toString());

        // Calculando e imprimindo o valor do INSS para o empregado
        double inss = empregado.valorInss();
        System.out.println("Valor do INSS: " + inss);
    }
}
