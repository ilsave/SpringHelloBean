package springhw.beans3TASK;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Computer")
public class Computer {
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return " Привет, спринг - это очень весело " + musicPlayer.playMusic();
    }
}
