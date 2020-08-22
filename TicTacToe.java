import java.util.Scanner;
import java.util.Random;
public class TicTacToe
{

        static Random random=new Random();
        static Scanner scanner=new Scanner(System.in);
	public static void resettingBoard()
	{
		int arr[][]=new int[3][3];
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr.length; j++)
			{
				System.out.print(arr[i][j]);
				if(j == 0 || j == 1)
					System.out.print(" | ");
			}	
			System.out.println();
			if(i == 0 || i == 1)
				System.out.println("---------");
		}
	}
/*
           public static void tossForTurnAndChoose()
	{
		int turn = random.nextInt(2);
		if(turn == 0)
		{
			System.out.println("Player won the toss");
                        System.out.println("choose what you want to take O or X");
                        String option=scanner.next();
                         if(option.equalsIgnoreCase("x"))
                          System.out.println("you have choose X");
                         else
                          System.out.println("you have choose O");

		}
		else
		{
			System.out.println("Computer won the toss");
                        System.out.println("Computer choose O");
		}
	}*/
             public static void main(String[] args)
	     {
                System.out.println("your board is ready where you want to place mark");
		resettingBoard();
	     }
}

