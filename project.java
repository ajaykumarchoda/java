class Project
{
	public static void main(String []ar)
	{
	   int headCount = 0;
	   int tailCount = 1;
	
	  {
		for(int i=0 ; i<= 15 ; i++)
		{
		int rand = (int)(Math.random() *2);
		
		if (rand == 0)
		{
			System.out.println("h");
			headCount++;
		}
		else if (rand == 1)
		{
			System.out.println("t");
			tailCount++;
		}
		}
	  }
	  System.out.println("headCount :" + headCount);
	  System.out.println("tailcount :" + tailCount);
    }
		
}
