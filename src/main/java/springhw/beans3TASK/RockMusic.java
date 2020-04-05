package springhw.beans3TASK;

import org.springframework.stereotype.Component;
import springhw.beans3TASK.Music;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "The Beatles ...";
    }
}
