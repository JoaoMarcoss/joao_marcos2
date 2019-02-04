package com.l3.q5;

public class TrabalhadorHora extends Empregado {
	
	private double salarioHora;
	private double quantidadeHora;
	
	public TrabalhadorHora() {
	}
	
	public TrabalhadorHora(String nome, double salarioHora, double quantidadeHora) {
		super(nome);
		this.salarioHora = salarioHora;
		this.quantidadeHora = quantidadeHora;
	}

	public double getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}

	public double getQuantidadeHora() {
		return quantidadeHora;
	}

	public void setQuantidadeHora(double quantidadeHora) {
		this.quantidadeHora = quantidadeHora;
	}

	@Override
	public double calcularGanho() {
		return getSalarioHora() * getQuantidadeHora();
	}
	
	public String toString() {
		return "O trabalhador por hora " + getNome() + "recebe: R$ " + String.format("%.2f", calcularGanho()); 
	}
}