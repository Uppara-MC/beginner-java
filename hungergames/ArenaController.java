package hungergames;
import java.util.Random;

public class ArenaController {
    /*Public Methods
      int createContestant(int) - To create total contestants
      void startHungerGames() - To start the HungerGames
      void displayContestants() - To display the contestants details
     */
    Contestant[] contestants = new Contestant[24];
    private int contestantAliveCount = 24;
    private int battleNumber =0;
    private boolean finalists = false;
    private int contestant1 = -1;
    private int contestant2 = -1;
    private boolean contestant1Ready;
    private boolean contestant2Ready;


    //Empty constructor
    public ArenaController() {

    }

    //Method to create 24 contestants (12 male and 12 female)
    public int createContestant(int Number){
        if(Number != 24){
            System.out.println("Invalid Total Number:" + Number + " Must be 24 Contestants");
            return 0;
        }
        for(int i =0 ; i < 24 ; i++){
            if(i < 12) {
                contestants[i] = new Contestant("Contestant" + String.valueOf(i + 1),'M');
            }
            else{
                contestants[i] = new Contestant("Contestant"+ String.valueOf(i+1), 'F');
            }
        }
        return 1;
    }

    // Method to display all the created male and female contestants
    public void displayContestants(){
        System.out.println("============================================================");
        System.out.println("                  All Contestants");
        System.out.println("============================================================");
        for(Contestant contestant: contestants){
            System.out.println("Name:"        + contestant.getContestant());
            System.out.print(" Gender:");
            contestant.getGender();
            System.out.print(" AttackLevel:"  + contestant.getAttackLevel());
            System.out.print(" DefenceLevel:" + contestant.getDefenseLevel());
            System.out.print(" HealthLevel:" + contestant.getHealthLevel());
            System.out.println();
        }
    }

    // Method to begin the hunger games
    public void startHungerGames() {
        //Choose finalists
        while(!finalists) {
            //Choose contestant 1
            contestant1Ready = false;
            while(!contestant1Ready){
                contestant1 = pickContestant();
                if(contestant1 == -1) {
                    contestant1Ready = false;
                }
                else {
                    contestant1Ready = true;
                }
            }

            //Choose contestant 2
            contestant2Ready = false;
            while(!contestant2Ready){
                contestant2 = pickContestant();
                if(contestant2 == -1) {
                    contestant2Ready = false;
                }
                else if(contestant2 == contestant1) {
                    contestant2Ready = false;
                }
                else {
                    contestant2Ready = true;
                }
                //System.out.println("loop2");
            }

            if((contestant1 != -1) && (contestant2 != -1)){
                battleNumber++;
                System.out.println();
                System.out.println("============================================================");
                System.out.println("               Battle #"+ battleNumber+ " Begins Between");
                System.out.println("============================================================");
                displayContestantDetails(contestant1);
                displayContestantDetails(contestant2);
                fight(contestant1,contestant2);
                System.out.println("contestantAliveCount::::::::::::" + contestantAliveCount);
                if(contestantAliveCount == 2){
                    finalists = true;
                }
            }
        };

        //Display Finalists
        System.out.println("============================================================");
        System.out.println("                        Final 2                             ");
        System.out.println("============================================================");
        contestant1Ready = false;
        contestant2Ready = false;
        for(int i = 0; i < 24; i++){
            if(contestants[i].getHealthLevel() != 0){
                displayContestantDetails(i);
                if(!contestant1Ready) {
                    contestant1Ready = true;
                    contestant1 = i;
                }
                else if(contestant1Ready){
                    contestant2Ready = true;
                    contestant2 = i;
                }
            }
        }

        //The Final Winner
        System.out.println("============================================================");
        System.out.println("              The Champion of Hunger Games                  ");
        System.out.println("============================================================");
        if(Math.round(Math.random()) == 0) {
            displayContestantDetails(contestant2);
            contestants[contestant1].setHealthLevel(0);
        }
        else{
            displayContestantDetails(contestant1);
            contestants[contestant2].setHealthLevel(0);
        }
    }

    //Method to choose the alive contestant randomly
    private int pickContestant() {
        Random random = new Random();
        int min = 0;
        int max = 24;
        int index = random.nextInt(max-min) + min;
        if(contestants[index].getHealthLevel() != 0) {
            return index;
        }
        else {
            return -1;
        }
    }

    //Method to determine the fight result between contestant1 and contestant2
    private void fight(int contestant1, int contestant2){
        int contestant1Points = 0;
        int contestant2Points = 0;

        // Check attacking skills
        if(contestants[contestant1].getAttackLevel() > contestants[contestant2].getAttackLevel()){
            contestant1Points ++;
        }
        else if(contestants[contestant1].getAttackLevel() < contestants[contestant2].getAttackLevel()){
            contestant2Points ++;
        }

        // Check defence skills
        if(contestants[contestant1].getDefenseLevel() > contestants[contestant2].getDefenseLevel()){
            contestant1Points ++;
        }
        else if(contestants[contestant1].getDefenseLevel() < contestants[contestant2].getDefenseLevel()){
            contestant2Points ++;
        }

        //Check health level
        if(contestants[contestant1].getHealthLevel() > contestants[contestant2].getHealthLevel()){
            contestant1Points ++;
        }
        else if(contestants[contestant1].getHealthLevel() < contestants[contestant2].getHealthLevel()){
            contestant2Points ++;
        }

        //Check total points scored
        System.out.println("============================================================");
        System.out.println("              The Winner of Battle #" + battleNumber + " is ");
        System.out.println("============================================================");
        if(contestant1Points > contestant2Points) {
            contestants[contestant2].setHealthLevel(0);
            contestants[contestant1].setHealthLevel(contestants[contestant1].getHealthLevel() - 1);
            displayContestantDetails(contestant1);
        }
        else if(contestant1Points < contestant2Points) {
            contestants[contestant1].setHealthLevel(0);
            contestants[contestant2].setHealthLevel(contestants[contestant2].getHealthLevel() - 1);
            displayContestantDetails(contestant2);
        }
        else {
            if (Math.round(Math.random()) == 0) {
                contestants[contestant2].setHealthLevel(0);
                contestants[contestant1].setHealthLevel(contestants[contestant1].getHealthLevel() - 1);
                displayContestantDetails(contestant1);
            }
            else {
                contestants[contestant1].setHealthLevel(0);
                contestants[contestant2].setHealthLevel(contestants[contestant2].getHealthLevel() - 1);
                displayContestantDetails(contestant2);
            }
        }
        contestantAliveCount--;
    }

    //Method to display contest details
    private void displayContestantDetails(int index){
        System.out.println("Name:" + contestants[index].getContestant());
        System.out.print(" Gender:");
        contestants[index].getGender();
        System.out.print(" AttackLevel:" + contestants[index].getAttackLevel());
        System.out.print(" DefenceLevel:" + contestants[index].getDefenseLevel());
        System.out.print(" HealthLevel: " + contestants[index].getHealthLevel());
        System.out.println();
    }
}
