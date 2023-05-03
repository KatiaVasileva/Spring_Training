package training.config;

import training.pojo.Parrot;
import training.pojo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "training")
public class ProjectConfig {

    @Bean
    //@Primary
    Parrot parrot1() {
        var parrot = new Parrot();
        parrot.setName("Koko");
        return parrot;
    }
//
//    @Bean(name = "miki")
//    // @Bean(value = "miki")
//    // @Bean("miki")
//    Parrot parrot2() {
//        var parrot = new Parrot();
//        parrot.setName("Miki");
//        return parrot;
//    }
//
//    @Bean
//    Parrot parrot3() {
//        var parrot = new Parrot();
//        parrot.setName("Riki");
//        return parrot;
//    }
//
//    @Bean
//    Person person() {
//        return new Person("Ella", parrot1());
//    }

    @Bean
    public Person person(Parrot parrot) {
        return new Person("Ella", parrot);
    }

    @Bean
    String hello() {
        return "Hello";
    }

    @Bean
    Integer ten() {
        return 10;
    }
}
