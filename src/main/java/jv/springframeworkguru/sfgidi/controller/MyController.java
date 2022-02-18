package jv.springframeworkguru.sfgidi.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Hello Friend!");

        return "Hi Vitor";
    }
}
