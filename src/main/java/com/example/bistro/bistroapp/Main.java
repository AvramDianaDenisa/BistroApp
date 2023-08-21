package com.example.bistro.bistroapp;

import com.example.bistro.bistroapp.console.Consol;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.Applicat
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Main.class, args);
        Consol consol = context.getBean(Consol.class);
        consol.runConsole();
    }
}
