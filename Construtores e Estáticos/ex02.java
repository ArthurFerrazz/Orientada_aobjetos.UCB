package Construtores e Estáticos;

public class ex02 {
    public class Produto {
        private String nome;
        private double preco;
    
        public Produto(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }
    
        public String getNome() {
            return nome;
        }
    
        public double getPreco() {
            return preco;
        }
    }
    
    public class Livro extends Produto {
        private String autor;
    
        public Livro(String nome, double preco, String autor) {
            super(nome, preco);
            this.autor = autor;
        }
    
        public String getAutor() {
            return autor;
        }
        
        public void imprimirInformacoes() {
            System.out.println("Livro: " + getNome() + ", Preço: R$" + getPreco() + ", Autor: " + autor);
        }
    }
    
    public class CD extends Produto {
        private int numFaixas;
    
        public CD(String nome, double preco, int numFaixas) {
            super(nome, preco);
            this.numFaixas = numFaixas;
        }
    
        public int getNumFaixas() {
            return numFaixas;
        }
        
        public void imprimirInformacoes() {
            System.out.println("CD: " + getNome() + ", Preço: R$" + getPreco() + ", Número de Faixas: " + numFaixas);
        }
    }
    
    public class DVD extends Produto {
        private int duracao;
    
        public DVD(String nome, double preco, int duracao) {
            super(nome, preco);
            this.duracao = duracao;
        }
    
        public int getDuracao() {
            return duracao;
        }
        
        public void imprimirInformacoes() {
            System.out.println("DVD: " + getNome() + ", Preço: R$" + getPreco() + ", Duração: " + duracao + " min");
        }
    }
    
    public class Loja {
        public static void main(String[] args) {
            Livro livro1 = new Livro("O Senhor dos Anéis", 59.90, "J.R.R. Tolkien");
            CD cd1 = new CD("Thriller", 29.90, 9);
            DVD dvd1 = new DVD("Matrix", 39.90, 136);
            Livro livro2 = new Livro("A Menina que Roubava Livros", 39.90, "Markus Zusak");
            CD cd2 = new CD("Back in Black", 24.90, 10);
    
            livro1.imprimirInformacoes();
            cd1.imprimirInformacoes();
            dvd1.imprimirInformacoes();
            livro2.imprimirInformacoes();
            cd2.imprimirInformacoes();
        }
    }
    
}
