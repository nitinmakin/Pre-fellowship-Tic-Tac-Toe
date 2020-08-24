import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe extends CheckWin
{


	Random random=new Random();
	Scanner scanner=new Scanner(System.in);
	String arr[][]=new String[3][3];

	public  void tossForChance()//TOSS
	{
		int result=random.nextInt(1);
		if(result == 0)

			System.out.println("PLAYER HAS WON THE TOSS ");

		else
			System.out.println("COMPUTER HAS WON THE TOSS");
	}


	public  void choiceForSymbol()//COICE FOR X OR O
	{
		System.out.println("PRESS 1 FOR X AND PRESS 2 FOR O");
		int mark=scanner.nextInt();
		if(mark == 1) 
		{
			System.out.println("YOU HAVE CHOSEN X");
		}
		else
		{
			System.out.println("you have choosen O");	
		}
	}

	public  String[][] resetBoard()//FOR RESETING THE BOARD
	{
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr.length; j++)
			{
				arr[i][j]=" ";
			}	
		}
		System.out.println("BOARD IS REFRESHED");
		return arr;
	}

	public  void displayRefreshedBoard()// DISPLAYING THE RESET BOARD
	{
		String arr[][]=resetBoard();
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
				System.out.println("-----------");
		}
	}
	public  void PlayGame()
	{
		int win = 0;
		int alternate = 0;// for alternative playing(even for player odd for computer)
		String playerMove="x";
		String computerMove="O";
		while( win != 1)// for checking win condition 
		{
			if(alternate%2 == 0)
			{
				alternate++;
				System.out.println("ENTER POSITION TO PLACE MARK");
				int temp = 0;//for entering invalid position temp will be 0.
				while(temp != 1)
				{
					System.out.println("ENTER ROW NO");
					int row=scanner.nextInt();
					System.out.println("ENTER COLOUM NO");
					int coloum=scanner.nextInt();
					for (int i = 0; i < arr.length; i++)
					{
						for (int j = 0; j < arr.length; j++) 
						{
							if(arr[row-1][coloum-1].equals(" "))
							{
								arr[row-1][coloum-1] =  playerMove;
								temp = 1;
								System.out.println("YOU HAVE PLACED YOUR SYMBOL ON ROW-"+row+" AND COLOUM-"+coloum);
								win = playerWin(arr);
								break;
							}
							else 
							{
								System.out.println("ENTER VALID NUMBER");
								break;
							}
						}	

						break;
					}
				}//while loop end(for repeting dublicate temp is 1 now)

			}// if loop ending(alternate$2)

			else// computer is playing
			{

				alternate++;
				int temp = 0;// for entering invalid position temp will be 0.
				while(temp != 1)
				{
					if( arr[0][0].equals(" "))//for position 1(frist corner)
					{
						arr[0][0] = "O";
						temp = 1;
						System.out.println("COMPUTER HAS PLACED SYMBOL ON ROW 1 COLOUM 1");
						win = computerWin(arr);
					}
					else if( arr[0][2].equals(" "))//for position 3(second corner)
					{
						arr[0][2] = "O";
						temp = 1;
						System.out.println("COMPUTER HAS PLACED SYMBOL ON ROW 1 COLOUM 3");
						win = computerWin(arr);
					}

					else if( arr[2][0].equals(" "))//for position 7(thired corner)
					{
						arr[2][0] = "O";
						temp = 1;
						System.out.println("COMPUTER HAS PLACED SYMBOL ON ROW 3 COLOUM 1");
						win = computerWin(arr);
					}

					else if( arr[2][2].equals(" "))//for position 9(fourth corner)
					{
						arr[2][2] = "O";
						temp = 1;
						System.out.println("COMPUTER HAS PLACED SYMBOL ON ROW 3 COLOUM 3");
						win = computerWin(arr);
					}

					else if(arr[1][1].equals(" "))//for position 5(mark on middle)
					{
						arr[1][1] = "O";
						temp = 1;
						System.out.println("COMPUTER HAS PLACED SYMBOL ON ROW 2 COLOUM 2");
						win = computerWin(arr);
					}

					else if( arr[0][1].equals(" "))//for position 2
					{
						arr[0][1] = "O";
						temp = 1;
						System.out.println("COMPUTER HAS PLACED SYMBOL ON ROW 1 COLOUM 2");
						win = computerWin(arr);
					}

					else if(arr[1][0].equals(" "))//for position 4
					{
						arr[1][0] = "O";
						temp = 1;
						System.out.println("COMPUTER HAS PLACED SYMBOL ON ROW 2 COLOUM 1");
						win = computerWin(arr);
					}

					else if( arr[1][2].equals(" "))//for position 6
					{
						arr[1][2] = "O";
						temp = 1;
						System.out.println("COMPUTER HAS PLACED SYMBOL ON ROW 2 COLOUM 3");
						win = computerWin(arr);
					}

					else if(arr[2][1].equals(" "))//for position 8
					{
						arr[2][1] = "O";
						temp = 1;
						System.out.println("COMPUTER HAS PLACED SYMBOL ON ROW 3 COLOUM 2");
						win = computerWin(arr);
					}
				}
			}// else ending(alternate%2)
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
					System.out.println("----------");
			}

		}//Main while loop ending (win!=1)
	}//playGame() End


	public static void main(String[] args)
	{
		TicTacToe tictactoe = new TicTacToe();
		tictactoe.tossForChance();
		tictactoe.choiceForSymbol();
		tictactoe.displayRefreshedBoard();
		tictactoe.PlayGame();
	}

}

