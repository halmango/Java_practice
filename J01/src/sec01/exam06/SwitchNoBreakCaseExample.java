package sec01.exam06;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		
		int time = (int) (Math.random() * 4) +8;
		System.out.println("The time : " + time + " O'clock");
		
		switch(time) {
			case 8:
				System.out.println("Go work");
			case 9:
				System.out.println("Meeting");
			case 10:
				System.out.println("Working");
			default:
				System.out.println("Work out");
		}

	}

}
