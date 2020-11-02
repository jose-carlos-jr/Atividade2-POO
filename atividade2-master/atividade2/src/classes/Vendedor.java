package classes;

public class Vendedor extends Empregado {
	private double valorVendas;
	private double comissao;

	public Vendedor (String nome, String endereco, String telefone, double salario, double valorVendas,
			double comissao) {
		super (nome, endereco, telefone, salario);

		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao () {
		return comissao;
	}

	public void setComissao (double comissao) {
		this.comissao = comissao;
	}
	public double comissao () {
		return getComissao () * getValorVendas ();
	}

	//caucular salario do vendedor
	public double calcularSalarioVend () {
		return getSalario () + comissao ();
	}

	@Override
	public String toString () {
		return "salario do Vendedor: " + calcularSalarioVend ();
	}
}
