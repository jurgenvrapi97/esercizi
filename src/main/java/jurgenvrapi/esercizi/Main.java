package jurgenvrapi.esercizi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import jurgenvrapi.esercizi.entities.Menu;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(PizzeriaConfig.class);


        Menu menu = context.getBean(Menu.class);


        menu.stampaMenu();
    }
}
