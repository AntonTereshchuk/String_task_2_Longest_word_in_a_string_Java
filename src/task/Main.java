package task;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String enteredString;
		String longestWord = "";
		String comment = "Longest word in the string: ";
		
		System.out.println("Please enter a string with spaces: ");
		enteredString = sc.nextLine();
		
		String[] wordsArray = enteredString.split(" ");
		
		for (int i = 0; i < wordsArray.length; i++) {
		
			if (longestWord.length() < wordsArray[i].length()) {
				longestWord = wordsArray[i];
			} else if (longestWord.length() == wordsArray[i].length()) {
				comment = "One of the longest words in the string: ";
			}
			
		}
			
		System.out.println();
		System.out.println(comment + longestWord);
		sc.close();

	}

}
