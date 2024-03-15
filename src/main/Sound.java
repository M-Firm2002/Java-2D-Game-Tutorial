package main;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound {
    Clip clip;
    AudioInputStream sounds[] = new AudioInputStream[30];

    public Sound() {
        try {
            sounds[0] = AudioSystem.getAudioInputStream(new File("res/sound/BlueBoyAdventure.wav"));
            sounds[1] = AudioSystem.getAudioInputStream(new File("res/sound/coin.wav"));
            sounds[2] = AudioSystem.getAudioInputStream(new File("res/sound/powerup.wav"));
            sounds[3] = AudioSystem.getAudioInputStream(new File("res/sound/unlock.wav"));
            sounds[4] = AudioSystem.getAudioInputStream(new File("res/sound/fanfare.wav"));
        } catch (Exception e) {
        }
    }

    public void setFile(int i) {
        try {
            clip = AudioSystem.getClip();
            clip.open(sounds[i]);
        } catch (Exception e) {
        }
    }

    public void play() {
        clip.start();
    }

    public void loop() {
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void stop() {
        clip.stop();
    }
}
