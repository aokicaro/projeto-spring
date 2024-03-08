package com.aoki.api.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.aoki.api.entities.User;
import com.aoki.api.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown","988888888", "maria@gmail.com"); 
        User u2 = new User(null, "Alex Green","977777777", "alex@gmail.com"); 

        userRepository.saveAll(Arrays.asList(u1,u2));
    }


}
