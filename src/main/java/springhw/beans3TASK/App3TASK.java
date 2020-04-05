package springhw.beans3TASK;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;

public class App3TASK {
    //ЗАДАНИЕ
    //В объектной модели должен быть создан класс, названный например, "Computer", бину которого внедряется ссылка
    // на  бин класса "MusicPlayer", у которого есть метод play().
    // "MusicPlayer" - это объектная модель музыкального плеера, который умеет воспроизводить музыку разных жанров,
    // как наш "Printer| умеет печатать документ.
    // Но , конечно, музыку мы не воспроизводим в программе, а всего лишь имитируем этот процесс посредством
    // вывода в консоль информации о том, что воспроизводится музыка.
    // Плюс музыка бывает разных жанров, которые моделируются одним интерфейсом и несколькими классами,
    // описывающими конкретные жанры
    //@Autowired создает автоматически бины для их иницализации в классе. Если нет подходящего бина для внедрения зависимости, то будет
    //exception , а если несколько - неопреленность.
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext3TASK.xml");
        Computer com = ctx.getBean("Computer", Computer.class);
        System.out.println(com);
    }
}
