package com.geeklab;

import com.geeklab.factory.impl.MoedaFactory;

public class FactoryLab {

	public static void main(String[] args) {
		
		System.out.println(MoedaFactory.criarReal().getSimbol());
		
		System.out.println(MoedaFactory.criarDolar().getSimbol());
		
	}

}
