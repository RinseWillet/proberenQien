import java.util.Scanner;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class contentEquals {
			
	String zin1;
	String zin2;
	Scanner scan;

		public contentEquals () {
			this.zin1 = zin1;
			this.zin2 = zin2;
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
			File wahWah = new File("wahwah.wav");
			File victory = new File("owin31.wav");
			
			if (zin1.contentEquals(zin2)) {
				System.out.println("hoera, exact eender!\n");
				PlaySound(victory);
			} else {
				System.out.println("hoera, exact verschillend!\n");
				PlaySound(wahWah);
			}
			
		}
			
		static void PlaySound(File Sound) {
			try {
				Clip clip = AudioSystem.getClip();
				clip.open(AudioSystem.getAudioInputStream(Sound));
				clip.start();
				
				Thread.sleep(clip.getMicrosecondLength()/1000);
				
			} catch (Exception e) {
			}
		}
	}





