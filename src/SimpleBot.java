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
		
		System.out.println("Now I will prove to you that I can count to any number you want.");
		
		int inputNum = scanner.nextInt();
		
		for (int i = 0; i <= inputNum; i++) {
			System.out.println(i + "!");
		}
		
		System.out.println("Let's test your programming knowledge.");
		System.out.println("Why do we use methods?");
		System.out.println("1. To repeat a statement multiple times.");
		System.out.println("2. To decompose a program into several small subroutines.");
		System.out.println("3. To determine the execution time of a program.");
		System.out.println("4. To interrupt the execution of a program.");
		
		int answ = 0;
		while (answ != 2) {
			answ = scanner.nextInt();
			if (answ == 2) {
				break; 
			} else {
				System.out.println("Please, try again.");
			}
		}
		
		System.out.println("Completed, have a nice day!");
       
    }
}