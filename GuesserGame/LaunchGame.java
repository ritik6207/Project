package GuesserGame;
import java.util.*;
class Guesser
{
    int gusNum;
    int guessingNumber()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser! kindly guess the number");
        gusNum = sc.nextInt();
        return gusNum;
    }
}
class Players
{
    int gusNum;
    int guessingNumbering()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player! kindly guess the number");
        gusNum = sc.nextInt();
        return gusNum;
    }
}
class Umpire
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    void collectNumFromGuesser()
    {
        Guesser g = new Guesser();
        numFromGuesser = g.guessingNumber();
    }
    void collectNumFromPlayers()
    {
        Players p1 = new Players();
        numFromPlayer1 = p1.guessingNumbering();
        Players p2 = new Players();
        numFromPlayer2 = p2.guessingNumbering();
        Players p3 = new Players();
        numFromPlayer3 = p3.guessingNumbering();
    }
    void compare()
    {
        if(numFromGuesser == numFromPlayer1)
        {
            if(numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3)
            {
                System.out.println("All players are Winner");
            }
            else if (numFromGuesser == numFromPlayer2)
            {
                System.out.println("Only two Players are winner, player 1 and player 2");
            }
            else if (numFromGuesser == numFromPlayer3)
            {
                System.out.println("Only two Players are winner, player 1 and player 3");
            }
            else
            {
                System.out.println("Player 1 is Winner");
            }
        }
        else if (numFromGuesser == numFromPlayer2)
        {
            if(numFromGuesser == numFromPlayer3)
            {
                System.out.println("Only two players winner, player 2 and player 3");
            }
            else
            {
                System.out.println("Player 2 is winner");
            }
        }
        else if (numFromGuesser == numFromPlayer3)
        {
            System.out.println("Player 3 is winner");
        }
        else
        {
            System.out.println("No player wins");
        }
    }
}
public class LaunchGame {
    public static void main(String[] args) {
        System.out.println("Game started");
        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.compare();
    }
}
