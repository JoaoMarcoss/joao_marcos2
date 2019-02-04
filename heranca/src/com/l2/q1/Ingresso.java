package com.l2.q1;

public class Ingresso {
	
	private float valor;
	
	public Ingresso(float valor) {
		this.valor = valor;
	}
	
	public float getValor() {
		return valor;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public String toString() {
		return "Valor do ingresso e " + valor; 
	}

}
