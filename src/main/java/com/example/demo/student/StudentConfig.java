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
    CommandLineRunner commandLineRunner(StudentRepository repository) {
//        return  args -> {
//          Student filip = new Student(
//                    "Filip",
//                    LocalDate.of(1998, Month.MAY, 7),
//                    "test@test.com"
//                  );
//            Student ane = new Student(
//                    "Ane",
//                    LocalDate.of(2001, Month.MAY, 7),
//                    "ane@test.com"
//            );
//            repository.saveAll(
//                    List.of(filip,ane)
//            );
//        };
        return null;
    }
}
