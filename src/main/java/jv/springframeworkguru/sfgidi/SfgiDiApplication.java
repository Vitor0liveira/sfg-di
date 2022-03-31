package jv.springframeworkguru.sfgidi;

import jv.springframeworkguru.sfgidi.controller.ConstructorInjectedController;
import jv.springframeworkguru.sfgidi.controller.MyController;
import jv.springframeworkguru.sfgidi.controller.PropertyInjectedController;
import jv.springframeworkguru.sfgidi.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgiDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SfgiDiApplication.class, args);

		MyController myController = (MyController) context.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);

		System.out.println("------- Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------- Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());

	}

}
