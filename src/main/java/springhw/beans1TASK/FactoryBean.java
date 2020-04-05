package springhw.beans1TASK;

public class FactoryBean {

    public Printer createPrinter() {
        return new Printer();
    }

    public HelloBean createHelloBean(String name) {
        return new HelloBean(name);
    }

}
