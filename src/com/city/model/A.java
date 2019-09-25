package com.city.model;

import java.util.ArrayList;
import java.util.List;

public class A {

	
	int id ;
	String name;
	List<B> listB= new ArrayList<B>();
	public A(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "A [id=" + id + ", name=" + name + ", listB=" + listB + "]";
	}
	
	
}
