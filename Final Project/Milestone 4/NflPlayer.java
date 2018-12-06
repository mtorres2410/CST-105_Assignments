
/**
 *@author Miguel Torres
 * CST 105 This is my own work
 */
import java.util.Calendar;

public class NflPlayer {

    //create a calendar object
    Calendar cal = Calendar.getInstance();

    private String college;

    private String name;

    private String position;

    private int yearAquired;

    private int passingYards;

    private int tackles;

    private int rushingYards;

    private int sacks;

    private int recievingYards;

    private int interceptions;

    private boolean isDrafted;

    private double height;

    private double weight;

    private int currentYear = cal.get(Calendar.YEAR);

    //Constructor with arguments
    public NflPlayer(String newCollege, String newName, String newPosition, int newYearAquired,
            boolean newIsDrafted, double newHeight, double newWeight) {

        this.college = newCollege;

        this.name = newName;

        this.position = newPosition;

        this.yearAquired = newYearAquired;

        this.isDrafted = newIsDrafted;

        this.height = newHeight;

        this.weight = newWeight;

        this.passingYards = 0;

        this.tackles = 0;

        this.rushingYards = 0;

        this.sacks = 0;

        this.recievingYards = 0;

        this.interceptions = 0;

    }

    //constructor without arguments
    public NflPlayer() {

        this.name = "Unkown";

        this.college = "Unknown";

        this.position = "Unknown";

        this.yearAquired = this.currentYear;

        this.isDrafted = false;

        this.height = 0;

        this.weight = 0;

        this.passingYards = 0;

        this.tackles = 0;

        this.rushingYards = 0;

        this.sacks = 0;

        this.recievingYards = 0;

        this.interceptions = 0;

    }

    //begin setter methods
    public void setPassingYards(int newPassingYards) {

        this.passingYards = newPassingYards;

    }

    public void setTackles(int newTackles) {

        this.tackles = newTackles;

    }

    public void setRushingYars(int newRushingYards) {

        this.rushingYards = newRushingYards;

    }

    public void setSacks(int newSacks) {

        this.sacks = newSacks;

    }

    public void setRecievingYards(int newRecievingYards) {

        this.recievingYards = newRecievingYards;

    }

    public void setInterceptions(int newInterceptions) {

        this.interceptions = newInterceptions;

    }

    public void setName(String newName) {

        name = newName;

    }

    public void setCollege(String newCollege) {

        this.college = newCollege;

    }

    public void setPosition(String newPosition) {

        this.position = newPosition;

    }

    public void setYearAquired(int newYearAquired) {

        this.yearAquired = newYearAquired;

    }

    public void toggleIsDrafted() {

        this.isDrafted = (this.isDrafted) ? false : true;

    }

    public void setHeight(double newHeight) {

        this.height = newHeight;

    }

    public void setWeight(double newWeight) {

        this.weight = newWeight;

    }

    //begin getter methods
    public double getHieght() {

        return this.height;

    }

    public double getWieght() {

        return this.weight;

    }

    public boolean getIsDrafted() {

        return this.isDrafted;

    }

    public String getPosition() {

        return this.position;

    }

    public String getName() {

        return this.name;

    }

    public String getCollege() {

        return this.college;

    }

    public int getYearAquired() {

        return this.yearAquired;

    }

    public int getPassingYards() {

        return this.passingYards;

    }

    public int getTackles() {

        return this.tackles;

    }

    public int getRushingYards() {

        return this.rushingYards;

    }

    public int getSacks() {

        return this.sacks;

    }

    public int getRecievingYards() {

        return this.recievingYards;

    }

    public int getInterceptions() {

        return this.interceptions;

    }

    //sum all stats
    public int getStatsTotal() {

        return this.passingYards + this.tackles + this.rushingYards + this.sacks
                + this.recievingYards + this.interceptions;

    }

    //returns all stats to a string seperated by a " "
    public String statsToString() {

        return Integer.toString(this.passingYards) + " "
                + Integer.toString(this.tackles) + " " + Integer.toString(this.rushingYards) + " "
                + Integer.toString(this.sacks) + " " + Integer.toString(this.recievingYards) + " "
                + Integer.toString(this.interceptions);

    }

    public static void driver() {

        //Testing the no-arg constructor:
        NflPlayer player1 = new NflPlayer();

        System.out.println("Default values for the NflPlayer class with no arguments:");

        System.out.println("Name: " + player1.getName() + " College: " + player1.getCollege());

        System.out.println(player1.getIsDrafted() + " " + player1.getPosition());

        System.out.println(player1.getHieght() + " inches, " + player1.getWieght() + " lbs");

        System.out.println("Date aquired: " + player1.getYearAquired());

        //Testing setter methods:
        player1.setName("Larry Bernard");

        player1.setCollege("Harvard");

        player1.setPosition("Runningback");

        player1.toggleIsDrafted();

        player1.setHeight(76.5);

        player1.setWeight(232.8);

        player1.setYearAquired(2016);

        //Display changes after using the setter methods:
        System.out.println("\nAfter setter test:");

        System.out.println("Name: " + player1.getName() + " College: " + player1.getCollege());

        System.out.println(player1.getIsDrafted() + " " + player1.getPosition());

        System.out.println(player1.getHieght() + " inches, " + player1.getWieght() + " lbs");

        System.out.println("Date aquired: " + player1.getYearAquired() + "\n");

        //Testing the constructor with args:
        NflPlayer player2 = new NflPlayer("Berkley", "Jimmy Dean", "Quarterback",
                2010, true, 54.8, 186);

        System.out.println("\nValues of player2 using constructor with arguments:");

        System.out.println("Name: " + player2.getName() + " College: " + player2.getCollege());

        System.out.println(player2.getIsDrafted() + ", " + player2.getPosition());

        System.out.println(player2.getHieght() + " inches, " + player2.getWieght() + " lbs");

        System.out.println("Date aquired: " + player2.getYearAquired() + "\n");

        System.out.println(player1.getName() + "'s total stats: " + player1.getStatsTotal());

        System.out.println(player1.getName() + "'s individual event stats: "
                + player1.statsToString() + "\n");

    }
}
