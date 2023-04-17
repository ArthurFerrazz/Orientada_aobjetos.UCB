Classe "Conta" que contenha os atributos a seguir:

nome do titular (tipo String)
número da conta (tipo int)
agência (tipo String)
saldo (tipo double)
data de abertura (tipo String)
Para as operações, você precisará criar os seguintes métodos dentro da classe:

saca (para retirar um valor do saldo)
deposita (para adicionar um valor ao saldo)
calculaRendimento (para calcular o rendimento mensal da conta, que é de 10% sobre o saldo).
  
  public class Conta {
   private String nomeTitular;
   private int numeroConta;
   private String agencia;
   private double saldo;
   private String dataAbertura;

   public Conta(String nomeTitular, int numeroConta, String agencia, double saldo, String dataAbertura) {
       this.nomeTitular = nomeTitular;
       this.numeroConta = numeroConta;
       this.agencia = agencia;
       this.saldo = saldo;
       this.dataAbertura = dataAbertura;
   }

   public void saca(double valor) {
       this.saldo -= valor;
   }

   public void deposita(double valor) {
       this.saldo += valor;
   }

   public double calculaRendimento() {
       return this.saldo * 0.1;
   }

   // getters e setters para cada atributo

}
