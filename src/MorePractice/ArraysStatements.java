package MorePractice;

import java.util.*;

public class ArraysStatements {

	public static void main(String[] args) {
		int[] myArr = new int[5];
		String[] myPokemon = {"Charizard", "Arcanine", "Lapras", "Ninetales", "Rapidash", "Articuno"};
		char[] myChars = {'a','b','?'};
		myArr[4] = 100;
		myArr[0] = 0;
		myArr[1] = 1;
		myArr[2] = 2;
		myArr[3] = 3;
		System.out.println(myArr[3]);
		for(int i = 0; i < myPokemon.length; i++)
			System.out.println(myPokemon[i]);
		for (String p : myPokemon) // for-each loop available for arrays/lists
			System.out.println(p); 
		System.out.println(Arrays.toString(myArr)); //prints array directly instead of it's memory address, however it converts it to a string
		System.out.println(Arrays.toString(myPokemon));
		System.out.println(myPokemon); // prints memory address of myPokemon array
		System.out.println(Arrays.asList(myPokemon)); // prints array as a list.. you can print lists directly
		List<String> party = Arrays.asList(myPokemon); // storing pokemon list as party
        System.out.println(party);
        System.out.println(Arrays.toString(myArr));
        System.out.println(Arrays.toString(myArr).length());//length of the string produced from the array: includes brackets, commas, and spaces
		System.out.println(myArr.length); // the true length of the array using length STATE
		
		System.out.println(myChars);//character arrays are printed as if its a string (i guess cause strings are basically character arrays)
		System.out.println(myArr);//prints memory address
		System.out.println(myPokemon);//prints memory address (any other kind of array prints the memory address)
		System.out.println(Arrays.binarySearch(myPokemon, "Lapras"));
		System.out.println(Arrays.binarySearch(myArr, 9));
		
		
		
		
		   
		
			
		

	}

}
