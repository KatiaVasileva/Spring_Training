package training;

import training.config.ProjectConfig;
import training.pojo.Parrot;
import training.pojo.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

//        Parrot parrot1 = context.getBean("parrot3", Parrot.class);
//        Parrot parrot2 = context.getBean("miki", Parrot.class);
//        Parrot parrot3 = context.getBean(Parrot.class); // применяет первичный бин с аннотацией @Primary
//        String hello = context.getBean(String.class);
//        Integer ten = context.getBean(Integer.class);
//
//        System.out.println(parrot1.getName());
//        System.out.println(parrot2.getName());
//        System.out.println(parrot3.getName());
//        System.out.println(hello);
//        System.out.println(ten);
//
//        Parrot parrot = context.getBean(Parrot.class);
//        System.out.println(parrot);
//        System.out.println(parrot.getName());

        Person person = context.getBean(Person.class);
        Parrot parrot = context.getBean("parrot1", Parrot.class);
        System.out.println("Person's name: " + person.getName());
        System.out.println("Parrot's name: " + parrot.getName());
        System.out.println("Person's parrot: " + person.getParrot());

//        Parrot parrot = new Parrot();
//        parrot.setName("Miki");
//
//        Supplier<Parrot> parrotSupplier = () -> parrot;
//
//        context.registerBean("parrot", Parrot.class, parrotSupplier, bc -> bc.setPrimary(true));
//        Parrot parrot1 = context.getBean(Parrot.class);
//        System.out.println(parrot1.getName());
        Parrot parrot2 = context.getBean(Parrot.class);
        Parrot parrot3 = context.getBean(Parrot.class);
        System.out.println(parrot2 == parrot3);
        System.out.println(parrot2.equals(parrot3));

    }
}
