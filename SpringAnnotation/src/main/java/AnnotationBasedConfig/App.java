package AnnotationBasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//Spring core Annnotation
public class App 
{
    public static void main( String[] args )
    {
    	
    ApplicationContext factory=new AnnotationConfigApplicationContext(configuration.class);
     Samsung sung= factory.getBean(Samsung.class);
     sung.main();
     
    }
}
