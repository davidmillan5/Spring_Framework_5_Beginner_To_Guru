package guru.springframework.sfgdi.services;

public class GreetingServicesImpl implements GreetingServices {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
