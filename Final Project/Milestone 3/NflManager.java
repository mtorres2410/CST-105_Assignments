
/**
 *@author MiguelVR
 * CST 105 This is my own work
 */
public class NflManager {
    //create arrayList to hold a total of 6 NflPlayer classes

    private NflPlayer[] arrayList = new NflPlayer[5];

    //constructor
    public NflManager() {

        //initializes the array of new NflPlayer objects with no arguments
        createPlayers(arrayList.length);

    }

    //creates 'quantity' amount of players to the array arrayList
    private void createPlayers(int quantity) {

        for (int i = 0; i < quantity; i++) {

            arrayList[i] = new NflPlayer();

        }

    }

    //prints the information of the NflPlayer located at arrayList[index]
    public void displayPlayerInfo(int index) {

        if (index >= arrayList.length) {

            System.out.println("Index out of range. Please enter an number between 0 and "
                    + (arrayList.length - 1));

        } else {

            System.out.println("Name: " + arrayList[index].getName() + " College: "
                    + arrayList[index].getCollege());

            System.out.println(arrayList[index].getIsDrafted() + " " + arrayList[index].getPosition());

            System.out.println(arrayList[index].getHieght() + " inches, " + arrayList[index].getWieght()
                    + " lbs");

            System.out.println("Date aquired: " + arrayList[index].getYearAquired());

        }

    }

    //overloaded to display all players under this NflManager class
    public void displayPlayerInfo() {

        for (int index = 0; index < arrayList.length; index++) {

            System.out.println("Name: " + arrayList[index].getName() + " College: "
                    + arrayList[index].getCollege());

            System.out.println(arrayList[index].getIsDrafted() + " "
                    + arrayList[index].getPosition());

            System.out.println(arrayList[index].getHieght() + " inches, "
                    + arrayList[index].getWieght() + " lbs");

            System.out.println("Date aquired: " + arrayList[index].getYearAquired() + "\n");

        }

    }

    //returns a String contaning the stats of NflPlayer at arrayList[index]
    public String getPlayerStats(int index) {

        return Integer.toString(arrayList[index].getPassingYards()) + " "
                + Integer.toString(arrayList[index].getTackles()) + " "
                + Integer.toString(arrayList[index].getRushingYards()) + " "
                + Integer.toString(arrayList[index].getSacks()) + " "
                + Integer.toString(arrayList[index].getRecievingYards()) + " "
                + Integer.toString(arrayList[index].getInterceptions());

    }

    public static void driver() {

        NflManager manager = new NflManager();

        //displays the information of the NflPlayers that belong to manager
        manager.displayPlayerInfo();

        //displays all stats of the players under manager
        for (int index = 0; index < manager.arrayList.length; index++) {

            System.out.println(manager.arrayList[index].getName() + "'s individual event stats: "
                    + manager.getPlayerStats(index));

        }

    }
}
