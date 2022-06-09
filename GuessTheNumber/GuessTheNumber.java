import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Please enter desired difficult level of the game.");
        System.out.println("hit \"1\" for easy.");
        System.out.println("Number between 1 and 10.");
        System.out.println("hit \"2\" for medium.");
        System.out.println("Number between 1 and 100.");
        System.out.println("hit \"3\" for hard.");
        System.out.println("Number between 1 and 1000.");
        System.out.println("Or press \"4\" for exit.");

        int min = 0;
        int randomNumber = 0;
        int playerGuess = 0;
        int tries=0;

        randomNumber = getRandomNumber(scanner, min, randomNumber);

        while (randomNumber!=playerGuess){
            System.out.println("Please enter your best guess:");
            playerGuess = Integer.parseInt(scanner.nextLine());
            tries++;
            if(randomNumber>playerGuess){
                System.out.println("Go higher!");
            } else if (randomNumber<playerGuess) {
                System.out.println("Go lower!");
            }else if (tries==1){
                System.out.println("WOW, you did it on the first try!");
            } else {
                System.out.printf("GREAT!!! You menage to guess the number in %d tries.",tries);
            }
        }
    }
    private static int getRandomNumber(Scanner scanner, int min, int randomNumber) {
        int playerChoice = Integer.parseInt(scanner.nextLine());

        switch (playerChoice){
            case 1:
                System.out.println("You are playing on easy.");
                int max = 10;
                randomNumber = (int)Math.floor(Math.random()*(max- min +1)+ min);
                break;
            case 2:
                System.out.println("You are playing on medium.");
                max = 100;
                randomNumber = (int)Math.floor(Math.random()*(max- min +1)+ min);
                break;
            case 3:
                System.out.println("You are playing on hard.");
                max = 1000;
                randomNumber = (int)Math.floor(Math.random()*(max- min +1)+ min);
                break;
            case 4:
                System.out.println("Sorry to see you go :(");
                break;
            default:
                System.out.println("That`s not a valid choice. Please select again");
                randomNumber = getRandomNumber(scanner, min, randomNumber);
                break;
        }
        return randomNumber;
    }
}
