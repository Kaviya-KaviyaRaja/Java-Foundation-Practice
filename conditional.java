package src;
import java.util.Scanner;
public class Practice2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter your Age: ");
		int age = sc.nextInt();
		
		if(age >= 18) {
			System.out.println("Congrats!! You're elligible to vote");
			
		}
		
		int futureage = age + 10;
		System.out.println(name + "! You will be "+ futureage + "after 10 years");
		 
		
	}

}
