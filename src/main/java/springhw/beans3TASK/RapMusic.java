package springhw.beans3TASK;

import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "yo yo yo go back to Hong Kong";
    }
}
