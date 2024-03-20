package com.example.hiber;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HiberApplication implements CommandLineRunner {

   public static void main(String[] args) {
      SpringApplication.run(HiberApplication.class, args);
   }

   @Override
   public void run(String... args) {
   }

}