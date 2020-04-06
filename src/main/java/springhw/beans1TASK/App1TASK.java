package springhw.beans1TASK;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springhw.beans1TASK.HelloBean;
import springhw.beans1TASK.Printer;

public class App1TASK {

    //КАКОЕ БЫЛО ЗАДАНИЕ - СОЗДАТЬ 2 БИНА ПРИНТЕР И ХЕЛЛОБИН ИЗ АБСТРАКТНОЙ ФАБРИКИ
    //АБСТРАКТНАЯ ФАБРИКА - ЭТО ПРЕЖДЕ ВСЕГО ОБЪЕКТ ИМЕЮЩИЙ СПОСООБНОСТЬ ВОЗВРАЩАТЬ ОБЪЕКТЫ ДРУГИ КЛАССОВ
    //FACTORY-BEAN - БИН, ВОЗВРАЩАЮЩИЙ БИНЫ ДРУГИХ КЛАССОВ
    //FACTORY - METHOD - МЕТОД В FACTORY - BEAN, ВОЗВРАЩАЮЩИЙ ОБЪЕКТ КЛАССА

	public static void main(String[] args) {
		// Создаем контекст приложения из xml файла ("src/main/resources/applicationContext1TASK.xml")
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext1TASK.xml");
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
