package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServices;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingServices greetingServices;

    public MyController(GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String sayHello(){
        return greetingServices.sayGreeting();
    }

}
