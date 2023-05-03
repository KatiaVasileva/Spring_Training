package skypro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import lombok.*;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

@Component
public class Driver {
    private String name = "John";
   // @Autowired
   // @Qualifier("Audi")
    private Car car;

    public Driver(String name) {
        this.name = name;
    }

    @Autowired
    public Driver(Car car) {
        this.car = car;
    }

    public void startTheCar() {
        System.out.println(name + " сел в " + car.getModel());
        car.start();
    }

    @PostConstruct
    private void init() {
        System.out.println("Водитель проснулся");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Водитель уснул");
    }

    @Override
    public String toString() {
        return "" + car;
    }

}
