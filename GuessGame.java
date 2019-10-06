package guessingGame;

public class GuessGame {
	
	//instance variables for player objects
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame() {
		
		//create player objects and assign to the instance variables
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		
		//declare variables to hold each players guess
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		
		//declare variables to held a true or false based on players answer
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		
		//generate random target number players have to guess
		int targetNumber = (int) (Math.random() * 10);
		System.out.println("Thinking of a number between 0 and 9...");

		
		while(true) {
			
			System.out.println(); //creates some white space
			System.out.println("Number to guess is " + targetNumber);
			System.out.println(); //creates some white space
			
			
			//Call each players guess() method
			p1.guess();
			p2.guess();
			p3.guess();
			System.out.println(); //creates some white space
			
			//get each players guess (the result of their guess() method running) from the number variable of each player
			guessp1 = p1.number;
			System.out.println("Player one guessed " + guessp1);
			
			guessp2 = p2.number;
			System.out.println("Player two guessed " + guessp2);
			
			guessp3 = p3.number;
			System.out.println("Player three guessed " + guessp3);
			
			
				//check each players guess to see if it matches the target number.  If a player is right then set that players variable to be true
				if (guessp1 == targetNumber) {
					
					p1isRight = true;
					
					}
				
				
				if (guessp2 == targetNumber) {
					
					p2isRight = true;
					
					}
				
				
				if (guessp3 == targetNumber) {
					
					p3isRight = true;
					System.out.println(); //creates some white space
					}
				
				if (p1isRight || p2isRight || p3isRight) {
					
					System.out.println(); //creates some white space
					System.out.println("We have a winner!");
					System.out.println(); //creates some white space
					System.out.println("Player one got it right? " + p1isRight);
					System.out.println("Player two go it right? " + p2isRight);
					System.out.println("Player three go it right? " + p3isRight);
					System.out.println(); //creates some white space
					System.out.println("Game Over");
					break; //game over break out of loop
					}
				
				
				else {
					
						System.out.println("Players have another guess");
				
					} //end if/else
			
		} //end while loop
		
		
	} //end of method start game
	

} //End of class GuessGame
