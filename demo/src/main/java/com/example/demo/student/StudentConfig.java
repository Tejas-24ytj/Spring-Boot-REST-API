package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->{
         Student Tejas=new Student (
                "Tejas",
                "tblamkhade24@gmail.com",
                LocalDate.of(2002,Month.NOVEMBER,24)); 
            
        Student Rahul=new Student(
                    "Rahul",
                    "rahulshinde24@gmail.com",
                    LocalDate.of(2005,Month.SEPTEMBER,30)); 

        repository.saveAll(
            List.of(Tejas,Rahul)
        );};
    }
}
    

