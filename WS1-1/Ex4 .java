
public class Ex4 {
// The code below is used in calculating the additon and multiplacation of two fractions
	// producing the relevant fraction at the end in the main method
	public static int fracAddN (int e1, int e2, int d1, int d2) // method code necessary to calculate es
	{
	 return (e1*d2)+(e2*d1);  // calculates the sum of numerator needed for addition
		
	}
	
	public static int fracAddD(int d1, int d2) //  method necessary in calculating ds
	{
		return d1* d2;    // calculates the value of sum of denominator necessary for additon
	}
	
	
	public static int multiN(int e1, int e2)  // method for calculating ep
	{
		return e1*e2;  // calculates the product of the numerators
	}
	
	
	public static int multiD(int d1, int d2)
	{
		return d1*d2; // calculates the product of the denominators 
	}
	
	
	
	public static void main(String [] args)
	{
		System.out.print(fracAddN(1,1,2,3));     // prints and calculates the numerator of first test
		System.out.println(" / "+fracAddD(2,3)); // prints and calculates the denominator of the first test
		
		System.out.print(fracAddN(1,3,3,4));      // prints and calculates the numerator of first second
		System.out.println(" / "+fracAddD(3,4));  // prints and calculates the denominator of first second
		
		System.out.print(multiN(1,2));      // prints and calculates the numerator of first second
		System.out.println(" / "+multiD(2,3));  // prints and calculates the denominator of first second

		System.out.print(multiN(1,2));      // prints and calculates the numerator of first second
		System.out.println(" / "+multiD(4,3));  // prints and calculates the denominator of first second
		
		
	
	}
}
