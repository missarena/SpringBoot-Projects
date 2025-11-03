package com.example;

import com.example.config.AppConfig;
import com.example.controller.userController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class mainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        userController controller = applicationContext.getBean( userController.class);
        controller.createUser("Sadiya");
        controller.createUser("Sadiya2");
        controller.listUsers();
    }
}
