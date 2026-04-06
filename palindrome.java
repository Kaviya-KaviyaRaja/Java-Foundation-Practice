package src;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number to find its a palindrome or not: ");
		int num  = sc.nextInt();
		
		int rev = 0;
		int original = num;
		
		while(num != 0) {
			int digit = num%10;
			rev = rev*10 + digit;
			num /= 10;
		}
		if(original == rev) {
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("It is not an Palindrome");
		}
	}
	

}
