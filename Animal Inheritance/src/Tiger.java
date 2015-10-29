
public class Tiger extends Mammal
	{
		public Tiger(String n,String f)
			{
				name=n;
				food=f;
			}
		@Override
		public String bearsYoung()
			{
				return "I give birth to live young";
			}
	
		@Override
		public String eats()
			{
				return food+" are my favorite";
			}
	
		@Override
		public String makesNoise()
			{
				
				return "Roar";
			}
			
	}
