package sec04.exam03;

public class ContinueKeyCodeReadExample {

	public static void main(String[] args) throws Exception {
		
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keycode : " + keyCode);
		}

	}

}

/* result(space = 32/ enter = 13 & 10
a
keycode : 97
keycode : 32
keycode : 13
keycode : 10
ab
keycode : 97
keycode : 98
keycode : 32
keycode : 13
keycode : 10
abc
keycode : 97
keycode : 98
keycode : 99
keycode : 13
keycode : 10
*/
