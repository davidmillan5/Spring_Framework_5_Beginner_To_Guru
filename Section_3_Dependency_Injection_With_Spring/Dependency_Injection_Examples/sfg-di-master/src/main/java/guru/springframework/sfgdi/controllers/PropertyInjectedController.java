package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServices;

public class PropertyInjectedController {

    public GreetingServices greetingServices;

    public String getGreeting() {
        return greetingServices.sayGreeting();
    }
}
