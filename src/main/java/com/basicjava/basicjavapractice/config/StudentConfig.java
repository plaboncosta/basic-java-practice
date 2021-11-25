package com.basicjava.basicjavapractice.config;

import com.basicjava.basicjavapractice.model.Student;
import com.basicjava.basicjavapractice.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student plabon = new Student(
                    "Plabon Costa",
                    "plaboncosta@gmail.com",
                    LocalDate.of(1998, Month.SEPTEMBER, 8),
                    23
            );

            Student prince = new Student(
                    "Prince Costa",
                    "princecosta@gmail.com",
                    LocalDate.of(1997, Month.SEPTEMBER, 8),
                    21
            );

            studentRepository.saveAll(
                    List.of(
                            plabon,
                            prince
                    )
            );
        };
    }
}
