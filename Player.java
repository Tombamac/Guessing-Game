package guessingGame;

public class Player {
	
	int number= 0; //where the guess goes
	
	public void guess() {
		
		//generate a random guess for each player
		number = (int) (Math.random() * 10);
		System.out.println("Players guess is " +number);
		
	} //end of guess

} //end of class
