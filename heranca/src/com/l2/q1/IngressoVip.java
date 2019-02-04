package com.l2.q1;

public class IngressoVip extends Ingresso {
	private float valorAdicional;
	
	public IngressoVip(float valor, float valorAdicional) {
		super(valor);
		this.valorAdicional = valorAdicional;
	}
	
	public float getValorAdicional() {
		return valorAdicional;
	}
	
	public void setValorAdicional(float valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	public float getValor() {
		return this.valorAdicional + super.getValor();
	}
	
	public String toString() {	
		return "Adicional de " + valorAdicional + ", valor do ingresso Vip e " + getValor();
	}
}