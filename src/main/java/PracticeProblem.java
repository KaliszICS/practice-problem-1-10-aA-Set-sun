/**
 * Lesson: String Manipulation
 * Author: Angie
 * Date Created: Feb 26, 2026
 * Date Last Modified: Feb 26, 2026
 */

import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
	}

	public static void q1() {
		//Write question 1 code here
		/* Ask the user to "Input a sentence: ". 
		If the setence includes the word "on", output true (Even if the "on" is inside another word such as "pond"). 
		Otherwise output false. */

	Scanner input = new Scanner(System.in);
	
	System.out.print("Input a sentence: ");
	String sentence = input.nextLine();

	System.out.println(sentence.contains("on"));


	}

	public static void q2() {
		//Write question 2 code here
		/* Ask the user to "Input the word mango: ". 
		Output true if they put any variation of the casing for mango. false otherwise. */

		Scanner input = new Scanner(System.in);

		System.out.print("Input the word mango: ");
		String mango = input.nextLine();

		System.out.println(mango.contains("mango") || mango.contains("Mango"));
		//come back

	}

	public static void q3() {
		//Write question 3 code here
		/* Ask the user to "Input a word: ". 
		Ask the user to "Input a letter: " 
		Output the first index and last index of the letter in the word on seperate lines. */

		Scanner input = new Scanner(System.in);
		
		System.out.print("Input a word: ");
		String word = input.nextLine();
		System.out.print("Input a letter: ");
		String letter = input.nextLine();

		//hello
		//12345
		//01234
		//last index is one less than the length of string

		int length = word.length();

		System.out.println(word.substring(0, 1));

		//come back again!!

	}

	public static void q4() {
		//Write question 4 code here
		/* Ask the user to "Input a sentence: ". 
		Output "Your sentence is length characters long", 
		where length is the amount of characters in their sentence. */

		Scanner input = new Scanner(System.in);

		System.out.print("Input a sentence: ");
		String sentence = input.nextLine();

		
		System.out.println("Your sentence is " + " characters long");


	}

	public static void q5() {
		//Write question 5 code here
		/* Ask the user to "Input a sentence: " 
		Ask the user "Input a word to replace: ". 
		Ask the user "What word would you like to replace it with: ". 
		Replace all instances of the first word provided with the second word provided in the sentence. */
	
	}

	public static void q6() {
		//Write question 6 code here
		/* Ask the user to "Input a sentence: " 
		Output the sentence in all uppercase and all lowercase on seperate lines in that order. 
		Remove any extra spaces at the beginning or end. */


	}

	public static void q7() {
		//Write question 7 code here
		/* Ask the user to "Input a word: ". 
		Output the first four letters and last four letters of the word on seperate lines. */


	}

	public static void q8() {
		//Write question 8 code here
	}

}
