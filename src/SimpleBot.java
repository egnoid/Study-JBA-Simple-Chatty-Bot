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
		
       
    }
}