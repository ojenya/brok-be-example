package com.brok.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BrokCoreApplication {

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(5000); // Задержка старта: первый сервис — 5 сек
        SpringApplication.run(BrokCoreApplication.class, args);
    }
}
