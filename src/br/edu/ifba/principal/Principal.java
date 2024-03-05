package br.edu.ifba.principal;

import java.util.Arrays;

import br.edu.ifba.basicas.Empresa;
import br.edu.ifba.basicas.Funcionario;
import br.edu.ifba.rn.CadastroEmpresa;
import br.edu.ifba.rn.CadastroFuncionario;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empresa e = new Empresa("125456","Tabajara","75849465");
		Empresa e1 = new Empresa("548416","Tabajara3","7554549865");
		Empresa e2 = new Empresa("895662","Teste","756726247");
		
		Funcionario f = new Funcionario("12356","Fulano","4465","854656",e);
		Funcionario f2 = new Funcionario("5851","Sicrano","555","88858",e1);
		Funcionario f3 = new Funcionario("89623","Beltrano","6598","8563221",e2);
		
		CadastroEmpresa em = new CadastroEmpresa();
		CadastroFuncionario cf = new CadastroFuncionario();
		
		em.cadastrarEmpresa(e);
		em.cadastrarEmpresa(e2);
		em.cadastrarEmpresa(e1);
		
		cf.cadastrarFuncionario(f);
		cf.cadastrarFuncionario(f2);
		cf.cadastrarFuncionario(f3);
		
		System.out.println(Arrays.toString(em.listarEmpresas()));
		System.out.println(Arrays.toString(cf.listar()));

	

	}

}
