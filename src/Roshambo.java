import java.util.Scanner;

public class Roshambo {
    static void main() {
        //vars
        Scanner scan = new Scanner(System.in);
        String player1Choice;
        String player2Choice;
        String playAgain;
        boolean choice1Good = false;
        boolean choice2Good = false;

        //loop to keep the game going if the user chooses to play again
        do {
            //collect player 1 choice
            do {
                System.out.println("Player 1, pick your choice! R, P, or S.");
                player1Choice = scan.nextLine();
                if (player1Choice.equalsIgnoreCase("R") || player1Choice.equalsIgnoreCase("P") || player1Choice.equalsIgnoreCase("S")) {
                    choice1Good = true;
                }
                else {
                    System.out.println("You put in an incorrect value. Please try again!");
                }
            } while (!choice1Good);

            //collect player 2 choice
            do {
                System.out.println("Player 2, pick your choice! R, P, or S.");
                player2Choice = scan.nextLine();
                if (player2Choice.equalsIgnoreCase("R") || player2Choice.equalsIgnoreCase("P") || player2Choice.equalsIgnoreCase("S")) {
                    choice2Good = true;
                }
                else {
                    System.out.println("You put in an incorrect value. Please try again!");
                }
            } while (!choice2Good);

            //calculate outcome
            if (player1Choice.equalsIgnoreCase(player2Choice)) { //if the choices are the same, tie
                System.out.println("Rock, paper, and scissors can't hurt themselves. It's a tie!");
            }
            else if (player1Choice.equalsIgnoreCase("R")) {
                if (player2Choice.equalsIgnoreCase("S")) {
                    System.out.println("Rock crushes scissors. Player 1 wins!");
                }
                else {
                    System.out.println("Paper covers rock. Player 2 wins!");
                }
            }
            else if (player1Choice.equalsIgnoreCase("P")) {
                if (player2Choice.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers rock. Player 1 wins!");
                }
                else {
                    System.out.println("Scissors cut paper. Player 2 wins!");
                }
            }
            else { //if player 1 picked scissors
                if (player2Choice.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cute paper. Player 1 wins!");
                }
                else {
                    System.out.println("Rock crushes scissors. Player 2 wins!");
                }
            }
            //asks if they want to play again and ensures the input is Y or N
            do {
                System.out.println("Do you want to play again? Y for yes, N for no.");
                playAgain = scan.nextLine();
            } while (!playAgain.equalsIgnoreCase("Y") && (!playAgain.equalsIgnoreCase("N")));

        } while (playAgain.equalsIgnoreCase("Y")); //if they put Y this evaluates to true and we start over
        System.out.println("Goodbye!"); //if they put N this runs and the program ends
    }
}
