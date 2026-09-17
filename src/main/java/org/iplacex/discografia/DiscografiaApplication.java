package org.iplacex.discografia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiscografiaApplication {

    public static void main(String[] args) {
       
        System.setProperty("spring.data.mongodb.uri", "mongodb+srv://Alejandro_cabello:Iplacex2026@cluster-spring.wbmgo0e.mongodb.net/discografica-db?retryWrites=true&w=majority");
        
        SpringApplication.run(DiscografiaApplication.class, args);
    }
}