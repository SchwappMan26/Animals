
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
				return "I lays eggs";
			}
	
		@Override
		public String eats()
			{
				return "I eat "+food;
			}
	
		@Override
		public String makesNoise()
			{
				return "Eagle Cry";
			}

	}
