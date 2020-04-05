package springhw.beans2TASK;

import springhw.beans1TASK.HelloBean;
import springhw.beans1TASK.Printer;

public class FactoryBean {

    public springhw.beans2TASK.Printer createPrinter() {
        return new springhw.beans2TASK.Printer();
    }

    public springhw.beans2TASK.HelloBean createHelloBean(String name) {
        return new springhw.beans2TASK.HelloBean(name);
    }


}
