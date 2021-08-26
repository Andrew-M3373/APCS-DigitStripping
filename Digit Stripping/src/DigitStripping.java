import java.util.Scanner;
public class DigitStripping {

	public static void main(String[] args) {
		
		System.out.println("Enter a whole number and we will print it backward.");
		
		Scanner userInput = new Scanner(System.in);
		int number = userInput.nextInt();
		System.out.print("\nYour number printed backwards is ");
		int digit = number;
		
		while (number > 0)
		{
			digit = number % 10;
			System.out.print(digit);
			number  /= 10;
		}
		
	}

}
