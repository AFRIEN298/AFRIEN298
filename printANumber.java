package knightingale;

import java.util.Scanner;
public class printANumber {

	public static void main(String[] args) {
		// creates a reader instance which takes
		//input from standard input - keyboard
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		// nextInt () reads the next integer from the keyboard
		
		int number = reader .nextInt();
		
		// print1n() prints the following line to the output screen
		
		System.out.println("You entered:"  +  number);
		
		
	 

	}

}
