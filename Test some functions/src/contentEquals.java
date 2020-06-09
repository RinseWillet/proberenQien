import java.util.Scanner;

public class contentEquals {
			
	String zin1;
	String zin2;
	Scanner scan;

		public contentEquals () {
			
		}
		
		void runContentEquals () {
			Scanner scan = new Scanner (System.in);
			System.out.println("Geef een eerste woord of een zin:");
			zin1 = scan.nextLine();
			System.out.println("Geef een tweede woord of een zin:");
			zin2 = scan.nextLine();
			contentEquals.Antwoord(zin1, zin2);
		}
			
		static void Antwoord (String zin1, String zin2) {
			soundEffects sound = new soundEffects();
			
			if (zin1.contentEquals(zin2)) {
				System.out.println("hoera, exact eender!\n");
				sound.good();
			} else {
				System.out.println("hoera, exact verschillend!\n");
				sound.bad();
			}
			
		}
}
		




