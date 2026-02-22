package net.elhaid.presentation;

import net.elhaid.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ELHAID Yousef
 **/
public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("net.elhaid");

        IMetier metier = applicationContext.getBean("metier", IMetier.class);
        System.out.println("RES: "+ metier.calcul());
    }
}
