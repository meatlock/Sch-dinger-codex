
public class Ex2 {
//** Program converts units of masses from the imperial system to metric units ( kilograms ). 
	//*It looks to find the  conversion for each kind of imperil unit 
	// * then adds them all together to find its total weight

			public static double p2k(int xp) 
	{ 

		 return xp * 0.45359237;  //Equation relation pounds to kilograms using he number or pounds
		 
	
		 
	}
	
		public static double g2k( int xg)
	{
		
		 return  xg * (1.0/ 7000)* 0.45359237 ; //Equation relating grains to kilograms using he number of grains
		 
	}

	
		public static double d2k( int xd)
	
		{
		
		 return  xd*(1.0/256)*0.45359237; //Equation relating pounds to kilograms using he number of drachins
	
		}


		public static double o2k(int xo)
		{
			
		 return  xo *(1.0/16)*0.45359237;//Equation relating pounds to kilograms using he number of ounces
		}
		
		
		public static double s2k( int xs)
		{
			xs= 11;
		 return  xs *(14* 0.45359237) ;   //Equation relating stones to kilograms using he number of stones
		
		}

		public static double q2k(int xq)
		{
			
		return   xq*(28 *0.45359237) ;   //Equation relating quarters to kilograms using he number of quarters
		}
		
		
		public static double h2k( int xh)
		{		
		return   xh*(112 * 0.45359237);   //Equation relating hundredweights to kilograms using he number of hundredweights
		}
		
		public static double t2k (int xt)
		{
			
		return   xt*(2240 * 0.45359237) ;   //Equation relating tons to kilograms using the number of tons
		}
		
		
	
public static void main (String [] args){
	
	
	System.out.print("The speficied weight converted to kilograms is ");
	
	System.out.println(p2k(6)+g2k(0)+d2k(0)+o2k(0)+s2k(11)+q2k(0)+h2k(0)+t2k(0)); 
	// above is the summation of all of the mass conversions. 
	//This is done by entering the given number of imperial units into the brackets
	// A phrase is printed and the mass conversion is shown in kilograms
}
}
	


