import java.util.Scanner;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class testCharAt {
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		File wahWah = new File("wahwah.wav");
		File victory = new File("owin31.wav");
		System.out.println("Geef een woord of een zin:");
		String zin = scan.nextLine();
		
		System.out.println("Geef een getal tussen 0 en " + (zin.length()-1) + " om het geïndexeerde character terug te geven uit jouw zin of woord.");
		int index = Integer.valueOf(scan.nextLine());
		
		if (index >= 0 && index <= (zin.length()-1)) {
			System.out.println("Deze index uit jouw zin of woord komt overeen met character: " + zin.charAt(index));
			PlaySound(victory);
		} else {
		System.out.println("Ja bobo, daar kan ik niks mee");
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

