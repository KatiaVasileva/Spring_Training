package skypro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "skypro")
public class AppConfig {

//    @Bean("BMW")
//    @Scope("prototype")
//    public Car getBMWBean() {
//        return new Car("BMW");
//    }
//
//    @Bean (name = "Audi")
//    @Scope("prototype")
//    public Car getAudiBean() {
//        return new Car("Audi");
//    }
//
//    @Bean (name = "driver1")
//    public Driver getDriver1() {
//        return new Driver("Вася");
//    }
//
//    @Bean (name = "driver2")
//    public Driver getDriver2() {
//        return new Driver("Петя");
//    }
}
