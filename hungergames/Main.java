package hungergames;

public class Main {
    public static void main(String[] args) {
        int callStatus;
        ArenaController arenaController = new ArenaController();
        callStatus = arenaController.createContestant(24);
        if (callStatus == 1) {
            arenaController.displayContestants();
            arenaController.startHungerGames();
        }
    }
}
