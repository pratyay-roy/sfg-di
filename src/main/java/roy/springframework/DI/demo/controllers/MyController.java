package roy.springframework.DI.demo.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by Roy on 02-11-2021
 */

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello World");

        return "Hi Folks";
    }
}
