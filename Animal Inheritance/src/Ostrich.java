
public class Ostrich extends Bird
	{
		public Ostrich(String n, String f)
			{
				name=n;
				food=f;
			}
		@Override
		public String bearsYoung()
			{
				return "I lay eggs";
			}
	
		@Override
		public String eats()
			{
				return "I eat "+food;
			}
	
		@Override
		public String makesNoise()
			{
				return "Bleep bleep";
			}		
			
	}
