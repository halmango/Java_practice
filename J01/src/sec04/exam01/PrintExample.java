package sec04.exam01;

public class PrintExample {

	public static void main(String[] args) {
		
		int value = 123;
		System.out.printf("Price : %dwon\n", value);
		System.out.printf("Price : %6dwon\n", value);
		System.out.printf("Price : %-6dwon\n", value);
		System.out.printf("Price : %06dwon\n", value);
		
		double area = 3.141592 * 10 * 10;
		System.out.printf("r=%d, Circle area : %10.2f\n", 10, area);
		
		String name = "JI";
		String job = "BackSu";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);

	}

}
