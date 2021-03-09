package exercises;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = keyboard.nextLine();
		System.out.println("How old are you?");
		int age = keyboard.nextInt();
		System.out.println("How tall are you?");
		float height = keyboard.nextFloat();
		System.out.println("Mr/Mrs " + name + ", " + age + " years old, " + height + " meters tall.");
		keyboard.close();
	}
}
