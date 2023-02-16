/**
 * A class representing a single family home that is a type of residential building.
 * @author Firstene Badua
 * @version 1.0
 * Project 1
 * Spring '23
 */
public class SingleFamilyHome extends Residential {

    /**
     * A boolean indicating whether the single family home has a garage.
     */
    private boolean garage;

    /**
     * Constructs a new SingleFamilyHome object with default values.
     */
    public SingleFamilyHome() {
        super();
        this.garage = false;
    }

    /**
     * Constructs a new SingleFamilyHome object with the given parameter values.
     *
     * @param projectName The name of the project.
     * @param completeAddress The complete address of the single family home.
     * @param totalSquareFeet The total square feet of the single family home.
     * @param occupancyGroup The occupancy group of the single family home.
     * @param subgroup The subgroup of the occupancy group of the single family home.
     * @param numBedrooms The number of bedrooms in the single family home.
     * @param numBathrooms The number of bathrooms in the single family home.
     * @param laundryRoom A boolean indicating whether the single family home has a laundry room.
     * @param garage A boolean indicating whether the single family home has a garage.
     */
    public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, boolean garage) {
        super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms, laundryRoom);
        this.garage = garage;
    }

    /**
     * Sets whether the single family home has a garage or not.
     *
     * @param garage A boolean indicating whether the single family home has a garage.
     */
    public void setGarage(boolean garage) {
        this.garage = garage;
    }
    /**

    Returns whether or not the residential property has a garage.
    @return true if the property has a garage, false otherwise
    */
    public boolean getGarage() {
    return garage;
    }
    /**
     * Displays the data for the single family home, including the garage attribute.
     *
     * @return A string representation of the single family home, including the garage attribute.
     */
    public String displayData() {
        String output = super.displayData();
        output += "Garage: " + this.garage + "\n";
        return output;
    }

    /**
     * Draws the single family home.
     */
    public void draw() {
        System.out.println("Drawing code for SingleFamilyHome");
    }
    /**

    Returns a string representation of the Project object. The string includes
    the project name, complete address, total square feet, occupancy group, occupancy
    subgroup, and garage status.
    @return a string representation of the Project object
    */
    @Override
    public String toString() {
    return "Project Name: " + getProjectName() + "\n" +
    "Address: " + getCompleteAddress() + "\n" +
    "Square Feet: " + getTotalSquareFeet() + "\n" +
    "Occupancy Group: " + getOccupancyGroup() + "\n" +
    "Occupancy Subgroup: " + subgroup + "\n" +
    "Garage: " + garage;
    }

}
