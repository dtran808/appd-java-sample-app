package sample;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@EnableAutoConfiguration
public class Application extends SpringBootServletInitializer {

    public static void main(String... args) {

        new SpringApplicationBuilder(Application.class).run(args);

    }

}
