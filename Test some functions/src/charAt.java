import java.util.Scanner;

public class charAt {
	
String zin;
int index;
Scanner scan;


	public charAt () {
		
	}
	
	void runCharAt () {
		Scanner scan = new Scanner (System.in);
		System.out.println("Geef een woord of een zin:");
		zin = scan.nextLine();
		System.out.println("Geef een getal tussen 0 en " + (zin.length()-1) + " om het geïndexeerde character terug te geven uit jouw zin of woord.");
		index = Integer.valueOf(scan.nextLine());
		charAt.Antwoord(zin, index);		
	}
		
	static void Antwoord (String zin, int index) {
		soundEffects sound = new soundEffects();
		if (index >= 0 && index <= (zin.length()-1)) {
			System.out.println("Deze index uit jouw zin of woord komt overeen met character: " + zin.charAt(index) + "\n");
			sound.good();
		} else {
		System.out.println("Ja bobo, daar kan ik niks mee \n");
		sound.bad();
		} 
	}
}
	