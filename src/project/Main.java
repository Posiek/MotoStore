package project;

import org.apache.log4j.*;

public class Main {
	
	private static Logger logger = Logger.getLogger(Main.class);
	
	public static void main(String[] args) throws PriceException {
		
		PropertyConfigurator.configure("Log4J.properties");
		
		
		Client cl= new Client("Jan", "Kowalski");
		try {
			cl.addMotorcycle(Brand.Honda, "CBR 600RR", 59000, 2003);
			cl.addMotorcycle(Brand.Suzuki, "GSXR 750", 64000, 2002);
			cl.addMotorcycle(Brand.Yamaha, "R1", 56900, 2001);	
			cl.addMotorcycle(Brand.Aprillia, "Factory", 73000, 2003);
		} catch (PriceException exception) {
			logger.error(exception);
		}

		cl.printMotoCatalog();
		
		cl.deleteMotorcycle(cl.findAllMotorcycleByModel("CBR 600RR"));
		}
}
