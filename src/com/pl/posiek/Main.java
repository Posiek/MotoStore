package com.pl.posiek;

public class Main {
	public static void main(String[] args){
		Client cl= new Client("Jan", "Kowalski");
		cl.addMotorcycle(new Motorcycle("Honda ", "CBR 600RR", "59.000zl"));
		cl.addMotorcycle(new Motorcycle("Suzuki ", "GSXR 750", "64.000zl"));
		cl.addMotorcycle(new Motorcycle("Yamaha ", "R1", "56.900zl"));

		cl.printMotoCatalog();
		}
}
