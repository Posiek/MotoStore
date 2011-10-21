package com.pl.posiek;

import java.util.ArrayList;
import java.util.List;
 
public class Client {
	public String imie;
	public String nazwisko;
	public List<Motorcycle> MotoCatalog= new ArrayList<Motorcycle>();
	
	public Client(String imie, String nazwisko) {
		this.imie=imie;
		this.nazwisko=nazwisko;
		this.MotoCatalog = new ArrayList<Motorcycle>();
	}
	
	public void addMotorcycle(Motorcycle g) {
		MotoCatalog.add(g);
	}
	
	public void printClient(){
		System.out.println("Imiê: " + this.imie + " Nazwisko: " + this.nazwisko);
	}
	
	public void printMotoCatalog(){
		for(Motorcycle c : this.MotoCatalog) {
				c.printMotorcycle();
		}
	}

}