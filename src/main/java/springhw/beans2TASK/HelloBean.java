package springhw.beans2TASK;

import org.springframework.stereotype.Component;

@Component("firstBean2")
public class HelloBean {
    private String name;

    HelloBean (){}
    //Конструктор
    public HelloBean(String name) {
        super();
        this.name = name;
    }

    public static springhw.beans1TASK.HelloBean createHelloBean(String name){
        return new springhw.beans1TASK.HelloBean(name);
    }

    public static void print(){
        System.out.println("hewy!");
    }

    //Getter
    public String getName() {
        return name;
    }
    //Setter
    public void setName(String name) {
        this.name = name;
    }

    //Печать объекта в строку
    @Override
    public String toString() {
        return "HelloBean [name=" + name + ", getName()=" + getName() + ", getClass()=" + getClass() + ", hashCode()="
                + hashCode() + ", toString()=" + super.toString() + "]";
    }

}
