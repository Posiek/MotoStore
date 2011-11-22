package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import project.*;


public class ClientTest {
	
	Client cl= new Client("Jan", "Kowalski");

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		cl.addMotorcycle(Brand.Honda, "CBR 600RR", 59000, 2003);
	}

	@After
	public void tearDown() throws Exception {
		cl.deleteAllMotorcycle();
	}

	@Test
	public void testClient() throws PriceException {
		Client cl1= new Client("Bartosz", "Posiakow");
		cl1.addMotorcycle(Brand.Suzuki, "GSXR 750", 2010, 79000);
		assertTrue(cl1.getMotoCatalog().size() == 1);
		assertTrue(cl1.getFirstName().equals("Bartosz"));
		assertTrue(cl1.getSurname().equals("Posiakow"));
	}

	@Test
	public void testAddMotorcycle() throws PriceException {
		cl.addMotorcycle(Brand.Kawasaki, "Ninja 750", 2011, 83000);
		assertTrue(cl.getMotoCatalog().size() == 2);
	}

	@Test
	public void testDeleteMotorcycle() {
		cl.deleteMotorcycle(cl.findAllMotorcycleByYearOfManufacture(2003));
		assertTrue(cl.getMotoCatalog().size() == 0);
	}

	@Test
	public void testDeleteAllMotorcycle() throws PriceException {
		cl.addMotorcycle(Brand.Honda, "CB 400", 1994, 2500);
		cl.deleteAllMotorcycle();
		assertTrue(cl.getMotoCatalog().size() == 0);
	}

	@Test
	public void testEditMotorcyclePrice() throws PriceException {
		cl.addMotorcycle(Brand.Ducati, "Diavel", 59000, 2011);
		cl.addMotorcycle(Brand.Ducati, "Multistrada 1200", 2011, 86099);
		cl.editMotorcyclePrice(cl.findAllMotorcycleByYearOfManufacture(2011), 59000);
		assertTrue(cl.getMotoCatalog().get(0).getPrice() == 59000);
		assertTrue(cl.getMotoCatalog().get(1).getPrice() == 59000);
		assertSame(59000, cl.getMotoCatalog().get(0).getPrice());
		assertSame(59000, cl.getMotoCatalog().get(1).getPrice());
		
	}

	@Test
	public void testEditMotorcycleYearOfManufacture() {
		cl.editMotorcycleYearOfManufacture(cl.findAllMotorcycleByBrand(Brand.Honda), 2003);
		assertTrue(cl.getMotoCatalog().get(0).getYearOfManufacture() == 2003);
	}

	@Test
	public void testFindAllMotorcycleByBrand() {
		
	}

	@Test
	public void testFindAllMotorcycleByModel() {
		assertEquals(cl.getMotoCatalog().get(0), cl.findAllMotorcycleByModel("CBR 600RR").get(0));
	}

	@Test
	public void testFindAllMotorcycleByYearOfManufacture() throws PriceException {
		cl.addMotorcycle(Brand.Honda, "CBR 600F4", 2001, 23990);
		cl.addMotorcycle(Brand.Honda, "CBR 600F4i Sport", 2001, 31990);
		assertEquals(cl.getMotoCatalog().get(1), cl.findAllMotorcycleByYearOfManufacture(2001).get(1));
		assertSame(cl.getMotoCatalog().get(2), cl.findAllMotorcycleByYearOfManufacture(2001).get(2));
	}

	@Test
	public void testPrintClient() {
		fail("Not yet implemented");
	}

	@Test
	public void testPrintMotoCatalog() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFirstName() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetFirstName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSurname() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetSurname() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMotoCatalog() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetMotoCatalog() {
		fail("Not yet implemented");
	}

}
