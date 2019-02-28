package com.harrisonbrock.zoomagment;

import com.harrisonbrock.zoomagment.domain.TelephoneNumber;
import com.harrisonbrock.zoomagment.repositories.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZoomagmentApplication implements CommandLineRunner {

    @Autowired
    private ZooRepository zooRepository;

    public static void main(String[] args) {
        SpringApplication.run(ZoomagmentApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {


    }
}
