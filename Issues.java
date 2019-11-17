/*
Author: Benjamin Bock
Date: 11/8/2019
This is the Issues class that will become part of the districts classes
This class will hold methods to interact with an array of issues,
along with the name, description, and the demographics effected by the issues
 */


public class Issues {

    public String Name = "Unnamed Issue";
    public String Description = "";
    //add a "demographics it effects" section for comparison to user profile

    /**
     * The Constructor for the Issues class. It takes in a name and a description and changes those
     * default values accordingly
     * @param name the name of the Issue or bill
     * @param description the full description of the issue
     */
    public Issues (String name, String description){
        Name = name;
        Description = description;
    }

    /**
     * The same as the constructor above but it only takes a name parameter
     * @param name The name of the issue or bill
     */
    //TODO:fix this constructor
    public Issues (String name){
       Name = name;
       Description = null;
    }

    /**
     * A to string method for the Issues class
     * It just returns the name
     * The toInfoString returns more information
     * @return the name of the issue
     */
    public String toString (){
        return Name;
    }

    /**
     * This method returns a String of the Description, the Name, and the demographics effected
     * of that issue
      * @return A string of the name, description, and demographics
     */
    public String toInfoString(){
        return Name + "\n" + Description;
    }

    /**
     * A getter for the name
     * @return a string of the name
     */
    public String getName(){
        return Name;
    }

    /**
     * a getter for the description
     * @return a string of the description
     */
    public String getDescription (){
        return Description;
    }


}
