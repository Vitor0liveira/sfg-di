package jv.springframeworkguru.sfgidi.controller;

import jv.springframeworkguru.sfgidi.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
