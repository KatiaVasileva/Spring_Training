package skypro;

import org.springframework.stereotype.Component;
import lombok.*;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

@Component
public class Car {
    private String model = "Audi";

    public void start() {
        System.out.println(model + " заведена");
    }

}
