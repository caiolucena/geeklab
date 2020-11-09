package com.geeklab.factory.impl;

import com.geeklab.factory.Moeda;

public class Real implements Moeda{

	private final String simbol = "R$";

	@Override
	public String getSimbol() {

		return simbol;
		
	}
	
}
