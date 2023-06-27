package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServices;

public class ConstructorInjectedController {

    private final GreetingServices greetingServices;

    public ConstructorInjectedController(GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String getGreeting() {
        return greetingServices.sayGreeting();
    }
}
