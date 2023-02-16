/**
 * The Building class represents a building in a real estate system. It provides
 * methods to set and get the building's project name, complete address, total
 * square feet, occupancy group, and subgroup, as well as to draw the building
 * and display its data.
 * @author Firstene Badua
 * @version 1.0
 * Project 1
 * Spring '23 
 */
public class Building {

	private String projectName;
	private String completeAddress;
	private double totalSquareFeet;
	private String occupancyGroup;
	protected String subgroup;

	/**
	 * Creates a new Building object with default values.
	 */
	public Building() {
		this.projectName = "";
		this.completeAddress = "";
		this.totalSquareFeet = 0.0;
		this.occupancyGroup = "";
		this.setSubgroup("");
	}

	/**
	 * Creates a new Building object with the given values.
	 * 
	 * @param projectName     the name of the building project
	 * @param completeAddress the complete address of the building
	 * @param totalSquareFeet the total square footage of the building
	 * @param occupancyGroup  the occupancy group of the building
	 * @param subgroup        the subgroup of the building
	 */
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) {
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.setSubgroup(subgroup);
	}

	/**
	 * Returns the project name of the building.
	 * 
	 * @return the project name of the building
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * Sets the project name of the building.
	 * 
	 * @param projectName the new project name of the building
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	/**
	 * Returns the complete address of the building.
	 * 
	 * @return the complete address of the building
	 */
	public String getCompleteAddress() {
		return completeAddress;
	}

	/**
	 * Sets the complete address of the building.
	 * 
	 * @param completeAddress the new complete address of the building
	 */
	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}

	/**
	 * Returns the total square footage of the building.
	 * 
	 * @return the total square footage of the building
	 */
	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}

	/**
	 * Sets the total square footage of the building.
	 * 
	 * @param totalSquareFeet the new total square footage of the building
	 */
	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}

	/**
	 * Returns the occupancy group of the building.
	 * 
	 * @return the occupancy group of the building
	 */
	public String getOccupancyGroup() {
		return occupancyGroup;
	}

	/**
	 * Sets the occupancy group of the building.
	 * 
	 * @param occupancyGroup the new occupancy group of the building
	 */
	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}

	/**
	 * 
	 * The setSubgroup method sets the subgroup of the building.
	 * 
	 * @param subgroup A String representing the new subgroup for the building.
	 */
	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	}

	/**
	 * 
	 * The draw method prints a message indicating that the code for drawing the
	 * building has been executed.
	 */
	public void draw() {
		System.out.println("Drawing code for Building.");
	}

	/**
	 * 
	 * The displayData method returns a formatted String containing information
	 * about the building.
	 * 
	 * @return A String representing the building's project name, complete address,
	 *         total square footage, occupancy group, and subgroup.
	 */
	public String displayData() {
		return "Project Name: " + projectName + "\nComplete Address: " + completeAddress + "\nTotal Square Feet: "
				+ totalSquareFeet + "\nOccupancy Group: " + occupancyGroup + "\nSubgroup: " + getSubgroup();
	}

	/**
	 * Returns the occupancy subgroup of the building.
	 *
	 * @return The occupancy subgroup of the building.
	 */
	public String getSubgroup() {
	    return subgroup;
	}

	/**
	 * Returns a string representation of the building, including the project name, complete address,
	 * total square feet, occupancy group, and occupancy subgroup.
	 *
	 * @return A string representation of the building.
	 */
	@Override
	public String toString() {
	    return "Project Name: " + projectName + "\n"
	            + "Address: " + completeAddress + "\n"
	            + "Square Feet: " + totalSquareFeet + "\n"
	            + "Occupancy Group: " + occupancyGroup + "\n"
	            + "Occupancy Subgroup: " + subgroup;
	}
	
}