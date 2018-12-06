
/**
 *@author Miguel Torres
 * CST 105 This is my own work
 */
public class NflManager {
   //create playerArray to hold a total of 10 NflPlayer classes

    private NflPlayer[] playerArray = new NflPlayer[10];

    private static int totalPlayers = 0;



    //constructor

    public NflManager() {

        //initializes the array of new NflPlayer objects with no arguments

        for (int i = 0; i < 5; i++) {

            createOffensivePlayer();

        }

        for (int i = 0; i < 5; i++) {

            createDefensivePlayers();

        }

    }



    //Create one instance of an offensive player at the end of the array, playerArray

    private void createOffensivePlayer() {

        if (totalPlayers == playerArray.length) {

            System.out.println("Cannot create any more players under this manager.");

            return;

        }

        playerArray[totalPlayers] = new OffensivePlayer();

        totalPlayers++;

    }



    //Create one instance of an defensive player at the end of the array, playerArray

    private void createDefensivePlayers() {

        if (totalPlayers == playerArray.length) {

            System.out.println("Cannot create any more players under this manager.");

            return;

        }

        playerArray[totalPlayers] = new DefensivePlayer();

        totalPlayers++;

    }



    //Returns a String of information of the NflPlayer located at playerArray[index]

    public String playerInfo(int index) {

        if (index >= playerArray.length) {

            return "Index out of range. Please enter an number between 0 and "

                    + (playerArray.length - 1);

        } else {

            return playerArray[index].toString();

        }

    }

}