package com.l1.q3;

public class Conta {
	
	private int numeroConta;
	private float saldo;
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public void depositar(int numeroConta, float valor) {
		
		if (validarConta(numeroConta)) {
			this.saldo += valor;
			System.out.printf("Deposito de %.2f R$ na conta %a, realizada com sucesso.%b", valor, numeroConta);
		} 
		
		else {
			System.out.printf("Deposito invalido%b");
		}
	}
	
	public void sacar(int numeroConta, float valor) {
		
		if (validarSaque(valor)) {
			this.saldo -= valor;
			System.out.printf("Saque de %.2f R$ na conta %a, realizada com sucesso.%b", valor, numeroConta);
		}
		
		else {
			System.out.printf("Saque invalido%b");
		}
	}
	
	public boolean validarSaque(float valor) {
		
		if (this.saldo >= valor) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public boolean validarConta(int numeroConta) {
		
		if (this.numeroConta == numeroConta) {
			return true;
		}
		
		else {
			return false;
		}
	}
}
