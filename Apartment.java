/**
 * 
 * Represents an apartment which is a type of residential building.
 * @author Firstene Badua
 * @version 1.0
 * Project 1
 * Spring '23
 */
public class Apartment extends Residential {
	private static int numRentableUnits;
	private double avgUnitSize;
	private static boolean parkingAvailable;

	/**
	 * 
	 * Constructs a new instance of Apartment with default values.
	 */
	public Apartment() {
		super();
		Apartment.numRentableUnits = 0;
		this.avgUnitSize = 0;
		Apartment.parkingAvailable = false;
	}

	/**
	 * 
	 * Constructs a new instance of Apartment with specified values for its
	 * attributes.
	 * 
	 * @param projectName     the name of the project
	 * @param completeAddress the complete address of the apartment building
	 * @param totalSquareFeet the total square footage of the apartment building
	 * @param occupancyGroup  the occupancy group of the apartment building
	 * @param subgroup        the subgroup of the apartment building
	 */
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numRentableUnits,
				numRentableUnits, parkingAvailable);
		Apartment.numRentableUnits = 0;
		this.avgUnitSize = 0;
		Apartment.parkingAvailable = false;
	}

	/**
	 * 
	 * Constructs a new instance of Apartment with specified values for all of its
	 * attributes.
	 * 
	 * @param numRentableUnits the number of rentable units in the apartment
	 *                         building
	 * @param avgUnitSize      the average unit size in the apartment building
	 * @param parkingAvailable whether or not parking is available in the apartment
	 *                         building
	 * @param projectName      the name of the project
	 * @param completeAddress  the complete address of the apartment building
	 * @param totalSquareFeet  the total square footage of the apartment building
	 * @param occupancyGroup   the occupancy group of the apartment building
	 * @param subgroup         the subgroup of the apartment building
	 */
	public Apartment(int numRentableUnits, double avgUnitSize, boolean parkingAvailable, String projectName,
			String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		super(projectName, completeAddress, totalSquareFeet, numRentableUnits, parkingAvailable, occupancyGroup,
				subgroup, numRentableUnits, numRentableUnits);
		Apartment.numRentableUnits = numRentableUnits;
		this.avgUnitSize = avgUnitSize;
		Apartment.parkingAvailable = parkingAvailable;
	}

	/**
	 * This method prints the drawing code for an apartment.
	 */
	public void draw() {
		System.out.println("Drawing code for Apartment");
	}

	/**
	 * This method returns a string containing the data of the apartment including
	 * the data of the residential building it inherits from, the number of rentable
	 * units, the average unit size, and the parking availability.
	 * 
	 * @return a string containing the data of the apartment including the data of
	 *         the residential building it inherits from, the number of rentable
	 *         units, the average unit size, and the parking availability.
	 */
	public String displayData() {
		return super.displayData() + "\nNumber of Rentable Units: " + Apartment.numRentableUnits
				+ "\nAverage Unit Size: " + this.avgUnitSize + "\nParking Available: " + Apartment.parkingAvailable;
	}

	/**
	 * This method sets the number of rentable units for the apartment.
	 * 
	 * @param numRentableUnits the number of rentable units for the apartment.
	 */
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}
	/**
	 * Returns the number of rentable units in the residential building.
	 * 
	 * @return the number of rentable units in the residential building
	 */
	public int getNumRentableUnits() {
	    return numRentableUnits;
	}

	
	/**
	 * This method sets the average unit size for the apartment.
	 * 
	 * @param avgUnitSize the average unit size for the apartment.
	 */
	public void setAvgUnitSize(int avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}
	/**
	 * Returns the average unit size of the Residential building.
	 * 
	 * @return the average unit size of the Residential building.
	 */
	public double getAvgunitSize() {
	    return avgUnitSize;
	}
	/**
	 * This method sets the parking availability for the apartment.
	 * 
	 * @param parkingAvailable the parking availability for the apartment.
	 */
	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}
	/**

	Returns a string representation of the Residential object, including its project name, complete address,
	total square feet, occupancy group, subgroup, number of rentable units, average unit size, and whether or
	not parking is available.*/
	@Override
	public String toString() {
	    return super.toString() + "\n"
	            + "Number of Rentable Units: " + numRentableUnits + "\n"
	            + "Average Unit Size: " + avgUnitSize + "\n"
	            + "Parking Available: " + (parkingAvailable ? "Y" : "N");
	}

}
