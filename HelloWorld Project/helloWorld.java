import java.util.Scanner;
public class helloWorld {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Hello World");
		System.out.print("How many times say hello back?" );
		
		int amount = Integer.valueOf(scan.nextLine());
		
		if (amount < 0) {
			System.out.println("EXCEPTION##!CIVIL_FAREWELL not found");
		} else {
			for (int i=0; i<amount; i++) {
				System.out.println("hello back");
			}
		}

	}

}
