package com.accenture.geeklab.factory.impl;

import com.accenture.geeklab.factory.Moeda;

public class Real implements Moeda{

	private final String simbol = "R$";

	@Override
	public String getSimbol() {

		return simbol;
		
	}
	
}
