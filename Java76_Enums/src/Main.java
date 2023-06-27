enum Planet{
	MERCURY(1,"mercury"),
	VENUS(2,",venus"),
	EARTH(3,"earth"),
	MARS(4,"mars"),
	JUPITER(5,"jupiter"),
	SATURN(6,"saturn"),
	URANUS(7,"youranus"),
	NEPTUNE(8,"neptune"),
	PLUTO(9,"popeye");
	
	int number;
	String name;
	
	Planet(int number, String name){
		this.number = number;
		this.name = name;
	}
}

public class Main {

	public static void main(String[] args) {

		//enum = enumerated (ordered listing of items in a collection)
		//grouping of constants that behave similarly to objects
	
		Planet myPlanet = Planet.PLUTO;
		
		canILiveHere(myPlanet);
		
	}
	
	static void canILiveHere(Planet myPlanet){
		
		switch(myPlanet) {
		case EARTH:
			System.out.println("\nYou can live here :)");
			System.out.println("This is planet #"+myPlanet.number);
			System.out.println("This planet is "+myPlanet.name);
			break;
		default:
			System.out.println("\nYou can't live here...yet");
			System.out.println("This is planet #"+myPlanet.number);
			System.out.println("This planet is "+myPlanet.name);
			break;
		}
	}
	
}