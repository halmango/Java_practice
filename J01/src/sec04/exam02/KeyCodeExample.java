package sec04.exam02;

import java.io.IOException;

public class KeyCodeExample {

	public static void main(String[] args) throws IOException {
		
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("keycode : " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keycode : " + keyCode );
		
		keyCode = System.in.read();
		System.out.println("keycode : " + keyCode );
		
		/* result
		a
		keycode : 97
		keycode : 32
		keycode : 13
		*/
	}

}
