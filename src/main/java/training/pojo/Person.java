package training.pojo;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

@Component
public class Person {
    private String name = "Ella";
    private Parrot parrot;

    public Person(String name) {
        this.name = name;
    }

    @Autowired
    public Person(Parrot parrot) {
        this.parrot = parrot;
    }
}
