package classes;

public class Administrador extends Empregado {

	private double ajudaCusto;

	public Administrador (String nome, String endereco, String telefone, double salario, double ajudaCusto) {
		super (nome, endereco, telefone, salario);
		this.ajudaCusto = ajudaCusto;
	}

	public double getAjudaCusto () {
		return ajudaCusto;
	}

	public void setAjudaCusto (double ajudaCusto) {
		this.ajudaCusto = ajudaCusto;
	}

	//calcular salario do administrador
	public double calcularSalarioAdm () {
		return getAjudaCusto () + getSalario ();
	}

	@Override
	public String toString () {
		return "Salario do administrador: " + calcularSalarioAdm ();
	}

}
