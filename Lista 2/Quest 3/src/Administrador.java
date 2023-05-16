// Classe Administrador (subclasse de Empregado)
public class Administrador extends Empregado {
    private double ajudaDeCusto;
  
    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }
  
    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
  
    @Override
    public double calcularSalario() {
        double salarioLiquido = super.calcularSalario() + ajudaDeCusto;
        return salarioLiquido;
    }
}
