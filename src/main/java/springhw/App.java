package springhw;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springhw.beans.HelloBean;
import springhw.beans.Printer;

public class App {

	public static void main(String[] args) {
		// Создаем контекст приложения из xml файла ("src/main/resources/applicationContext.xml")
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // Считываем бин (объект)
        HelloBean hb = ctx.getBean("firstBean", HelloBean.class);
        Printer printer = ctx.getBean("secondBean", Printer.class);
        // Печатаем объект в консоль 
        Printer.printMyFile(hb);

        ctx.close();
	}

}

/*
* <bean id="secondBean"
          class="springhw.beans.Printer"
          factory-method="createPrinterBean">
    </bean>

    <bean id="factoryBeanClassBean"
          class="springhw.beans.FactoryBean"
          factory-method="createHelloBeanFromFactoryBean"
          factory-bean="FactoryBean"
          scope="prototype">
    </bean>
* */
