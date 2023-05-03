package skypro;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Driver driver1 = context.getBean(Driver.class);
//        Driver driver2 = context.getBean("driver2", Driver.class);
//
//        Car car1 = driver1.getCar();
//        Car car2 = driver2.getCar();
//
//        System.out.println(car1 == car2);
//        System.out.println(car1.equals(car2));

        driver1.startTheCar();
        context.close();

    }
}
