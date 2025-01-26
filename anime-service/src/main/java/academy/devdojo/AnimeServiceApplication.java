package academy.devdojo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@SpringBootApplication
@ComponentScan(basePackages = {"outside.devdojo", "academy.devdojo"}) // pra escaner o pacote outside.devdojo e instânciar seus beans
public class AnimeServiceApplication {

    public static void main(String[] args) {
        var application = SpringApplication.run(AnimeServiceApplication.class, args);

        Arrays.stream(application.getBeanDefinitionNames())
                .forEach(System.out::println);

    }

}
