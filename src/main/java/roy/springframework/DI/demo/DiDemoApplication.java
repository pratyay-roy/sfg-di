package roy.springframework.DI.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import roy.springframework.DI.demo.controllers.MyController;

/**
 * Created by Roy
 */
@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		//run(...) returns a Application Context
		ApplicationContext ctx =  SpringApplication.run(DiDemoApplication.class, args);

		/*
		Using the context Spring is effectively creating
		a new instance of my controller object

		FUNDAMENTAL WAY OF DI where framework does all the management
		
		 */
		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);
	}

}
