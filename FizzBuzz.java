import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		int a;
		int b;
		int ab;
		int n;
		int N;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter starting number: ");
		n = scanner.nextInt();
		System.out.println("Enter ending number: ");
		N = scanner.nextInt();
		System.out.println("Enter Fizz number: ");
		a = scanner.nextInt();
		System.out.println("Enter Buzz number: ");
		b = scanner.nextInt();
		ab = a * b;
		scanner.close();

		for (int i = n; i < N + 1; i++) {
			if (i % ab == 0) {
				System.out.println("FizzBuzz");
			} else if (i % a == 0) {
				System.out.println("Fizz");
			} else if (i % b == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}

	}
}
