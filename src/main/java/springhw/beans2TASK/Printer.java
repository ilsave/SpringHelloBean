package springhw.beans2TASK;

import org.springframework.stereotype.Component;
import springhw.beans1TASK.HelloBean;

@Component("secondBean2")
public class Printer {

    Printer() {}

    public static void printMyFile(springhw.beans2TASK.HelloBean helloBean){
        System.out.println(helloBean.toString());
    }


}
