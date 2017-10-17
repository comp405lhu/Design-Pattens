package state;

import java.util.Scanner;

public class Client {
	
	public static final Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Context context = new Context();
		
		do {
			context.goNext();
			System.out.println(context.getState());
			System.out.println("Enter '-'?");
		}while(!keyboard.next().equals("."));
		System.out.println("bye!");
	}
}
