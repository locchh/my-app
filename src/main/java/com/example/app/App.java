package com.example.app;

// Import Spring framework classes for application context
import org.springframework.context.ApplicationContext;
// Import the implementation of ApplicationContext that loads beans from an XML file
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Main application class that demonstrates Spring context initialization
 * and bean retrieval.
 */
public class App 
{
    public static void main( String[] args )
    {   
        // The Spring container is represented by the ApplicationContext interface,
        // which is implemented by the ClassPathXmlApplicationContext class. 
        
        // Create a new Spring application context by loading the XML configuration file
        // This loads all bean definitions from applicationContext.xml in the classpath
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the HelloWorld bean from the Spring context
        // The bean ID "helloWorld" must match the id attribute in the XML configuration
        // We cast the returned Object to HelloWorld type
        
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        
        HelloWorld obj2 = (HelloWorld) context.getBean("helloWorldAnother");
        
        // Call toString() on the HelloWorld bean and print the result
        // This will display the message that was injected via Spring
        System.out.println( obj.toString() );
        System.out.println( obj2.toString() );

        // Close the application context
        //context.close();
    }
}
