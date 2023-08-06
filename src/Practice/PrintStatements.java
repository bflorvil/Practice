package Practice;
public class PrintStatements {
	int a = 35;

	public static void main(String[] args) {
		int y = 40;
		String[] myStrings = new String[5];
		String x = new String("5");
		System.out.print("Hello World!\nHow are you?");
	    System.out.print("\nI'm fine thanks for asking");
	    System.out.println("\n"+5+"\t"+4);
	    attempt();
	    System.out.println(x + " is the value of x");
	    //////////////////////////////Converting between integers and strings////////////////////////////////////////////////////////
	    System.out.println(Integer.valueOf(x) * 7); //converts string value to an integer value so you can do arithmetic on it
                                                     //can also use Integer.parseInt(String s);
	    //String.valueOf(int i) OR Integer.toString(int i) to convert integer i to string
 	    myStrings[0] = String.valueOf(y); //need to convert integer to string to put into string array
 	                                      //can also use Integer.toString(int i)
	    System.out.println(myStrings[0]);
	    
	    PrintStatements ps = new PrintStatements(78);
	    System.out.println(ps.getClass());// returns a Class object
	    System.out.println(ps.toString()); // getClass().getName() @ hashcode of object
	    System.out.println(ps); // equivalent to ps.toString()
	    System.out.println(ps.getClass().getName());
	    System.out.println('A'<'B');
	    
	    
	   
	   

	}
	public static String attempt() {
	    String y;
		return y = (5 > 4) ? "Yes" : "No"; //ignores assignment to y... return (5 > 4) ? "Yes" : "No"
		
	}
	
	public PrintStatements(int a) {
		System.out.println(a); //refers to the parameter int a
		System.out.println(this.a); //specifically refers to the instance variable a
		
	}
	
	
		
	
	
	
	
}
