package springhw.beans4TASK;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.print.attribute.DocAttribute;
import java.util.LinkedList;
import java.util.List;

@Configuration
public class DaFactory {
   // private DaFactory(){}

    @Bean(name="Note")
    public Note createNote(){
        return new Note("name","theme");
    }


    public Passport createPassport(){
        return new Passport("name","theme",12345);
    }

    public static List<Document> getDaFactory(){
        List<Document> list1 = new LinkedList<>();
        list1.add(new Note("Ilya", "new one"));
        list1.add(new Passport("not Ilya", "123", 1234567890));
      return list1;
    }
}
