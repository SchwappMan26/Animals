
public class Bat extends Mammal
	{
		public Bat(String n, String f)
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
				return "I eat ";
			}
	
		@Override
		public String makesNoise()
			{
				// TODO Auto-generated method stub
				return null;
			}

	}
