class LeapYear 
{
	public static void main(String [] ar)
	{
		int n = 2019;
		 if (n % 4 == 0)
		   {
		     if ( n % 100 == 0)
			 {
		           if ( n % 400 == 0)
			      {
			         System.out.println("leap year");
			      }
			      else
			      {
			         System.out.println(" not a leap year");
			      }
			  }
			   else
			      {
			         System.out.println("its a leap year");
			       }
			   
		   }
		
			else
			{
				System.out.println("non-leap year");
				
			}
	}

}
