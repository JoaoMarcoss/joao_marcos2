package com.l3.q4;

public class Main {
	
	public static void main(String[] args) {
		
		Macaco macaco = new Macaco("macaco", "macaco");
		System.out.println(macaco.getDescricao());
		macaco.getDescricao();
		macaco.locomover();
		macaco.alimentar();
		
		Cachorro cachorro = new Cachorro("cachorro", "cachorro");
		System.out.println(cachorro.getDescricao());
		cachorro.getDescricao();
		cachorro.locomover();
		cachorro.alimentar();
		
		Aguia aguia = new Aguia("aguia", "aguia");
		System.out.println(aguia.getDescricao());
		aguia.getDescricao();
		aguia.locomover();
		aguia.alimentar();
		
		Passaro passaro = new Passaro("passaro", "passaro");
		System.out.println(passaro.getDescricao());
		passaro.getDescricao();
		passaro.locomover();
		passaro.alimentar();
	}
}
