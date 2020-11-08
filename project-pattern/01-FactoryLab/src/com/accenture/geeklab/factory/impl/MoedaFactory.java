package com.accenture.geeklab.factory.impl;

public class MoedaFactory {

	public static Real criarReal() {
		
		return new Real();
		
	}
	
	public static Dolar criarDolar() {
		
		return new Dolar();
		
	}
	
}
