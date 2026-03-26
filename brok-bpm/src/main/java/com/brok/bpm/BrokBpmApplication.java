package com.brok.bpm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BrokBpmApplication {

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(10000); // Задержка старта: второй сервис — 10 сек
        SpringApplication.run(BrokBpmApplication.class, args);
    }
}
