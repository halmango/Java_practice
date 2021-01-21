package sec01.exam03;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		
		int score = 66;
		
		if (score >= 90) {
			System.out.println("score " + 100 + "~" + 90 + "\nThe grade is A." );
		} else if (score >= 80) {
			System.out.println("score " + 89 + "~" + 80 + "\nThe grade is B.");
		} else if (score >= 70) {
			System.out.println("score " + 79 + "~" + 70 + "\nThe grade is C.");
		} else {
			System.out.println("score " + 69 + "~" + 0 + "\nThe grade is D.");
		}

	}

}
