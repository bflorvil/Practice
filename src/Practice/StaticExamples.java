package Practice;

public class StaticExamples {
	static int x = 5;
	int y = 10;
	
		public static void main(String[] args) {
			hello();
			sayonara();
			StaticExamples obj = new StaticExamples(); //have to create object to access non-static method "bye" and instance variable "y"
			obj.bye();
			System.out.println(obj.y);
		

		}
	
		public static void hello() {
//can only reference static variables and other static methods (same for the main method); unless you create an object within the method
		
			System.out.println(x);  
			sayonara();
			
		}
		
		public void bye() { //can access any members, both static and non-static variables & methods 
			hello();
			System.out.println(y); //no need to access instance variable "y" through an object, can access directly since you're in the same class
			System.out.println(x);
		}
		
		public static void sayonara() {
			System.out.println("goodbye");
			
		}

}
