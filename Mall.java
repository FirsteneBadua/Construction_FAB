/**
 * Represents a mall, which is a type of business. Contains information about
 * the number of rented units, the median unit size, and the number of parking
 * spaces.
 * @author Firstene Badua
 * @version 1.0
 * Project 1
 * Spring '23
 */
public class Mall extends Business {
	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;

	/**
	 * Creates a new Mall object with default values.
	 */
	public Mall() {
		super();
	}

	/**
	 * Creates a new Mall object with the given project name, complete address,
	 * total square feet, occupancy group, and subgroup. Initializes the number of
	 * rented units, median unit size, and number of parking spaces to 0.
	 *
	 * @param projectName     the project name of the mall
	 * @param completeAddress the complete address of the mall
	 * @param totalSquareFeet the total square feet of the mall
	 * @param occupancyGroup  the occupancy group of the mall
	 * @param subgroup        the subgroup of the mall
	 */
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numRentedUnits = 0;
		this.medianUnitSize = 0.0;
		this.numParkingSpaces = 0;
	}

	/**
	 * Draws the code for the Mall object.
	 */
	public void draw() {
		System.out.println("Drawing code for Mall.");
	}

	/**
	 * Returns a string representation of the Mall object, including information
	 * about the project name, complete address, total square feet, occupancy group,
	 * subgroup, number of rented units, median unit size, and number of parking
	 * spaces.
	 *
	 * @return a string representation of the Mall object
	 */
	public String displayData() {
		StringBuilder sb = new StringBuilder();
		sb.append("Project Name: " + getProjectName() + "\n");
		sb.append("Complete Address: " + getCompleteAddress() + "\n");
		sb.append("Total Square Feet: " + getTotalSquareFeet() + "\n");
		sb.append("Occupancy Group: " + getOccupancyGroup() + "\n");
		sb.append("Subgroup: " + getSubgroup() + "\n");
		sb.append("Number of Rented Units: " + numRentedUnits + "\n");
		sb.append("Median Unit Size: " + medianUnitSize + "\n");
		sb.append("Number of Parking Spaces: " + numParkingSpaces + "\n");
		return sb.toString();
	}

	/**
	 * 
	 * Returns the subgroup of the occupancy group for this building.
	 * 
	 * @return the subgroup of the occupancy group
	 */
	public String getSubgroup() {
		return subgroup;
	}

	/**
	 * 
	 * Returns the number of rented units in the mall.
	 * 
	 * @return the number of rented units in the mall.
	 */
	public int getNumRentedUnits() {
		return numRentedUnits;
	}

	/**
	 * 
	 * Sets the number of rented units in the mall.
	 * 
	 * @param numRentedUnits the new number of rented units in the mall.
	 */
	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}

	/**
	 * 
	 * Returns the median unit size of the mall.
	 * 
	 * @return the median unit size of the mall.
	 */
	public double getMedianUnitSize() {
		return medianUnitSize;
	}

	/**
	 * 
	 * Sets the median unit size of the mall.
	 * 
	 * @param medianUnitSize the new median unit size of the mall.
	 */
	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}

	/**
	 * 
	 * Returns the number of parking spaces in the mall.
	 * 
	 * @return the number of parking spaces in the mall.
	 */
	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}

	/**
	 * 
	 * Sets the number of parking spaces in the mall.
	 * 
	 * @param numParkingSpaces the new number of parking spaces in the mall.
	 */
	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}

	/**
	 * Returns a string representation of the mall, including its project name,
	 * complete address, total square feet, occupancy group, occupancy subgroup,
	 * number of rented units, median unit size, and number of parking spaces.
	 *
	 * @return a string representation of the mall
	 */
	@Override
	public String toString() {
		return super.toString() + "\n" + "Number of Rented Units: " + numRentedUnits + "\n" + "Median Unit Size: "
				+ medianUnitSize + "\n" + "Number of Parking Spaces: " + numParkingSpaces;
	}

}