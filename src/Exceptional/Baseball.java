package Exceptional;
import java.util.*;


public class Baseball {

	public static void main(String[] args) {
		 Baseball b = new Baseball();
		try {for (int i : b.basketball())
			System.out.print(i + "\t");
		
			
		} catch (ExceptionOne eo) {
			System.out.println(eo.getMessage()); //prints only the custom message passed into the Exception's argument
			eo.printStackTrace(); //prints the standard exception message along with the custom message
			
		}
		
		catch (ExceptionTwo eo) {
			System.out.println(eo.getMessage());
			
		}
		
		catch (InputMismatchException ime) {
			System.out.println("that's not a number");
		}
	    

	}
	
	public int[] basketball() throws ExceptionOne, ExceptionTwo, InputMismatchException {
		int i = 0;
		int[] nums = new int[3];
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 3 positive integers:");
		while (i < 3) {
			nums[i] = scan.nextInt();
			if (nums[i] < 0) {
				throw new ExceptionOne("Must be a positive integer");
			} else if (nums[i] == 0) {
				throw new ExceptionTwo("Cannot be 0");
			}
			
			i++;
			
			
		}
		scan.close();
		return nums;} 
		
		}




