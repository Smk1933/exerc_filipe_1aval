package F;

public class Gerente extends Funcionario{

    double bonus;

    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario(){
        return salarioBase + bonus;
    }
    @Override
    public void imprimirSalario(){
        System.out.println(calcularSalario());
    }
}
