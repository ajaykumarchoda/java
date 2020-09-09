class Power
{
   public static void main(String [] ar)
   {
      int a = 20;
      int n = 2 ^ a;
	 {
	   if (n % 4 == 0)
	   {
		   if (n % 100 == 0)
		   {
			   if (n % 400 == 0)
			   {
				   System.out.println("leap year");
			   }
			   else
			   {
				   System.out.println("non leap year");
			   }
		   }
		   else
		   {
			   System.out.println("leap year");
		   }
	   }
	   else
	   {
		   System.out.println( " is not a leap year");
	   }
	 } 
   }

}
