package sec02.exam09;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		
		int charCode = 'A';
		
		if( (charCode >= 65) & (charCode <= 90) ) {
			System.out.println("�빮��"); // ��µ�
		}
		
		if( (charCode >= 97) && (charCode <= 122) ) {
			System.out.println("�ҹ���"); // ��¾ȵ�
		}
		if( !(charCode < 48) && !(charCode > 57) ) {
			System.out.println("0~9 ����"); // ��¾ȵ�
		}
		
		int value = 6;
		
		if( (value%2 == 0) | (value%3 == 0) ) {
			System.out.println("2 �Ǵ� 3�� ���"); // ��µ�
		}
		if( (value%2 == 0) || (value%3 == 0) ) {
			System.out.println("2 �Ǵ� 3�� ���"); // ��µ�
		}
		

	}

}