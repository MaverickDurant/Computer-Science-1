import java.util.Scanner;

import java.util.Random;

public class RandomNumberGuesser 
{
	 public static void main(String[] args) 
	 {		
		 Scanner scan = new Scanner(System.in);
		 String responce = "y";
		 while(responce.equals("y"))
		 {
		 inputValidation();
		 System.out.println("Try again? (y or n)");
		 responce = scan.next();
		 }
	     
	 }
	 
	 public static void inputValidation()
	 {
		 
	     Scanner scan = new Scanner(System.in);
	     int highGuess = 100; 
	     int lowGuess = 1; 
	     int amountOfGuesses = 1;
	     Random randNum = new Random();
	     int nextGuess = randNum.nextInt(100) + 1;
	     
	     while(true)
	     {
	         {
	             System.out.printf("Enter your next guess between " + lowGuess + " and " + highGuess + ": ",  lowGuess, highGuess);
	             int guess = Integer.parseInt(scan.nextLine());

	             if((guess>nextGuess && guess<=100))
	             {
	                 System.out.println("Your guess is too high!");
	                 System.out.println("Number of guesses is " + amountOfGuesses);
	                 highGuess = guess;
	             }
	             else if(guess<nextGuess && guess>=1){
	                 System.out.println("Your guess is too low!");
	                 System.out.println("Number of guesses is " + amountOfGuesses);
	                 lowGuess = guess;
	             }
	             else if(guess == nextGuess)
	             {
	                 System.out.println("Congratulations, you guessed correctly");	                 
	                 break;
	            } 
	            amountOfGuesses++;   
	         }

	     }
	 }
}
