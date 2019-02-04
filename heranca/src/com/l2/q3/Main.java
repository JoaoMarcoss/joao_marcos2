package com.l2.q3;

public class Main {
	
	public static void main(String[] args) {
		
		Iterativo iterativo = new Iterativo();
		iterativo.iterativo(2);
		
		Recursivo recursivo = new Recursivo();
		System.out.printf("O fatorial e " + recursivo.recursivo(3));
	}

}
