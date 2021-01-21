package sec01.exam03;

public class VariableExchangeExample {
	public static void main(String[] args) {
		
		int x = 3;
		int y = 5;
		System.out.println("x: " + x + ", y: " + y );
		//결과 x: 3, y: 5
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x: " + x + ", y: " + y);
		//변수 x의 값 3을 temp에 저장 -> 변수 y의 값 5를 변수 x에 저장 -> 변수 temp 값 3을 변수 y에 저장
		//결과 x: 5, y: 3
	}

}
