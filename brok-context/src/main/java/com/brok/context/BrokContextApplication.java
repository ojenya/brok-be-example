package com.brok.context;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BrokContextApplication {

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(15000); // Задержка старта: третий сервис — 15 сек
        SpringApplication.run(BrokContextApplication.class, args);
    }
}
