package sec01.exam01;

public class IfExample {

	public static void main(String[] args) {
		
		int score = 93;
		
		if (score >= 90) {
			System.out.println("점수가 90점 이상");
			System.out.println("등급은 A입니다.");
		}
		
		if(score < 90)
			System.out.println("점수가 90점 미만");
			System.out.println("등급은 B이하 입니다."); //if문과 상관없이 실행됨
		

	}

}
