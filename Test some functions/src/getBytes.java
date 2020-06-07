import java.util.Scanner;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class getBytes {
	String zin;
	
	public getBytes() {
		this.zin=zin;
	}
	
	void runGetBytes () {
		Scanner scan = new Scanner (System.in);
		System.out.println("Geef een woord of een zin om in bytes om te zetten:");
		zin = scan.nextLine();
		getBytes.Antwoord(zin);
	}
	
	static void Antwoord (String zin) {
		File wahWah = new File("wahwah.wav");
		File victory = new File("owin31.wav");
		
		if (zin.length() > 0) {
			byte[] bytes = zin.getBytes();
			System.out.println("Let's get bytey:\n" + bytes + "\n");
			PlaySound(victory);
		} else {
			System.out.println("Geen input, dus geen data.\n");
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