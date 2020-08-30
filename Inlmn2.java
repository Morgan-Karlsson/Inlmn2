package inlmn2;

import java.util.Scanner;

public class Inlmn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String player1 = "Player 1";
		String player2 = "Player 2";
		String choicePlayer1 = new String();
		String choicePlayer2 = new String();
		
		
		choicePlayer1 = playerInput(player1);
		choicePlayer2 = playerInput(player2);
		determineWinner(choicePlayer1, choicePlayer2);
		
		
		
	}
	
	public static String playerInput(String playerNo) {
		
		String gameChoices[] = {"Rock", "Paper", "Scissor"};
		Scanner input = new Scanner(System.in);
		boolean inputLoop = true;
		String playerChoice = new String();
		
		
		
		while(inputLoop)  {
			System.out.println(playerNo +" choose: " + gameChoices[0] + "(1) , " + gameChoices[1] + "(2) , " + gameChoices[2] + "(3)");
			playerChoice = input.nextLine();
			playerChoice = checkInput(playerChoice);
			
			if (!playerChoice.equals("wrong")) {
				inputLoop = false;
			}
		
		}
		
		//input.close();
		
		return playerChoice;
		
	}
	
	public static String checkInput(String s) {
		
		boolean trueNameValue = false;
		
		if (s.equals("Rock")  || s.equals("Paper")  || s.equals("Scissor")  ) {
			trueNameValue = true;
		} else if (s.equals("1")  || s.equals("2")  || s.equals("3")) {
			trueNameValue = true;
			s = fixInput(s);
		} else {
			System.out.println("Wrong input, try again!");
		}
		
		
		if (trueNameValue) {
			return s;
		} else {
			s = "wrong";
			return s;
		}
		
		
	}
	
	public static String fixInput(String choice) {
		
		if (choice.equals("1")) {
			choice = "Rock";
		} else if (choice.equals("2") ) {
			choice = "Paper";
		} else {
			choice = "Scissor";
		}
		
		return choice;
			
	}
	
	public static void determineWinner(String s1, String s2) {
		
		int winner = 0;
		
		if (s1.equals(s2) ) {
			winner = 3;
		} else if (s1.equals("Rock") ) {
			if (s2.equals("Paper")) {
				winner = 2;
			} else if (s2.equals("Scissor")) {
				winner = 1;
			}			
		} else if (s1.equals("Paper")) {
			if (s2.equals("Rock"))  {
				winner = 1;
			} else if (s2.equals("Scissor")) {
				winner = 2;
			}
		} else if (s1.equals("Scissor")) {
			if (s2.equals("Rock")) {
				winner = 2;
			} else if (s2.equals("Paper")) {
				winner = 1;
			}
		}
		
		winnerOutput(winner);
		
	}
	
	public static void winnerOutput(int winner) {
		
		switch (winner) {
		case 1:
			System.out.println("Player 1 wins!");
			break;
		case 2: 
			System.out.println("Player 2 wins");
			break;
		case 3:
			System.out.println("It's a tie!");
			break;
		}
	}
	
	
	
	

}
