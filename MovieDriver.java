/*
 * Author: Jonathan Yang
 * This Program is the main class for Movie. This program allows the user to input movies into the database
 */

import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		//
		Scanner in = new Scanner(System.in);
		Movie m1 = new Movie();
		
		//sentinel Values to exit loop
		int sentinelValue = 1;
		int errorSentinel = -1;
		
		//Loop. 
		do
		{
			//User enters input here
			System.out.print("Enter a movie: ");
			m1.setTitle(in.nextLine());
			System.out.print("Enter rating for the movie: ");
			m1.setRating(in.nextLine());
			System.out.print("Enter amount of tickets are sold: ");
			m1.setSoldTickets(in.nextInt());
			in.nextLine();
			System.out.println(m1);
			
			
			//Checks for Errors for user Input
			errorSentinel = -1;
			do {
				String answer;
				
				System.out.print("\nDo you want to enter another movie(Type y or n): ");
				answer = in.nextLine();
				System.out.println("\n");
				
				if(answer.toLowerCase().equals("y") || answer.toLowerCase().equals("yes") )
				{
					errorSentinel = 1;
					sentinelValue = -1;
				}
				else if(answer.toLowerCase().equals("n") || answer.toLowerCase().equals("no"))
				{
					errorSentinel = 1;
					sentinelValue = 1;
				}
				else
				{
					errorSentinel = -1;
					System.out.println("ERROR! INPUT NOT ACCEPTED!");
				}
					
			}while(errorSentinel != 1);
		}while(sentinelValue != 1);
		
		//ends program
		System.out.println("Goodbye.\nAuthor: Jonathan Yang.");
		in.close();
	}

}
