# springhw
Задание 1: Выполните модификацию проекта так, чтобы и printer и helloBean создавался с помощью фабричного метода. Причем printer должен быть Singleton, а helloBean - прототипом
Примеры конфигураций
<bean id="factoryBean" 
      class="пакет.класс"/>
 
<bean id="bean2" class="пакет.класс"
    factory-method="createBean"  factory-bean="factoryBean">
    <constructor-arg name="message" value="параметр для инициализации"/>
</bean>
