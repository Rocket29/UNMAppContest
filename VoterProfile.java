//TODO: Javadocs for this class and its methods


import java.util.Scanner;

public class VoterProfile {
    public String Name = "Unknown Voter";
    public int Age = 0;
    public String Address = "";

    Scanner scanIn = new Scanner(System.in);


    public VoterProfile(){
        System.out.println("What is your name?");
        Name = scanIn.nextLine();

        System.out.println("What is your age?");
        Age = scanIn.nextInt();

    }

    public void setName(){

        Name = scanIn.nextLine();
    }

    public void setAge(){

    }

    public String toString(){
        if(Age < 18){
            System.out.println("You are currently not ellidable to vote due to your age");
        } else {
            System.out.println("You are old enough to vote!");
        }
        return "Voter name is: " + Name + "\n" +
                "Voter age is: " + Age;
    }

    public static void main (String[] args){
        VoterProfile Ben = new VoterProfile();


        System.out.println(Ben.toString());

    }
}
