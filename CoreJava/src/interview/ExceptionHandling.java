package interview;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// method1();
		tryTry();
	}

	public static void tryTry() {
		try {
			try {
				method();
			} catch (Exception e) {
				System.out.println("From inner catch");

			}
		} catch (Exception e) {
			System.out.println("From outer catch");
		}
	}

	public static void method() throws Exception {

		throw new RuntimeException();
	}

	public static void method1() {
		try {
			method();
		} catch (Exception e) {
			System.out.println("From catch");
		}
	}

}
