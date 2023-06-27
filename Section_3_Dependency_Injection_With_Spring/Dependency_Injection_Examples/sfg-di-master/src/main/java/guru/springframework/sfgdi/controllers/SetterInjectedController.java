package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServices;

public class SetterInjectedController {

    private GreetingServices greetingServices;

    public void setGreetingServices(GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String getGreeting() {
        return greetingServices.sayGreeting();
    }
}
