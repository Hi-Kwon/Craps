import java.util.Scanner;

public class CrapsGame
	{
static int dice1;
static int dice2;
		public static void main(String[] args)
		{
			greeting();
			roll();
		}
		public static void greeting()
		{
			Scanner userStringInput = new Scanner(System.in);
			System.out.println("Welcome, what is your name?");
			String name = userStringInput.nextLine();
			System.out.println("Hello, " + name);
		}
		
		public static void roll()
		{
			int dice1 = (int) (Math.random() * 6) + 1;
			int dice2 = (int) (Math.random() * 6) + 1;
			int score = (dice1 + dice2);
			System.out.println("You rolled " + dice1 + " and " + dice2 + " for a total of " + score);
				{
					if (score == 7 || score == 11)
						{
							System.out.println("You win!");
						}
					else if (score == 2 || score == 12)
						{
							System.out.println("You lose!");
						}
					else if (score == 1 || score == 3 || score == 4 || score == 5 || score == 6 || score == 8 || score == 9 || score == 10)
						{
							System.out.println("Your point is " + score);
							boolean secondRoll = true;
							while (secondRoll)
								{
									int dice3 = (int) (Math.random() * 6) + 1;
									int dice4 = (int) (Math.random() * 6) + 1;
									int score2 = (dice3 + dice4);
									System.out.println("You rolled " + dice3 + " and " + dice4 + " for a total of " + score2);
										{
											if (score2 == score)
												{
													System.out.println("You win!");
													secondRoll = false;
												}
											else if (score2 == 7)
												{
													System.out.println("You lose!");
													secondRoll = false;
								
												}
										}
											
								}
						}
				}
		}
}

