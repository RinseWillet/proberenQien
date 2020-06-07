import java.util.Scanner;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class charAt {
	
String zin;
int index;
Scanner scan;


	public charAt () {
		this.zin = zin;
		this.index = index;
		
		
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
		File wahWah = new File("wahwah.wav");
		File victory = new File("owin31.wav");		
		if (index >= 0 && index <= (zin.length()-1)) {
			System.out.println("Deze index uit jouw zin of woord komt overeen met character: " + zin.charAt(index) + "\n");
			PlaySound(victory);
		} else {
		System.out.println("Ja bobo, daar kan ik niks mee \n");
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

