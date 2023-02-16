/**
 * The Residential class represents a type of Building that is designed for residential use. It extends the Building class and adds additional properties such as the number of bedrooms, number of bathrooms, and a laundry room.
 * @author Firstene Badua
 * @version 1.0
 * Project 1
 * Spring '23
 */
public class Residential extends Building {

    /**
     * The number of bedrooms in the residential building.
     */
    private static int numBedrooms;

    /**
     * The number of bathrooms in the residential building.
     */
    private static int numBathrooms;

    /**
     * Whether the residential building has a laundry room or not.
     */
    private boolean laundryRoom;
    /**
     * Creates a new Residential object with default values.
     */
    public Residential() {
        super();
    }

    /**
     * Creates a new Residential object with the specified parameters.
     *
     * @param projectName the name of the project
     * @param completeAddress the complete address of the building
     * @param totalSquareFeet the total square footage of the building
     * @param occupancyGroup the occupancy group of the building
     * @param subgroup the subgroup of the occupancy group
     * @param numBedrooms the number of bedrooms in the building
     * @param numBathrooms the number of bathrooms in the building
     * @param laundryRoom whether the building has a laundry room or not
     */
    public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom) {
        super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
        Residential.numBedrooms = numBedrooms;
        Residential.numBathrooms = numBathrooms;
        this.laundryRoom = laundryRoom;
    }

    /**
     * Creates a new Residential object with the specified parameters.
     *
     * @param projectName the name of the project
     * @param completeAddress the complete address of the building
     * @param totalSquareFeet the total square footage of the building
     * @param medianUnitSize the median unit size of the building
     * @param laundryRoom whether the building has a laundry room or not
     * @param occupancyGroup the occupancy group of the building
     * @param subgroup the subgroup of the occupancy group
     * @param numBathrooms the number of bathrooms in the building
     * @param numBedrooms the number of bedrooms in the building
     */
    public Residential(String projectName, String completeAddress, double totalSquareFeet, int medianUnitSize, boolean laundryRoom, String occupancyGroup, String subgroup, int numBathrooms, int numBedrooms) {
        setProjectName(projectName);
        setCompleteAddress(completeAddress);
        setTotalSquareFeet(totalSquareFeet);
        setLaundryRoom(laundryRoom);
        setOccupancyGroup(occupancyGroup);
        setSubgroup(subgroup);
        Residential.numBathrooms = numBathrooms;
        Residential.numBedrooms = numBedrooms;
    }

    /**
     * Draws the Residential object.
     */
    @Override
    public void draw() {
        System.out.println("Drawing code for Residential.");
    }

    /**
     * Returns a string representation of the Residential object's data, including information about the number of bedrooms, number of bathrooms, and laundry room.
     *
     * @return a string representation of the Residential object's data
     */
    @Override
    public String displayData() {
        return super.displayData() + "\nNumber of Bedrooms: " + getNumBedrooms() + "\nNumber of Bathrooms: " + getNumBathrooms() + "\nLaundry Room: " + laundryRoom;
    }

    /**
     * Returns the number of bedrooms for the Residential object.
     *
     * @return the number of bedrooms for the Residential object
     */
    public static int getNumBedrooms() {
        return numBedrooms;
    }

    /**
     * Sets the number of bedrooms for the Residential object.
     *
     * @param numBedrooms the number of bedrooms to set for the Residential object
     */
    public static void setNumBedrooms(int numBedrooms) {
        Residential.numBedrooms = numBedrooms;
    }

    /**
     * Returns the number of bathrooms for the Residential object.
     *
     * @return the number of bathrooms for the Residential object
     */
    public static int getNumBathrooms() {
        return numBathrooms;
    }

    /**
     * Sets the number of bathrooms for the Residential object.
     *
     * @param numBathrooms the number of bathrooms to set for the Residential object
     */
    public static void setNumBathrooms(int numBathrooms) {
        Residential.numBathrooms = numBathrooms;
    }

    /**
     * Returns whether or not the Residential object has a laundry room.
     *
     * @return true if the Residential object has a laundry room, false otherwise
     */
    public boolean isLaundryRoom() {
        return laundryRoom;
    }

    /**
     * Sets whether or not the Residential object has a laundry room.
     *
     * @param laundryRoom true to set the Residential object to have a laundry room, false otherwise
     */
    public void setLaundryRoom(boolean laundryRoom) {
        this.laundryRoom = laundryRoom;
    }
    /**
     * Overrides the toString method to return a string representation of the Residential object,
     * including the inherited fields from the Building class, as well as the number of bedrooms,
     * number of bathrooms, and availability of a laundry room.
     *
     * @return a string representation of the Residential object
     */
    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Number of Bedrooms: " + numBedrooms + "\n"
                + "Number of Bathrooms: " + numBathrooms + "\n"
                + "Laundry Room: " + (laundryRoom ? "Y" : "N");
    }


}
