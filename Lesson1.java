
public class Lesson1 {

	public static void main(String[] args) {
	
	house newhouse = new house();	
	
	
	newhouse.cost = 800000;
	newhouse.doors = 4;
	newhouse.windows = 10;
	newhouse.residents = 4;
	newhouse.owners = "Mom and Dad";
	
	
	System.out.println("My house cost " + newhouse.cost + "$ and has " + newhouse.doors + " doors with " + newhouse.residents + " people living in it, and the owners are my " + newhouse.owners + ".");
	
	car Tesla = new car();
	
	Tesla.cost = 75000;
	Tesla.doors = 2;
	Tesla.seats = 4;
	Tesla.tires = 4;
	
	System.out.println("We also have a Tesla that cost " + Tesla.cost + "$, and it has " + Tesla.doors + " doors with a total of " + Tesla.seats + " seats and " + Tesla.tires + " tires. ");
	
	cellphone GalaxyS6 = new cellphone();
	
	GalaxyS6.company = "Samsung";
	GalaxyS6.cost = 450;
	GalaxyS6.model = "6th generation";
	GalaxyS6.owner = "Faraz";
	
	System.out.println("Finally, I have a " + GalaxyS6.company + " smartphone that is a " + GalaxyS6.model + " model, and it cost " + GalaxyS6.cost + "$. I, " + GalaxyS6.owner + " paid for it, so I own it. ");
	
	}
}
	
		class house
		{
			int cost;
			int doors;
			int windows;
			int residents;
			String owners;	
		}

		class car
		{
			int cost;
			int doors;
			int tires;
			int seats;
			
		}
		
		class cellphone
		{
			int cost;
			String company;
			String owner;
			String model;
		}
		
	


