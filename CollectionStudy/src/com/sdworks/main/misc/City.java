package com.sdworks.main.misc;

public class City {
	
	private String name;
	public City() {
		// TODO Auto-generated constructor stub
	}
	
	public City(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString(){
		return "City: "+name;
	}
	
}
