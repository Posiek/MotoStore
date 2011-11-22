package project;

import java.util.*;
import org.apache.log4j.*;

 
public class Client {
	
	private static Logger logger = Logger.getLogger(Client.class);
	
	public String firstName;
	public String surname;
	public List<Motorcycle> MotoCatalog= new ArrayList<Motorcycle>();
	
	public Client(String firstName, String surname) {
		this.firstName = firstName;
		this.surname = surname;
		this.MotoCatalog = new ArrayList<Motorcycle>();
	}
	
	public void addMotorcycle(Brand brand, String model, int yearOfManufacture,
			int price) throws PriceException {
		if (price > 0) {
			MotoCatalog.add(new Motorcycle(brand, model, yearOfManufacture, price));
			logger.info("addMotorcycle");
		}
		if (price <= 0)
			throw new PriceException("Price cannot by less than 0");
	}
	
	
	
	public void deleteMotorcycle(List<Motorcycle> MotoCatalog) {
		for (Motorcycle Motorcycle : MotoCatalog) {
		MotoCatalog.remove(Motorcycle);
		
		}
		logger.info("deleteMotorcycle");
	}

	public void deleteAllMotorcycle() {
		MotoCatalog.clear();
		
		logger.info("deleteAllMotorcycle");
	}

	public void editMotorcyclePrice(List<Motorcycle> MotoCatalog, int price) throws PriceException {
		if (price > 0) {
			for (Motorcycle Motorcycle : MotoCatalog) {
				Motorcycle.setPrice(price);
			}
		}
		if (price <= 0)
			throw new PriceException("Price cannot by less than 0");
	}

	public void editMotorcycleYearOfManufacture(List<Motorcycle> MotoCatalog, int yearOfManufacture) {
		for (Motorcycle Motorcycle : MotoCatalog) {
			Motorcycle.setYearOfManufacture(yearOfManufacture);
		}
	}

	public List<Motorcycle> findAllMotorcycleByBrand(Brand brand) {
		List<Motorcycle> results = new ArrayList<Motorcycle>();
		for (Motorcycle Motorcycle : MotoCatalog) {
			if (Motorcycle.getBrand().equals(brand)) {
				results.add(Motorcycle);
			}
		}
		return results;
	}

	public List<Motorcycle> findAllMotorcycleByModel(String model) {
		List<Motorcycle> results = new ArrayList<Motorcycle>();
		for (Motorcycle Motorcycle : MotoCatalog) {
			if (Motorcycle.getModel().equals(model)) {
				results.add(Motorcycle);
			}
		}
		return results;
	}
	
	public List<Motorcycle> findAllMotorcycleByYearOfManufacture(int yearOfManufacture) {
		List<Motorcycle> results = new ArrayList<Motorcycle>();
		for (Motorcycle Motorcycle : MotoCatalog) {
			if (Motorcycle.getYearOfManufacture()==yearOfManufacture) {
				results.add(Motorcycle);
			}
		}
		return results;
	}
	
	public void printClient(){
		System.out.println("First name: " + this.firstName + " Surname: " + this.surname);
	}
	
	public void printMotoCatalog(){
		for(Motorcycle c : this.MotoCatalog) {
				c.printMotorcycle();
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public List<Motorcycle> getMotoCatalog() {
		return MotoCatalog;
	}

	public void setMotoCatalog(List<Motorcycle> motoCatalog) {
		MotoCatalog = motoCatalog;
	}

}