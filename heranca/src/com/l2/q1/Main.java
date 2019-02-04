package com.l2.q1;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do ingresso: ");
		
		float valor = scanner.nextFloat();
		
		Ingresso ingresso = new Ingresso(valor);
		
		System.out.print("Digite o valor do ingresso Vip: ");
		
		float valorAdicional = scanner.nextFloat();
		
		IngressoVip ingressoVip = new IngressoVip(valor, valorAdicional);
		
		System.out.println(ingresso);
		System.out.println(ingressoVip);
		
		scanner.close();
	}
}
