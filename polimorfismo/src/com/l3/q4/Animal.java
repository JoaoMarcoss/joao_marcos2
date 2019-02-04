package com.l3.q4;

public abstract class Animal {
	
	protected String descricao;
	protected String nome;
	
	public Animal(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return nome + "e um animal.";
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome + " e um animal, ";
	}
	
	public abstract void locomover();
	
	public abstract void alimentar();
	
}
