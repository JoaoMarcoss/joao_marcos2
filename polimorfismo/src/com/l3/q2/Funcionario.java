package com.l3.q2;

public interface Funcionario {
	
	public boolean fazerLogin(String email, String senha);
	
	public boolean fazerLogin(int registUnico, String senha);
	
	public String getFuncao();
}
