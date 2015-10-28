
public class Eagle extends Bird
	{
		public Eagle(String n, String f)
			{
				name=n;
				food=f;
			}
		@Override
		public String bearsYoung()
			{
				return "The "+name+" lays eggs";
			}
	
		@Override
		public String eats()
			{
				return "The "+name+" eats "+food;
			}
	
		@Override
		public String makesNoise()
			{
				return "The "+name+" makes an Eagle Cry";
			}

	}
