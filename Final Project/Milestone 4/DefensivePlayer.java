
/**
 *@author Miguel Torres
 * CST 105 This is my own work
 */

public class DefensivePlayer extends NflPlayer {
    //Defensive player stats

    private int tackles;

    private int sacks;

    private int interceptions;

    private int fumblesForced;

    //constructor for implementation with arguments.
    public DefensivePlayer(String name, String college, String position, int yearAquired,
            double height, double weight) {

        this.setName(name);

        this.setCollege(college);

        this.setPosition(position);

        this.setYearAquired(yearAquired);

        this.setHeight(height);

        this.setWeight(weight);

        this.tackles = 0;

        this.sacks = 0;

        this.interceptions = 0;

        this.fumblesForced = 0;

    }

    //Constructor for no arguments. Set name to 'Offensive Player' for differentiation
    public DefensivePlayer() {

        this.setName("Defensive Player");

        this.tackles = 0;

        this.sacks = 0;

        this.interceptions = 0;

        this.fumblesForced = 0;

    }

    public void setTackles(int tackles) {

        this.tackles = tackles;

    }

    public void setSacks(int sacks) {

        this.sacks = sacks;

    }

    public void setInterceptions(int interceptions) {

        this.interceptions = interceptions;

    }

    public void setFumblesForced(int fumblesForced) {

        this.fumblesForced = fumblesForced;

    }

    public int getTackles() {

        return this.tackles;

    }

    public int getSacks() {

        return this.sacks;

    }

    public int getInterceptions() {

        return this.interceptions;

    }

    public int getFumblesForced() {

        return this.fumblesForced;

    }

    //Override toString to return all information on a player.
    @Override

    public String toString() {

        return this.getName() + " " + this.getPosition() + " " + this.getCollege() + " "
                + this.getHieght() + " " + this.getWieght() + " " + this.getYearAquired()
                + " " + Integer.toString(this.tackles) + " "
                + Integer.toString(this.sacks) + " " + Integer.toString(this.interceptions)
                + " " + Integer.toString(this.fumblesForced);

    }

}
