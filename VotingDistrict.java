/**
 * Author: Benjamin Bock
 * Date: 11/8/2019
 * This is the voting districts object. It allows for a series of addresses to be held within the Addresses array
 *  * along with a name
 *  * (note as of 11/15/2019) Each voting district will have an Issues and Elections array
 */

//TODO: write in elections section
//TODO: Javadocs for the class



    

public class VotingDistrict {
    private String Name = "noNameDistrict";



    private String[] Addresses = new String[100];
    private Issues[] Issues = new Issues[100];
    private Elections[] Elections = new Elections[100];
    private final int CURRENTWORKADDRESSNUM  = 0;

    /**
     * A constructor that takes in the name of the school district and
     * builds a new SchoolDistrict object
     * @param name the name of the district
     */
    public VotingDistrict(String name) {
        Name = name;
        //add many many addresses from a database
       // Addresses[0] = "Albuquerque, NM 87132"; //this is a value that is put in for every Voting district that is created

        Issues[0] = new Issues("Bill One", "Test Issue");

    }

    /**
     * A constrictor that takes an array of addresses to be passed into the Addresses member variable
     * @param name The name of the district, typically "District #"
     * @param addressesArr A list of addresses
     */
    public VotingDistrict(String name, String[] addressesArr) {
        //TODO: Figure out a way to make Addresses be reassigned to addressesArr; use address at
        Name = name;
       // Addresses = addressesArr;
        //This is not assigning addressesArr to Addresses
        for (int i = 0; i < addressesArr.length; i++){
            Addresses[i] = addressesArr[i];
        }

    }

    /**
     * A method that allows an address to be added at a certain spot
     * in the member variable Addresses array
     * @param address The address to be added
     * @param index the index where the address is to be added
     */
    public void addAddressAt (String address, int index){
        if (Addresses[index] == null){
            Addresses[index] = address;
        }

    }


    /**
     * checks to see if the address is in the district
     * @param address the address to compare
     * @return a true or false if the address i in the district
     */
    public boolean isAddressIn (String address){
        address = address.toLowerCase();
        for(int i = 0; i < Addresses.length; i++) {
            if (Addresses[i] != null) {
                if (address.equals(Addresses[i].toLowerCase())) {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * gets the name of the district
     * @return a string representation of the district's name
     */
    public String getName (){
        return Name;
    }

    /**
     * Gets a string representation of the district's issues
     * @return a string representation of the district's issues array
     */
    public String getIssues (){
       return Util.printArray(Issues);
    }

    /**
     * Gets a string representation of the district's elections
     * @return a string representation of the district's elections array
     */
    public String getElections(){
        return Util.printArray(Elections);
        //inside elections there will be a list of candidates running for each election
    }

    //TODO: write an info toString that prints out the rest of the district's info
    public String toString(){

        return this.getName() + "\n";
                //+ this.getIssues() + "\n"
                //+ this.getElections();
        //TODO: take this out when getIssues is working
    }

    /**
     * Will Allow a display of the district with all of its addresses included
     */
    public void toStringWAddresses (){
        Util.printArray(Addresses);
    }

}
