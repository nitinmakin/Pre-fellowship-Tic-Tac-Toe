public class CheckWin
{
	public  int playerWin(String arr[][])
	{
		int win = 0;
		for (int i = 0; i < arr.length; i++)// for checking rows
		{
			for (int j = 0; j < arr.length-2; j++)
			{
				if(arr[i][j] == arr[i][j+1] && arr[i][j+1] == arr[i][j+2] && arr[i][j+2] != " ")
				{
					System.out.println("YOU HAVE WON THE GAME");
					win = 1;
					return win;
				}
			}
		}	
		for (int i = 0; i < arr.length-2; i++)// for checking coloum
		{
			for (int j = 0; j < arr.length; j++)
			{
				if(arr[i][j] == arr[i+1][j] && arr[i+1][j] == arr[i+2][j] && arr[i+2][j] != " ")
				{
					System.out.println("YOU HAVE WON THE GAME");
					win = 1;
					return win;
				}
			}
		}

		if(arr[0][0] == arr [1][1]  && arr[1][1] == arr[2][2] && arr[2][2] != " ")//FOR 1=5=9=X(diagnal)
		{
			System.out.println("YOU HAVE WON THE GAME");
			win = 1;
			return win;
		}
		if(arr[2][0] ==  arr[1][1] && arr[0][2] == arr[1][1] && arr[1][1] != " ")//FOR 7=5=3=X(diagnal)
		{
			System.out.println("YOU HAVE WON THE GAME");
			win = 1;
			return win;
		}
		if(arr[0][0] != " " && arr[0][1] != " " && arr[0][2] != " "
				&& arr[1][0] != " " && arr[1][1] != " "&& arr[1][2]
						!= " " && arr[2][0] != " "&& arr[2][1] != " " && arr[2][2] != " ")// for draw
		{
			System.out.println("MATCH IS DROWN ");
			win = 1;
			return win;
		}
		return 0;
	}

	//COMPUTER WINNING STATUS
	public  int computerWin(String arr[][])
	{
		int win = 0;
		for (int i = 0; i < arr.length; i++)// for checking rows
		{
			for (int j = 0; j < arr.length-2; j++)
			{
				if(arr[i][j] == arr[i][j+1] && arr[i][j+1] == arr[i][j+2] && arr[i][j+2] != " ")
				{
					System.out.println("COMPUTER HAS WON THE GAME");
					System.out.println("BETTER LUCH NEXT TIME");
					win = 1;
					return win;
				}

			}
		}	
		for (int i = 0; i < arr.length-2; i++)// for checking coloums
		{
			for (int j = 0; j < arr.length; j++)
			{
				if(arr[i][j] == arr[i+1][j] && arr[i+1][j] == arr[i+2][j] && arr[i+2][j] != " ")
				{
					System.out.println("COMPUTER HAS WON THE GAME");
					System.out.println("BETTER LUCH NEXT TIME");
					win = 1;
					return win;
				}
			}
		}

		if(arr[0][0] == arr [1][1]  && arr[1][1] == arr[2][2] && arr[2][2] != " ")//FOR 1=5=9=X(diagnal)
		{
			System.out.println("COMPUTER HAS WON THE GAME");
			System.out.println("BETTER LUCK NEXT TIME");
			win = 1;
			return win;
		}
		if(arr[2][0] ==  arr[1][1] && arr[0][2] == arr[1][1] && arr[1][1] != " ")//FOR 7=5=3=X(diagnal)
		{
			System.out.println("COMPUTER HAS WON THE GAME");
			System.out.println("BETTER LUCH NEXT TIME");
			win = 1;
			return win;
		}
		if(arr[0][0] != " " && arr[0][1] != " " && arr[0][2] != " "
				&& arr[1][0] != " " && arr[1][1] != " "&& arr[1][2]
						!= " " && arr[2][0] != " "&& arr[2][1] != " " && arr[2][2] != " ")// for draw
		{
			System.out.println("MATCH IS DROWN ");
			win = 1;
			return win;
		}
		return 0;
	}

}



