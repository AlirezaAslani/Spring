package spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import spring.services.GreetingService;
import spring.services.OutputService;
import spring.services.TimeService;

@Configuration
@PropertySource("classpath:application.properties")
public class ApplicationConfig {

    @Value("${app.greeting}")
    private String greeting;

    @Value("${app.name}")
    private String name;

    @Value("#{new Boolean(environment['spring.profiles.active']!='Dev')}")
    private boolean is24;

    @Autowired(required = false)
    private GreetingService greetingService;

    @Autowired(required = false)
    private TimeService timeService;


    @Bean
    public TimeService timeServiceTest() {return new TimeService(is24); }

    @Bean
    public OutputService outputService(){
        return new OutputService(greetingService, timeService, name);
    }

    @Bean
    public GreetingService greetingService(){
        return new GreetingService(greeting);
    }
}
