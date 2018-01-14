package org.roorkee.demo2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;

@Configuration
public class LoadDatabase {

    @Bean
    CommandLineRunner init(ChapterRepository repository){
        return args -> {
            Flux.just(
                    new Chapter("Introduction"),
                    new Chapter("Learning Spring Boot"),
                    new Chapter("Building RESTFul services"))
                    .flatMap(repository::save)
                    .subscribe(System.out::println);
        };
    }
}
