package MorePractice;

import java.util.Scanner;

public class StringsIntro {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word1 = scan.next();
		String word2 = scan.next();
		
		System.out.println(word1.length() + word2.length());
		
		int shorter_wordlength = word1.length() < word2.length() ? word1.length() : word2.length();
		int i = 0;
		while (i < shorter_wordlength) {
		if (word1.charAt(i) != word2.charAt(i)) {
			
			if (word1.charAt(i) < word2.charAt(i)) {
				System.out.println("Yes");
				i = shorter_wordlength;
				}
			else {
				System.out.println("No");
				i = shorter_wordlength;
				}
			
		}
		else i++; 
		
		}
		word1 = word1.toUpperCase();
		word1 = word1.charAt(0) + word1.substring(1).toLowerCase();
		word2 = word2.toUpperCase();
		word2 = word2.charAt(0) + word2.substring(1).toLowerCase();	
		System.out.println(word1 + " " + word2);
		
		}
	
	
		
		
	
		}
	
	


