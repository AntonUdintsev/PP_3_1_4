package com.example.pp_3_1_2;

import com.example.pp_3_1_2.dao.UserDaoImpl;
import com.example.pp_3_1_2.service.UserService;
import com.example.pp_3_1_2.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Pp312Application {

    public static void main(String[] args) {
        SpringApplication.run(Pp312Application.class, args);
    }

}
