package com.accenture.geeklab.factory.impl;

import com.accenture.geeklab.factory.Moeda;

public class Dolar implements Moeda{
	
	private final String simbol = "USD";

	@Override
	public String getSimbol() {

		return simbol;
	}

}
