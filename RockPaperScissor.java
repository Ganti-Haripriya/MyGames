import java.util.Scanner;
import java.util.Random;
public class RockPaperScissor
{
    public static int rockpaperscissor(String player,String computer)
    {

        if(player.equals("R") && computer.equals("P") ) return 0;

        else if(player.equals("P")  && computer.equals("R") ) return 1;

        else if(player.equals("S")  && computer.equals("R") ) return 0;

        else if(player.equals("R")  && computer.equals("S") ) return 1;

        else if(player.equals("S") && computer.equals("P") ) return 1;

        else if(player.equals("P")  && computer.equals("S") ) return 0;

        return -1;

    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n,result,i;
        int nscore=0, cscore=0;

        String player="",computer="";

        System.out.println();
        System.out.println();
        System.out.println("                      WELCOME TO OUR GAME       ");
        System.out.println("               ----------------------------------");
        System.out.println();
        System.out.println("                 LETS PLAY ROCK PAPER SCISSOR ");
        System.out.println("             --------------------------------------");

        System.out.println("\n");
        System.out.println(" GAME RULES :");
        System.out.println("---------------");
        System.out.println("Enter R for ROCK");
        System.out.println("Enter P for PAPER");
        System.out.println("Enter S for SCISSORS");
        System.out.println();
        System.out.println("  LETS START THE GAME !!");
        System.out.println("-----------------------------");
        System.out.println();

        for ( i=1;i<=5;i++)
        {
            System.out.println("ENTER : R / P / S ");
            Random rand = new Random();
            n= rand.nextInt(99);

            if(n<33) computer="P";

            else if(n>33 && n<66) computer="S";

            else computer="R";

            player = sc.next();
            result = rockpaperscissor(player, computer);

            if (result == -1)
            {
                System.out.println("PLAYER CHOICE = "+player);
                System.out.println("COMPUTER CHOICE = "+computer);
                System.out.println();
                System.out.println("GAME DRAWN");

            }

            else if (result == 0)
            {
                System.out.println("PLAYER CHOICE = "+player);
                System.out.println("COMPUTER CHOICE = "+computer);
                System.out.println();
                System.out.println("COMPUTER WON");
                cscore+=1;

            }

            else
            {
                System.out.println("PLAYER CHOICE = "+player);
                System.out.println("COMPUTER CHOICE = "+computer);
                System.out.println();
                System.out.println("YOU WON");
                nscore+=1;

            }

            System.out.println();
            System.out.println("------------------------------------");
        }

        System.out.println(" FINAL  SCORE  OF  THE  GAME :");
        System.out.println("-----------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println(" TOTAL ROUNDS  |  PLAYER WON  |  COMPUTER WON  ");
        System.out.println("---------------|--------------|--------------------");

        System.out.println("  "+ (i-1)+"            |" +"   "+ nscore+ "          | " + "  "+cscore );
        System.out.println("               |              |                ");

        System.out.println();

        if(nscore>cscore)
            System.out.println("CONGRATULATIONS !! YOU ARE THE WINNER");
        else if(cscore>nscore)
            System.out.println("SORRY :(( COMPUTER WON THE GAME");
        else
            System.out.println("THE GAME IS TIED ");

    }
}