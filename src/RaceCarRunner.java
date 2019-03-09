

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
	RaceCar bob=new RaceCar("ferrari", 5);
		// 2. Print the RaceCar's position in the race
System.out.println(bob.getPositionInRace());
		// 3. Crash the RaceCar
		bob.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
if(bob.damaged==true) {
	bob.pit();
	
}
		// 5. Help the car move into first place.
for (int i = 0; i < 7; i++) {
	bob.overtake();	
}
	}
}
