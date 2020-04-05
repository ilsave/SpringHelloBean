package springhw.beans;

public class Printer {

     Printer() {}

    public static void printMyFile(HelloBean helloBean){
        System.out.println(helloBean.toString());
    }

}
