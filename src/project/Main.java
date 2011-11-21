package project;

public class Main {
	public static void main(String[] args){
		
		Client cl= new Client("Jan", "Kowalski");
		cl.addMotorcycle(new Motorcycle(Brand.Honda, "CBR 600RR", 59000, 2003));
		cl.addMotorcycle(new Motorcycle(Brand.Suzuki, "GSXR 750", 64000, 2002));
		cl.addMotorcycle(new Motorcycle(Brand.Yamaha, "R1", 56900, 2001));

		cl.printMotoCatalog();
		}
}
