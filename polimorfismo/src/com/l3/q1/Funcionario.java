package com.l3.q1;

public class Funcionario {

	private String nome;
	private String senha;
	private String email;
	private int registUnico;

	public Funcionario() {
	}

	public Funcionario(String email, String senha, int regist) {
		this.email = email;
		this.senha = senha;
		this.registUnico = regist;
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

	public String fazerLogin(String email, String senha) {
		if (email.equals(this.email) && (senha.equals(this.senha))) {
			return "Permitido";
		} else {
			return "Negado";
		}
	}

	public boolean fazerLogin(int registUnico, String senha) {
		return this.registUnico == registUnico && senha.equals(this.senha);
	}
}