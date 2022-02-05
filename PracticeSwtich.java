class PracticeSwtich
{
	public static void main(String args[])
	{
	  // char v[]='a';
		char vowels[]={'a','e','i','o','u'};
		int i;
		for(i=0;i<vowels.length;i++)
		{
			if (i==3)
			{
				//break;
		    continue;
		
			}
		System.out.println(vowels[i]);
		}
		
		for (char vow: vowels)
		{
			System.out.println(vow);
		}
			
		/*switch(v)
		{
			case 'a': System.out.printf("vowel");
			         break;
			//case 'e' : System.out.printf("vowel");
			         // break;		  
			default:  System.out.printf(" not a vowel");		  
		}*/
				   
	}
}