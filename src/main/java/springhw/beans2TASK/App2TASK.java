package springhw.beans2TASK;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springhw.beans1TASK.HelloBean;
import springhw.beans1TASK.Printer;

public class App2TASK {
    //2 задание - то же самое что и первое но создание бинов надо сделать через @Component
    // (перед классом пишешь аннтоцию и она заменяет описание в xml)

    //КАКОЕ БЫЛО ЗАДАНИЕ - СОЗДАТЬ 2 БИНА ПРИНТЕР И ХЕЛЛОБИН ИЗ АБСТРАКТНОЙ ФАБРИКИ
    //АБСТРАКТНАЯ ФАБРИКА - ЭТО ПРЕЖДЕ ВСЕГО ОБЪЕКТ ИМЕЮЩИЙ СПОСООБНОСТЬ ВОЗВРАЩАТЬ ОБЪЕКТЫ ДРУГИ КЛАССОВ
    //FACTORY-BEAN - БИН, ВОЗВРАЩАЮЩИЙ БИНЫ ДРУГИХ КЛАССОВ
    //FACTORY - METHOD - МЕТОД В FACTORY - BEAN, ВОЗВРАЩАЮЩИЙ ОБЪЕКТ КЛАССА

    public static void main(String[] args) {
        // Создаем контекст приложения из xml файла ("src/main/resources/applicationContext1TASK.xml")
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext2TASK.xml");
        // Считываем бин (объект)
        springhw.beans2TASK.HelloBean hb = ctx.getBean("firstBean2", springhw.beans2TASK.HelloBean.class);
        springhw.beans2TASK.Printer printer = ctx.getBean("secondBean2", springhw.beans2TASK.Printer.class);
        // Печатаем объект в консоль
        springhw.beans2TASK.Printer.printMyFile(hb);

        ctx.close();
    }

}


