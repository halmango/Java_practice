package sec01.exam02;

public class IfElseExample {

	public static void main(String[] args) {
		
		int score = 85;
		
		if (score >= 90) {
			System.out.println("The score is higer than 90.");
			System.out.println("The grade is A.");
		} else  /*score < 90 */{
			System.out.println("The score is lower than 90.");
			System.out.println("The grade is loewer than B.");
		}

	}

}
