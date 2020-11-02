package classes;

public class Empregado extends Pessoa {
	protected double salario;
	
	public Empregado (String nome, String endereco, String telefone, double salario) {
		super (nome, endereco, telefone);
		this.salario = salario;
	}

	public double getSalario () {
		return salario;
	}

	public void setSalario (double salario) {
		this.salario = salario;
	}
	

}
