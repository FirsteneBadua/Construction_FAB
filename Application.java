/* @author Firstene Badua
 * @version 1.0
 * Project 1
 * Spring '23
 */

public class Application {

	public static void main(String[] args) {

		// create a Building object and test constructors, getters, setters, and
		// toString
		Building building = new Building();
		building.setProjectName("Test Building");
		building.setCompleteAddress("123 Test Street");
		building.setTotalSquareFeet(1000);
		building.setOccupancyGroup("Business");
		building.setSubgroup("B");
		System.out.println(building.getProjectName()); // should print "Test Building"
		System.out.println(building.getCompleteAddress()); // should print "123 Test Street"
		System.out.println(building.getTotalSquareFeet()); // should print 1000.0
		System.out.println(building.getOccupancyGroup()); // should print "A"
		System.out.println(building.getSubgroup()); // should print "B"
		System.out.println(building.toString()); // should print "Building[Test Building, 123 Test Street, 1000.0, A,
		System.out.println();
		System.out.println();								// B]"

		Business business = new Business();
		business.setProjectName("Test Business");
		business.setCompleteAddress("456 Test Avenue");
		business.setTotalSquareFeet(2000);
		business.setOccupancyGroup("Business");
		business.setSubgroup("B");
		business.setNumRentableUnits(10);
		System.out.println(business.getProjectName()); // should print "Test Business"
		System.out.println(business.getCompleteAddress()); // should print "456 Test Avenue"
		System.out.println(business.getTotalSquareFeet()); // should print 2000.0
		System.out.println(business.getOccupancyGroup()); // should print "B"
		System.out.println(business.getSubgroup()); // should print "C"
		System.out.println(business.getNumRentableUnits()); // should print 10
		System.out.println(business.toString()); // should print "Business[Test Business, 456 Test Avenue, 2000.0, B, C,10]"
		System.out.println();
		System.out.println();						
		Residential residential = new Residential();
		residential.setProjectName("Test Residential");
		residential.setCompleteAddress("789 Test Street");
		residential.setTotalSquareFeet(1500);
		residential.setOccupancyGroup("Residential");
		residential.setSubgroup("R-1");
		residential.setNumBedrooms(2);
		residential.setNumBathrooms(2);
		residential.setLaundryRoom(true);
		System.out.println(residential.getProjectName()); // should print "Test Residential"
		System.out.println(residential.getCompleteAddress()); // should print "789 Test Street"
		System.out.println(residential.getTotalSquareFeet()); // should print 1500.0
		System.out.println(residential.getOccupancyGroup()); // should print "R-1"
		System.out.println(residential.getSubgroup()); // should print "B"
		System.out.println(residential.getNumBedrooms()); // should print 2
		System.out.println(residential.getNumBathrooms()); // should print 2
		System.out.println(residential.isLaundryRoom()); // should print true
		System.out.println(residential.toString()); // should print "Residential[Test Residential, 789 Test Street, 1500.0, R-1, B, 2, 2, true]"
		System.out.println();
		System.out.println();	
		Mall mall = new Mall();
		mall.setProjectName("Test Mall");
		mall.setCompleteAddress("456 Test Street");
		mall.setTotalSquareFeet(2000);
		mall.setOccupancyGroup("Business");
		mall.setSubgroup("B");
		mall.setNumRentedUnits(5);
		mall.setMedianUnitSize(400);
		mall.setNumParkingSpaces(10);
		System.out.println(mall.getProjectName()); // should print "Test Mall"
		System.out.println(mall.getCompleteAddress()); // should print "456 Test Street"
		System.out.println(mall.getTotalSquareFeet()); // should print 2000.0
		System.out.println(mall.getOccupancyGroup()); // should print "B"
		System.out.println(mall.getSubgroup()); // should print "C"
		System.out.println(mall.getNumRentedUnits()); // should print 5
		System.out.println(mall.getMedianUnitSize()); // should print 400.0
		System.out.println(mall.getNumParkingSpaces()); // should print 10
		System.out.println(mall.toString()); // should print "Mall[Test Mall, 456 Test Street, 2000.0, B, C, 5, 400.0
		System.out.println();
		System.out.println();
		Apartment apartment = new Apartment();
		apartment.setProjectName("Test Apartment");
		apartment.setCompleteAddress("789 Test Street");
		apartment.setTotalSquareFeet(3000);
		apartment.setOccupancyGroup("Residential");
		apartment.setSubgroup("R-2");
		apartment.setNumBedrooms(2);
		apartment.setNumBathrooms(2);
		apartment.setNumRentableUnits(10);
		apartment.setAvgUnitSize(500);
		System.out.println(apartment.getProjectName()); // should print "Test Apartment"
		System.out.println(apartment.getCompleteAddress()); // should print "789 Test Street"
		System.out.println(apartment.getTotalSquareFeet()); // should print 3000.0
		System.out.println(apartment.getOccupancyGroup()); // should print "R"
		System.out.println(apartment.getSubgroup()); // should print "2"
		System.out.println(apartment.getNumBedrooms()); // should print 2
		System.out.println(apartment.getNumBathrooms()); // should print 2
		System.out.println(apartment.getNumRentableUnits()); // should print 10
		System.out.println(apartment.getAvgunitSize()); // should print 500.0
		System.out.println(apartment.toString()); // should print "Apartment[Test Apartment, 789 Test Street, 3000.0, R, 2, 2, 10, 500
		System.out.println();
		System.out.println();
		// create a SingleFamilyHome object and test constructors, getters, setters, and
		// toString
		SingleFamilyHome home = new SingleFamilyHome();
		home.setProjectName("Test Home");
		home.setCompleteAddress("456 Test Street");
		home.setTotalSquareFeet(2000);
		home.setOccupancyGroup("Residential");
		home.setSubgroup("R-4");
		home.setGarage(true);
		System.out.println(home.getProjectName()); // should print "Test Home"
		System.out.println(home.getCompleteAddress()); // should print "456 Test Street"
		System.out.println(home.getTotalSquareFeet()); // should print 2000.0
		System.out.println(home.getOccupancyGroup()); // should print "R"
		System.out.println(home.getSubgroup()); // should print "1"
		System.out.println(home.getGarage()); // should print true
		System.out.println(home.toString()); // should print "SingleFamilyHome[Test Home, 456 Test Street, 2000.0, R, 1, true]"
	}
}
