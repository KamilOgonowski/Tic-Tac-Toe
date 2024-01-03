package com.kamil.beans;

import java.util.ArrayList;
import java.util.List;

public class Row {
	
	List<Field> fields;
	int size;
	
	public Row() {
		this.fields = new ArrayList();
	}
	
	public void show() {
		for(int i = 0; i<size; i++)
			System.out.println(fields.get(i).getSymbol());
	}

}
