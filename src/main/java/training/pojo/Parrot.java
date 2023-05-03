package training.pojo;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

//@Component
public class Parrot {

    private String name = "Koko";

//    @PostConstruct
//    public void init() {
//        this.name = "Tiki";
//    }

    @Override
    public String toString() {
        return "" + name;
    }
}
