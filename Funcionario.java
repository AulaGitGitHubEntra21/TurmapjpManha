package com.jovemprogramador.cursojavatarde.oop.exerciciospratica.Heranca;

import java.util.Date;

public class Funcionario {
//public class Funcionario extends Pessoa {
	
	private String nome; // <----- Comum a ambas as classes
	private String endereco;  // <----- Comum a ambas as classes
	private String telefone;  // <----- Comum a ambas as classes
	private  float salario;  
	private Date data_admissao; 
	private  int horasExtras;
	
	
	public Funcionario() {
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public Date getData_admissao() {
		return data_admissao;
	}

	public void setData_admissao(Date data_admissao) {
		this.data_admissao = data_admissao;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}


	public float calcSalario(float vHora){
		return this.salario+(this.horasExtras * vHora);
	}

}
