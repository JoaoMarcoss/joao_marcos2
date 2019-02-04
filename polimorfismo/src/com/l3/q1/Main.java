package com.l3.q1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario("nome@email.com", "password", 321);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o E-mail: ");
		String email = scanner.nextLine();
		System.out.print("Digite a senha: ");
		String senha = scanner.nextLine();
		System.out.println(funcionario.fazerLogin(email, senha));
		
		scanner.close();
	}
	
}
