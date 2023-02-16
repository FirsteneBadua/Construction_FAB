/**
 * This class represents a business building that extends the Building class.
 * @author Firstene Badua
 * @version 1.0
 * Project 1
 * Spring '23
 */
public class Business extends Building {
	private int numRentableUnits;

	/**
	 * Constructs a new Business object with default values for all fields.
	 */
	public Business() {
		super();
	}

	/**
	 * Constructs a new Business object with the given values for its fields.
	 *
	 * @param projectName     The name of the project.
	 * @param completeAddress The complete address of the building.
	 * @param totalSquareFeet The total square feet of the building.
	 * @param occupancyGroup  The occupancy group of the building.
	 * @param subgroup        The subgroup of the building.
	 */
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
	}

	/**
	 * Overrides the draw method in the Building class to provide custom drawing
	 * code for Business objects.
	 */
	@Override
	public void draw() {
		System.out.println("Drawing code for Business.");
	}

	/**
	 * Overrides the displayData method in the Building class to add the number of
	 * rentable units to the string representation of the object.
	 *
	 * @return A string containing the project name, complete address, total square
	 *         feet, occupancy group, subgroup, and number of rentable units.
	 */
	@Override
	public String displayData() {
		return super.displayData() + "\nNumber of Rentable Units: " + numRentableUnits;
	}

	/**
	 * Sets the number of rentable units in the residential property.
	 *
	 * @param numRentableUnits the number of rentable units
	 */
	public void setNumRentableUnits(int numRentableUnits) {
	    this.numRentableUnits = numRentableUnits;
	}

	/**
	 * Returns the number of rentable units in the residential property.
	 *
	 * @return the number of rentable units
	 */
	public int getNumRentableUnits() {
	    return numRentableUnits;
	}


}
