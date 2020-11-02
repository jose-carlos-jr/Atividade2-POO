package application;

import classes.Administrador;
import classes.Fornecedor;
import classes.Vendedor;

public class Programa {

	public static void main(String[] args) {

		Fornecedor f1 = new Fornecedor ("Jose Fornecedor", "Rua da Joaquim Jo�o", "(83) 99941-5613", 1500, 890);
		System.out.println ("Nome do Fornecedor: " + f1.getNome () + " \nEndere�o: " + f1.getEndereco () + 
				", Telefone: " + f1.getTelefone () + ", Cr�dito: " + f1.getValorCredito () + ", D�vida: " 
				+ f1.getValorDivida () + ", Saldo: " + f1.obterSaldo ());

		Administrador adm1 = new Administrador ("Carlos Administrador", "Rua da S�o Jo�o", "(83) 99175-3333", 1500.00, 1500.00);
		System.out.println ("\nNome do Administrador: " + adm1.getNome () + " \nEndere�o: " + adm1.getEndereco ()
				+ ", Telefone " + adm1.getTelefone () + ", Ajuda de Custo " + adm1.getAjudaCusto () + " \nSalario "
				+ adm1.calcularSalarioAdm ());

		Vendedor v1 = new Vendedor ("Junior Vendedor", "Rua S�o vicente", "(83)3292-3344", 2000.00, 2000, 0.2);
		System.out.println ("\nNome do Vendedor: " + v1.getNome () + " \nEndere�o: " + v1.getEndereco () + ", Telefone: "
				+ v1.getTelefone () + ", Valor em venda: " + v1.getValorVendas () + ", Comiss�o " + v1.getComissao ()
				+ ", \nSalario " + v1.calcularSalarioVend ());

	}

}
