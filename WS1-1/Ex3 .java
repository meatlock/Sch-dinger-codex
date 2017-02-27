
public class Ex3 {
	
public static double Yx( int cap, double intR, int years )
{
  return  cap*Math.pow( 1+(intR*0.01), years); // program looks at generalising the compound interest and the total remaining at the end of every year
 
}// In order for the program to run the cap, interest rate and years must be known 

public static void main (String [] args)
	{
	
	// The instruction below are needed to print out the year and the total in each account
	System.out.println("After 1 year the total amount in the account will be " +Yx(100,2.3,1));
	
	System.out.println("After 2 years the total in the account will be " +Yx(100,2.3,2));
	
	System.out.println("After 3 years the total amount in the account will be " +Yx(100,2.3,3));

	System.out.println("After 4 years the total amount in the account will be " +Yx(100,2.3,4));
	
	System.out.println("After 5 years the total amount in the account will be " +Yx(100,2.3,5));
	
	System.out.println("After 500 years the total amount in the account will be " +Yx(100,2.3,500));
}
}
