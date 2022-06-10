import java.util.Scanner;

public class RockPaperScissorsLizardSpock {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please make our choice");
        System.out.println("Press 1 for \"rock\"");
        System.out.println("Press 2 for \"paper\"");
        System.out.println("Press 3 for \"scissors\"");
        System.out.println("Press 4 for \"lizard\"");
        System.out.println("Press 5 for \"spock\"");
        int playerChoice = Integer.parseInt(scanner.nextLine());


        String playersPlay = getPlayersPlay(playerChoice);

        String compPlay = getCompPlay();

        winConditions(playersPlay, compPlay);
    }

    private static String getPlayersPlay(int playerChoice) {
        String playersPlay = "";
        if (playerChoice == 1) {
            playersPlay = "rock";
        } else if (playerChoice == 2) {
            playersPlay = "paper";
        } else if (playerChoice == 3) {
            playersPlay = "scissors";
        } else if (playerChoice == 4) {
            playersPlay = "lizard";
        } else if (playerChoice == 5) {
            playersPlay = "spock";
        }
        return playersPlay;
    }

    private static String getCompPlay() {
        String compPlay = "";
        int min = 1;
        int max = 5;
        int randomNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
        switch (randomNumber) {
            case 1:
                compPlay = "rock";
                break;
            case 2:
                compPlay = "paper";
                break;
            case 3:
                compPlay = "scissors";
                break;
            case 4:
                compPlay = "lizard";
                break;
            case 5:
                compPlay = "spock";
                break;
        }
        return compPlay;
    }

    private static void winConditions(String playersPlay, String compPlay) {
        if (playersPlay.equals(compPlay)) {
            System.out.println("The game is a tie");
        } else if (playersPlay.equals("rock") && compPlay.equals("scissors")) {
            System.out.println("Players wins!");
        } else if (playersPlay.equals("rock") && compPlay.equals("lizard")) {
            System.out.println("Players wins!");
        } else if (playersPlay.equals("paper") && compPlay.equals("rock")) {
            System.out.println("Players wins!");
        } else if (playersPlay.equals("paper") && compPlay.equals("spock")) {
            System.out.println("Players wins!");
        } else if (playersPlay.equals("scissors") && compPlay.equals("lizard")) {
            System.out.println("Players wins!");
        } else if (playersPlay.equals("scissors") && compPlay.equals("paper")) {
            System.out.println("Players wins!");
        } else if (playersPlay.equals("lizard") && compPlay.equals("spock")) {
            System.out.println("Players wins!");
        } else if (playersPlay.equals("lizard") && compPlay.equals("paper")) {
            System.out.println("Players wins!");
        } else if (playersPlay.equals("spock") && compPlay.equals("rock")) {
            System.out.println("Players wins!");
        } else if (playersPlay.equals("spock") && compPlay.equals("scissors")) {
            System.out.println("Players wins!");
        } else{
            System.out.println("Computer wins!");
        }
    }
}
