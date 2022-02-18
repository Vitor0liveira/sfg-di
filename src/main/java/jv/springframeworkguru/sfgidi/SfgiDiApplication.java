package jv.springframeworkguru.sfgidi;

import jv.springframeworkguru.sfgidi.controller.MyController;
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
	}

}
