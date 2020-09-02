package hungergames;
import java.util.Random;

public class Contestant {
    private String Contestant;
    private char gender;
    private int attackLevel;
    private int defenseLevel;
    private int healthLevel;

    // Empty constructor
    public Contestant() {
    }

    //Contructor
    public Contestant(String Contestant,char gender) {
        this.Contestant = Contestant;
        this.gender = gender;
        this.attackLevel = (int)(Math.random()*((10-1)+1))+1;
        this.defenseLevel = (int)(Math.random()*((10-1)+1))+1;
        this.healthLevel = 10;
    }

    //Getters and Setters
    public String getContestant() {
        return Contestant;
    }

    public int getAttackLevel() {
        return attackLevel;
    }

    public int getDefenseLevel() {
        return defenseLevel;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        if(healthLevel < 0)
            this.healthLevel = 0;
        else
            this.healthLevel = healthLevel;
    }

    public char getGender() {
        if(gender == 'M'){
            System.out.print("Male");
        }
        else {
            System.out.print("Female");
        }
        return gender;
    }
}
