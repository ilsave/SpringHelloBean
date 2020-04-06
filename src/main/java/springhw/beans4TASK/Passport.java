package springhw.beans4TASK;

import org.springframework.stereotype.Component;

@Component
public class Passport extends Document implements IDocument {
    private String name;
    private String seria;
    private long number;

    public Passport(String name, String seria, long number) {
        super(name);
        this.seria = seria;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "name='" + super.name + '\'' +
                ", seria='" + seria + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public IDocument getDoc() {
        return this;
    }
}
