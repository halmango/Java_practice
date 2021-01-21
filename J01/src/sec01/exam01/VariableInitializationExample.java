package sec01.exam01;

public class VariableInitializationExample {

	public static void main(String[] args) {
		
		//변수 value 선언 (초기화되지 않아 오류가 남)(초기화 (=0)를 해줌으로서 오류가 나지 않음)
		int value = 0;
		
		/* 변수 value 값을 읽고 10을 더하는 산술연산을 수행
		 * 연산의 결과값을 변수 result의 초기값으로 저장
		 */
		int result = value + 10;
		
		System.out.println(result);
	}

}
