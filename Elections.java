


/**
 * Author: Benjamin Bock
 * Date: 11/08/2019
 *
 * This class will become part of the districts classes. The idea is that each election has a title or
 * position for witch is being ran, and there are a number of candidates running for that title or position.
 * As of 11/15/2019 this has yet to be implemented, but is expected to be implemented
 * before the project is turned in for the final draft
 */
//TODO: write in candidates object



public class Elections {


    private String Name = "noNameElection"; //The name of the election or the position
    private String[] Candidates = new String[20]; //There may be candidate objects in the future

    /**
     * A constructor for the Election class, takes in a name and sets the member
     * variable to that name.
     * @param name the name of the election.
     */
    public Elections(String name){
        Name = name;
    }

    /**
     * A getter for the name of the election
     * @return the name of the election
     */
    public String getName(){
        return Name;
    }


    /**
     * A to string method for the Elections class
     * This to string just returns the name
     * The toInfoString returns more
     * @return A string of the name of the election
     */
    public String toString(){
        return Name;
    }

    /**
     * This method returns more than the toString method
     * It returns the name, the candidates, and a description of the election
     * @return
     */
    public String toInfoString (){
        //TODO: add toInfoStringMethod
        return null;
    }

}
