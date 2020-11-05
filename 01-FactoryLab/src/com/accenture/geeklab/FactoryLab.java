package com.accenture.geeklab;

import com.accenture.geeklab.factory.impl.MoedaFactory;

public class FactoryLab {

	public static void main(String[] args) {
		
		System.out.println(MoedaFactory.criarReal().getSimbol());
		
		System.out.println(MoedaFactory.criarDolar().getSimbol());
		
	}

}
