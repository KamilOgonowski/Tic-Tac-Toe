package com.kamil.beans;

import lombok.Getter;
import lombok.Setter;

public class Field {
	
	@Setter	@Getter
	private String symbol;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	

}
