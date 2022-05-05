package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student marian = new Student(
                    "Marian",
                    "marian@gmail.com",
                    LocalDate.of(2000, Month.APRIL,4)
            );
            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2003, Month.JANUARY,29)
            );

            repository.saveAll(
                    List.of(marian, alex)
            );
        };
    }

}
