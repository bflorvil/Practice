package MorePractice;
import java.util.*;



public class ListPractice {
	static String[] myPokemon = Pokemon.party; //Charizard, Arcanine, Lapras, Ninetales, Rapidash, Articuno

	public static void main(String[] args) {
		// List<String> a = new List<String> (); List is an interface and has no constructor
		List<String> b = new ArrayList<String>(); // default size of 10
		List<Integer> c = new LinkedList<Integer>();
		List<String> party = new ArrayList<String>(6); //initial size of 6 but it can be expanded
		
		for (String p : myPokemon) { //or can use Arrays.asList(myPokemon) to make it into a list
			party.add(p);
		}
		System.out.println(party);
		party.add(2,"Dragonair");
		System.out.println(party);
		System.out.println(party.get(2)); //access element
		System.out.println(party.size()); //size of list
		System.out.println(party.set(2, "Dragonite")); //returns the replaced element that is no longer in the list
		List<String> best = party.subList(2, 5);
		System.out.println(best); //includes 2nd index, excludes 5th index
		// party.remove(index) to remove one entry; party.clear() to remove all
		System.out.println(party);
		System.out.println(party.indexOf("Charizard"));
		System.out.println(party.indexOf("Pikachu")); //returns -1 if not found in list
		
		//ListIterator???
		
		ListIterator<String> it =  party.listIterator(party.size()); //can start list iterator at the end of the list with parameter
		while (it.hasPrevious()) {     
			System.out.println(it.previousIndex());
			System.out.println(it.previous().toUpperCase());
			
		}
		
	
		
		
        
		
	}

}
