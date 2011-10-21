package com.pl.posiek;

public class Motorcycle {

	public String marka;
	public String model;
	public String cena;
	public Motorcycle(String marka, String model, String cena){

	this.marka=marka;
	this.model=model;
	this.cena=cena;
	}
	
	public void printMotorcycle(){
	System.out.println("Marka i model: " + this.marka + this.model + "\t Cena: " + this.cena +" z³");
	}
	 
	}