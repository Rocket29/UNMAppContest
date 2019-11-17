/**
 * Author: Benjamin Bock
 * Date: 11/8/2019
 * This is the School districts object. It allows for a series of addresses to be held within the Addresses array
 * long with a name
 * (note as of 11/15/2019) Each school district will have an Issues and Elections array
 */



//TODO: write in issues section
//TODO: write in elections section

public class SchoolDistrict {
    private String NAME = "noNameDistrict";

    public String[] Addresses = new String[100];

    private final int CURRENTWORKADDRESSNUM  = 0;

    /**
     * A constructor that builds a new SchoolDistrict object with
     * the default name
     */
    public SchoolDistrict(){
        //add many many addresses from a database
        Addresses[0] = "Albuquerque, NM 87131"; //test address for all School district objects
    }

    /**
     * A constrictor that takes a name, and sets the member variable accordingly
     * @param name the name of the district, typically "District #"
     */
    public SchoolDistrict(String name){
        NAME = name;
        //add many many addresses from a database, using ArrayBuilder
        Addresses[0] = "Albuquerque, NM 87131"; //test address for all School district objects
    }

    /**
     * A constrictor that takes an array of addresses to be passed into the Addresses member variable
     * @param name The name of the district, typically "District #"
     * @param addressesarr A list of addresses
     */
    public SchoolDistrict(String name, String[] addressesarr) {
        NAME = name;
        Addresses = addressesarr;
    }

    /**
     * checks to see if the address is in the district
     * @param address the address to compare
     * @return a true or false if the address i in the district
     */
    public boolean isAddressIn (String address){
        address = address.toLowerCase();
        for(int i = 0; i <= Addresses.length; i++) {
            if(Addresses[i] == (null)){
                i++;
            }else if (address.equals(Addresses[i].toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    /**
     * converts the district to a string
     * @return returns the name of the school district
     */
    public String toString(){ return NAME; }

    /**
     * Will Allow a display of the district with all of its addresses included
     */
    public void toStringWAddresses (){
        Util.printArray(Addresses);
    }
    //TODO: write an info toString that prints out the rest of the district's info

}
