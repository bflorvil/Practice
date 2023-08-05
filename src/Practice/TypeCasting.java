package Practice;

import java.util.Arrays;
import java.util.List;

public class TypeCasting {
/////////////////////////////// Bitter Black Coffee Sure Is For Long Days////////////////////////////////////////////////
	public static void main(String[] args) {
		int i = 5;
		long l = i; // no need to explicitly cast long since long holds more bits than int (it's done automatically/implicitly
        double d = i; // no need...
		byte b = (byte) i; // need to explicitly cast byte since int holds more bits than byte (since there is potential for data loss) 
		short s = (short) i; // need to explicitly cast 
		
	    int sum1 = i + b; // no need for casting.. int + byte is assumed to be int
	    short sum2 = (short) (b + s); // casting needed.. byte + short is assumed to be int
	    int sum3 = i + (int) l; // casting needed.. int + long is assumed to be long. just need to cast the long
	    double sum4 = d + i; // no need for casting.. double + int is assumed to be double
	    float sum5 = (float) d + l; // casting needed.. double + long is assumed to be double
	    long sum6 = b + s; // no need for casting.. long holds more bits than the assumed int
	    float sum7 = b + s;// no need for casting.. assumed type int is smaller than a float
	    long sum8 = (long) d + i; // type double is too big to fit into long. only need to cast the double, the int is fine
	   
	    
	    // when operating on 2 whole number types, result is assumed of type int
	    // if either operand is a decimal (float or double), result is assumed to be of type double
	    
		////////////////////Converting between Strings and character arrays////////////////////////////////////////////////////////////
		String str = "Hello";
		System.out.println(str);
		char[] strChars = str.toCharArray(); //"Hello" is now a char array
		// char[] myChars = (char[]) str; Cannot cast string to char array... must use toCharArray instance method
		System.out.println(Arrays.toString(strChars)); //prints the array as a string
	
		char[] myChars = {'a','b','c'};
		//String str2 = (String) myChars; The opposite is also impossible... must use String.valueof(char array)
		str = String.valueOf(myChars); //character array is now a string
		System.out.println(str);
		
	    ///String.valueOf() OR Arrays.toString() to convert character array to a string

	   
		
		
		

	}

}
