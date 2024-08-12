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

    @Autowired(required = false)
    private GreetingService greetingService;

    @Autowired(required = false)
    private TimeService timeService;

    @Bean
    @Profile("Dev")
    public TimeService timeServiceDev(){
        return new TimeService(true);
    }

    @Bean
    @Profile("!Dev")
    public TimeService timeServiceTest() {return new TimeService(false); }

    @Bean
    public OutputService outputService(){
        return new OutputService(greetingService, timeService, name);
    }

    @Bean
    public GreetingService greetingService(){
        return new GreetingService(greeting);
    }
}
