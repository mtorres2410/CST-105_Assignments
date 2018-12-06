/**
 *
 * @author MiguelVR
 */


public class OffensivePlayer extends NflPlayer {
 //Offensive player stats

    private int rushingYards;

    private int passingYards;

    private int recievingYards;

    private int touchdowns;

    
    //constructor for implementation with arguments.

    public OffensivePlayer(String name, String college, String position, int yearAquired,

            double height, double weight) {

        this.setName(name);

        this.setCollege(college);

        this.setPosition(position);

        this.setYearAquired(yearAquired);

        this.setHeight(height);

        this.setWeight(weight);

        this.passingYards = 0;

        this.recievingYards = 0;

        this.rushingYards = 0;

        this.touchdowns = 0;

    }

    
    //Constructor for no arguments. Set name to 'Offensive Player' for differentiation

    public OffensivePlayer() {

        this.setName("Offensive Player");

        this.passingYards = 0;

        this.recievingYards = 0;

        this.rushingYards = 0;

        this.touchdowns = 0;

    }

  

    public void setRushingYards(int rushingYards) {

        this.rushingYards = rushingYards;

    }

    

    public void setPassingYards(int passingYards) {

        this.passingYards = passingYards;

    }

    

    public void setRecievingYards(int recievingYards) {

        this.recievingYards = recievingYards;

    }

    

    public void setTouchdowns(int touchdowns) {

        this.touchdowns = touchdowns;

    }

  

    public int getRushingYards() {

        return this.rushingYards;

    }



    public int getPassingYards() {

        return this.passingYards;

    }

    

    public int getRecievingYards() {

        return this.recievingYards;

    }



    public int getTouchdowns() {

        return this.touchdowns;

    }



    public int getStatsTotal() {

        return this.passingYards + this.rushingYards + this.recievingYards + this.touchdowns;

    }

    

    //Override toString to return all information on a player.

    @Override

    public String toString() {

        return this.getName() + " " + this.getPosition() + " " + this.getCollege() + " " 

                + this.getHieght() + " " + this.getWieght() + " " + this.getYearAquired() 

                + " " + Integer.toString(this.passingYards) + " " 

                + Integer.toString(this.rushingYards) + " " + Integer.toString(this.recievingYards)

                + " " + Integer.toString(this.touchdowns);

    }

}