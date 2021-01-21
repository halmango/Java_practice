package sec04.exam05;

import java.util.Scanner;

public class KeyboardEvent {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		String keyEvent;
		
		while(true) {
			keyEvent = scanner.nextLine();
			System.out.println("+++ Key:" + keyEvent);
			
		}

	}

}
