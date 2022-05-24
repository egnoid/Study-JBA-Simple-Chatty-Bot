//package bot;
import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        // write your code here
        final String BOTNAME = "Plaksa";
        final int BOTDOB = 1999;
        
        System.out.println("Hello! My name is " + BOTNAME + " .");
        System.out.println("I was created in " + BOTDOB + " .");
		
		System.out.println("Please, remind me your name.");

		Scanner scanner = new Scanner(System.in);
		String yorName = scanner.next();
		
		System.out.println("What a great name you have, " + yorName + "!");
		
		System.out.println("Let me guess your age.");
		System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
		
		int remainder3 = scanner.nextInt();
		int remainder5 = scanner.nextInt();
		int remainder7 = scanner.nextInt();
		
		int yourAge = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
		System.out.println("Your age is " + yourAge + "; that's a good time to start programming!");
		
       
    }
}