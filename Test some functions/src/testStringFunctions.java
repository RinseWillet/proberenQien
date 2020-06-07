import java.util.Scanner;


public class testStringFunctions {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			
		while (true) {
		    System.out.println("Welke functie wil je testen:");
		    System.out.println(" 1 - charAt");
		    System.out.println(" 2 - contentEquals");
		    System.out.println(" 3 - getBytes");
		    System.out.println(" x - stop");

		    String command = scan.nextLine();

		    if (command.equals("x")) {
		        break;
		    }
		    
		    if (command.contentEquals("1")) {
		    	charAt test = new charAt();
		    	test.runCharAt();
		    }
		    
		    if (command.contentEquals("2")) {
		    contentEquals test = new contentEquals();
		    test.runContentEquals();
		    }
		    
		    if (command.contentEquals("3")) {
			    getBytes test = new getBytes();
			    test.runGetBytes();
		    }
		    		    
		}
	}
}