import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AudioPlayer implements LineListener {
	Clip audioClip;
	AudioInputStream audioStream;
	InputStream BufferedStream;
	public void play(String audioFilePath, int numTimes) {
		//File audioFile = new File(audioFilePath);
		try {
		//	audioStream = AudioSystem.getAudioInputStream(audioFile);
			audioStream = AudioSystem.getAudioInputStream(getClass().getResource("resources/" + audioFilePath));
			AudioFormat format = audioStream.getFormat();
			DataLine.Info info = new DataLine.Info(Clip.class, format);
			audioClip = (Clip) AudioSystem.getLine(info);
			audioClip.addLineListener(this);
			audioClip.open(audioStream);
			if (numTimes > 1) {
				audioClip.loop(numTimes - 1);
			}

			audioClip.start();
		} catch (UnsupportedAudioFileException ex) {
			System.out.println("The specified audio file is not supported");
			ex.printStackTrace();
		} catch (LineUnavailableException ex) {
			System.out.println("Audio line for playback is unavailable");
			ex.printStackTrace();
		} catch (IOException ex) {
			System.out.println("Error playing the audio file");
			ex.printStackTrace();
		}

	}

	public void stop() {
		audioClip.stop();
		audioClip.close();
		try {
			audioStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void update(LineEvent arg0) {
		// TODO Auto-generated method stub

	}

}
