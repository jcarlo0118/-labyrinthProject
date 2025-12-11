package labyrinth.UserInteraction;
import java.util.Scanner;


import java.util.InputMismatchException;

public class UserInput {
	private Scanner in = new Scanner(System.in);
	
	public int selectNumber() {
		int input;
		while(true) {
			try {
				input = in.nextInt();
			}catch(InputMismatchException ime) {
				System.out.println("ENTER A VALID INTEGER VALUE");
				continue;
			}
			return input;
		}
	}
	
	public void waitForEnter() {
		in.nextLine();
	}
	
	public String enterString() {
		return in.nextLine();
	}
}
