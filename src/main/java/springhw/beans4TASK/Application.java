package springhw.beans4TASK;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Application {
    public static void main(String[] args) {
       // ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext4TASK.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(DaFactory.class);
        Document doc1 = new Note("Going to superMarket", "wanna eat");
        Document doc2 = new Passport("Ilya ", "123", 67890);
        Printer.printing(doc1);
        Printer.printing(doc2);
        Document doc3 = context.getBean("Note", Note.class);
        Printer.printing(doc3);
        //IDocument tr = new Passport();
        System.out.println("FACTORU HAS BEEN STARTED");
        List<Document> factory = DaFactory.getDaFactory();
        Printer.printMyFactory(factory);
    }
}
