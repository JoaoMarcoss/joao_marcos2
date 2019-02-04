package com.l2.q4;

public class Novo extends Imovel {

	private float precoAdicional;

	public Novo(String endereco, float preco, float precoAdicional) {
		super(endereco, preco);
		this.precoAdicional = precoAdicional;
	}

	public float getPrecoAdicional() {
		return this.precoAdicional + getPreco();
		
	}
	
	public String toString() {
		return "Endereco " + getEndereco() + ". Valor do novo imovel: " + getPrecoAdicional();
	}
}
