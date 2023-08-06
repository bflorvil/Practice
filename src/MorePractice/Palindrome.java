package MorePractice;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		char[] reversed = new char[word.length()];
		for (int i = 0; i < word.length(); i++) {
			reversed[i] = word.charAt(word.length() -1 - i);

		}
		
		boolean isPalindrome = word.equals(String.valueOf(reversed));
		System.out.println(isPalindrome);
		scan.close();
		

	}
	
	

}
