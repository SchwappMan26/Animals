import java.util.ArrayList;
public class AnimalRunner
	{

		public static void main(String[] args)
			{
				Animal t=new Tiger("Tiger","Wild pigs");
				System.out.println(t.name+":");
				System.out.println("    How does it give birth: "+t.bearsYoung());
				System.out.println("    What does it eat: "+t.eats());
				System.out.println("    What noise does it make: "+t.makesNoise());
				
				Animal b=new Bat("Bat","Bugs");
				System.out.println(b.name+":");
				System.out.println("    How does it give birth: "+b.bearsYoung());
				System.out.println("    What does it eat: "+b.eats());
				System.out.println("    What noise does it make: "+b.makesNoise());
				
				Animal o=new Ostrich("Ostrich","Seeds");
				System.out.println(o.name+":");
				System.out.println("    How does it give birth: "+o.bearsYoung());
				System.out.println("    What does it eat: "+o.eats());
				System.out.println("    What noise does it make: "+o.makesNoise());
				
				Animal e=new Eagle("Eagle","Fish");
				System.out.println(e.name+":");
				System.out.println("    How does it give birth: "+e.bearsYoung());
				System.out.println("    What does it eat: "+e.eats());
				System.out.println("    What noise does it make: "+e.makesNoise());
						
				ArrayList <Animal>Animals=new ArrayList<Animal>();
				Animals.add(t);
				Animals.add(b);
				Animals.add(o);
				Animals.add(e);

			}

	}
