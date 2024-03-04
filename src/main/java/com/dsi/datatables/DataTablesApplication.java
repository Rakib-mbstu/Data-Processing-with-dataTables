package com.dsi.datatables;

import com.dsi.datatables.entity.Student;
import com.dsi.datatables.repository.StudentRepository;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DataTablesApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataTablesApplication.class, args);
    }
}
