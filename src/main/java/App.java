import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld hwBean1 =
                (HelloWorld) applicationContext.getBean("helloworld");

        HelloWorld hwBean2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat cat1 = applicationContext.getBean(Cat.class);
        Cat cat2 = applicationContext.getBean(Cat.class);

        System.out.println("helloworld-bean1 == helloworld-bean2: " + (hwBean1 == hwBean2));
        System.out.println("cat-bean1 == cat-bean2: " + (cat1 == cat2));
    }
}