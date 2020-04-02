
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class sound {
	public static AudioInputStream audio;
	public static Clip clip, music1,music2;
	public static void music1 (){
		try {
			  audio = AudioSystem.getAudioInputStream(new File("music/music1.wav"));//use wav. mp3 doesn't work
			  music1 = AudioSystem.getClip();
			  music1.open(audio);
			  music1.start();
			  music1.loop(Clip.LOOP_CONTINUOUSLY);
			} 
			catch(UnsupportedAudioFileException uae) {
			  System.out.println(uae);
			} 
			catch(IOException ioe) { 
			  System.out.println(ioe);
			} 
			catch(LineUnavailableException lua) { 
			  System.out.println(lua);
			}
	}
	public static void music2 (){
		try {
			  audio = AudioSystem.getAudioInputStream(new File("music/music2.wav"));//use wav. mp3 doesn't work
			  music2 = AudioSystem.getClip();
			  music2.open(audio);
			  music2.start();
			  music2.loop(Clip.LOOP_CONTINUOUSLY);
			} 
			catch(UnsupportedAudioFileException uae) {
			  System.out.println(uae);
			} 
			catch(IOException ioe) { 
			  System.out.println(ioe);
			} 
			catch(LineUnavailableException lua) { 
			  System.out.println(lua);
			}
	}
	public static void click (){
			try {
				  audio = AudioSystem.getAudioInputStream(new File("music/click.wav"));//use wav. mp3 doesn't work
				  clip = AudioSystem.getClip();
				  clip.open(audio);
				  clip.start();
				} 
				catch(UnsupportedAudioFileException uae) {
				  System.out.println(uae);
				} 
				catch(IOException ioe) { 
				  System.out.println(ioe);
				} 
				catch(LineUnavailableException lua) { 
				  System.out.println(lua);
			}
	}
	public static void lose (){
		try {
			  audio = AudioSystem.getAudioInputStream(new File("music/lose.wav"));//use wav. mp3 doesn't work
			  clip = AudioSystem.getClip();
			  clip.open(audio);
			  clip.start();
			} 
			catch(UnsupportedAudioFileException uae) {
			  System.out.println(uae);
			} 
			catch(IOException ioe) { 
			  System.out.println(ioe);
			} 
			catch(LineUnavailableException lua) { 
			  System.out.println(lua);
		}
	}
	public static void pass (){
		try {
			  audio = AudioSystem.getAudioInputStream(new File("music/pass.wav"));//use wav. mp3 doesn't work
			  clip = AudioSystem.getClip();
			  clip.open(audio);
			  clip.start();
			} 
			catch(UnsupportedAudioFileException uae) {
			  System.out.println(uae);
			} 
			catch(IOException ioe) { 
			  System.out.println(ioe);
			} 
			catch(LineUnavailableException lua) { 
			  System.out.println(lua);
		}
	}
	public static void win (){
		try {
			  audio = AudioSystem.getAudioInputStream(new File("music/win.wav"));//use wav. mp3 doesn't work
			  clip = AudioSystem.getClip();
			  clip.open(audio);
			  clip.start();
			} 
			catch(UnsupportedAudioFileException uae) {
			  System.out.println(uae);
			} 
			catch(IOException ioe) { 
			  System.out.println(ioe);
			} 
			catch(LineUnavailableException lua) { 
			  System.out.println(lua);
		}
	}
	
}
