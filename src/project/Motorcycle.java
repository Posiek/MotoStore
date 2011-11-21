package project;

public class Motorcycle {

	public Brand brand;
	public String model;
	public int price;
	public int yearOfManufacture;
	
	public Motorcycle(Brand brand, String model, int price, int yearOfManufacture){
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.yearOfManufacture = yearOfManufacture;
	}
	
	public void printMotorcycle(){
	System.out.println("Brand and model: " + this.brand + " " + this.model + "\tYear of manufacture: " + this.yearOfManufacture + "\t Price: " + this.price +" zl");
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}


	 
	}