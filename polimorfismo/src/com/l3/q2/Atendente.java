package com.l3.q2;

public class Atendente implements Funcionario {
	
	private String nome;
	private String email;
	private int registUnico;
	private String senha;
	
	public Atendente(String nome, String email, int registUnico, String senha) {
		this.nome = nome;
		this.email = email;
		this.registUnico = registUnico;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRegistUnico() {
		return registUnico;
	}

	public void setRegistUnico(int registUnico) {
		this.registUnico = registUnico;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public boolean fazerLogin(String email, String senha) {
		return this.email == email && this.senha == senha;
	}
	
	@Override
	public boolean fazerLogin(int registUnico, String senha) {
		return this.registUnico == registUnico && this.senha == senha;	
	}

	@Override
	public String getFuncao() {
		return "Funcionario " + getNome() + " e atendente.";
	}
	
}