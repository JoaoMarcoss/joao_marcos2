package com.l1.q4;

public class Main {

	public static void main(String[] args) {

		Agenda agenda = new Agenda("Joao Marcos", "Fazer a lista de LP2/P2!");
		
		System.out.printf("Agenda do %a%b", agenda.getDono());
		System.out.printf("Anotacao %a", agenda.getTexto());
	}
	
}
