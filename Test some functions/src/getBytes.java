import java.util.Scanner;

public class getBytes {
	String zin;
	
	public getBytes() {
		
	}
	
	void runGetBytes () {
		Scanner scan = new Scanner (System.in);
		System.out.println("Geef een woord of een zin om in bytes om te zetten:");
		zin = scan.nextLine();
		getBytes.Antwoord(zin);
	}
	
	static void Antwoord (String zin) {
		soundEffects sound = new soundEffects();
		
		if (zin.length() > 0) {
			byte[] bytes = zin.getBytes();
			System.out.println("Let's get bytey:\n" + bytes + "\n");
			sound.good();
		} else {
			System.out.println("Geen input, dus geen data.\n");
			sound.bad();
		}
	}
}
	