package com.l3.q2;

public class Main {

	public static void main(String[] args) {
		
		Atendente atendente = new Atendente("Joao", "joao@email.com", 123, "abc");
		Gerente gerente = new Gerente("Marcos", "marcos@email.com", 321, "def");
		
		System.out.println("Acesso: " + atendente.fazerLogin("marcos@email.com", "def"));
		System.out.println(atendente.getFuncao());
		
		System.out.println("Acesso: " + gerente.fazerLogin(123, "abc"));
		System.out.println(gerente.getFuncao());
	}

}