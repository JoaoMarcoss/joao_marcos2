package com.l1.q3;

public class Main {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setNumeroConta(100);
		conta.depositar(101, 50.50f);
		conta.sacar(101, 60.50f);
		
		System.out.printf("Numero da conta %a.%b", conta.getNumeroConta());
		System.out.printf("Saldo da conta %a R$.%b", conta.getSaldo());
	}
	
}
