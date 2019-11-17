import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Author: Benjamin Bock
 * Date: 11/8/2019
 *This program is the user input and output of the Application
 */


//TODO: Write user input flow to allow for more info
//TODO: think about better ways to figure out if an address is in a district
//TODO: think about how to do menus
//TODO: CLEAN UP CODE
public class UserInputAndOutput {

    /*
    The district arrays, commented out because the constructors cannot handle passing in an array...yet
    public static String[] districtOneAddresses = new String[10];
    public static String[] districtTwoAddresses = new String[10];
    public static String[] districtThreeAddresses = new String[50];
    public static String[] districtFourAddresses = new String[10];
    public static String[] districtFiveAddresses = new String[10];
     */


    public static String userInput = "";


    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);

        SchoolDistrict[] schoolDistricts = new SchoolDistrict[5];
        for (int i = 0; i < schoolDistricts.length; i++) {
            schoolDistricts[i] = new SchoolDistrict();
        }
        VotingDistrict District1 = new VotingDistrict("District 1");
        VotingDistrict District2 = new VotingDistrict("District 2");
        VotingDistrict District3 = new VotingDistrict("District 3");
        VotingDistrict District4 = new VotingDistrict("District 4");
        VotingDistrict District5 = new VotingDistrict("District 5");

        VotingDistrict[] votingDistricts = new VotingDistrict[5];
        //districtThreeAddresses[5] = "Albuquerque, NM 87131";
        votingDistricts[0] = District1;
        votingDistricts[1] = District2;
        votingDistricts[2] = District3;
        votingDistricts[3] = District4;
        votingDistricts[4] = District5;

        //District 3 addresses
        District3.addAddressAt("Albuquerque, NM 87131", 1);
        schoolDistricts[0] = new SchoolDistrict("Unknown ABQ District");



        //take user input in
        System.out.println("Supported school districts: ");
        Util.printArray(schoolDistricts);
        System.out.println("Supported voting districts: ");
        Util.printArray(votingDistricts);

        System.out.println("Supported addresses:  ");
        System.out.println("District 3:");
        District3.toStringWAddresses();


        System.out.println("What is your address?");
        String address = scanIn.nextLine();//userInput; //comment back in the next line for terminal input
        // it was commented out for GUI testing
        //
        //TODO:  ADD MORE ERROR HANDLING FOR USER INPUT
        address = address.trim();
        //check that user input against a series of arrays that hold different values
        for (int i = 0; i <= votingDistricts.length; i++) {
            //return voting district
            if (votingDistricts[i].isAddressIn(address)) {
                System.out.println("Your voting district is: " + votingDistricts[i].toString());
                break;
            }
        }
        //return school district
        //TODO: fix so that if the address is not in a district, or the district is not populated with values, it will skip over it
        for (int i = 0; i <= schoolDistricts.length; i++) {
            if (schoolDistricts[i].isAddressIn(address)) {
                System.out.println("Your school district is: " + schoolDistricts[i].toString());
                System.out.println();

                break;
            }
            System.out.println("Your school district is not: " + schoolDistricts[i].toString());
        }

    }
}

