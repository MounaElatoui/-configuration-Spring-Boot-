package com.example.loggers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationRunner implements CommandLineRunner {
 
    private static final Logger logger = LoggerFactory.getLogger(MyApplicationRunner.class);

    @Override
    public void run(String... args) throws Exception {
        logger.info("Application started");

        int numerator = 10;
        int denominator = 0;

        try {
            int result = divide(numerator, denominator);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            logger.error("Error: Division by zero occurred.", e);
        }

        logger.info("Application finished");
    }

    private int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}
/*package com.example.loggers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationRunner implements CommandLineRunner {
 
    private static final Logger logger = LoggerFactory.getLogger(MyApplicationRunner.class);

    @Override
    public void run(String... args) throws Exception {
        logger.info("Application started");

        int numerator = 10;
        int denominator = 0;

        if (denominator != 0) {
            try {
                int result = divide(numerator, denominator);
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                logger.error("Error: Division by zero occurred.", e);
            }
        } else {
            logger.error("Error: Division by zero attempted. Denominator cannot be zero.");
        }

        logger.info("Application finished");
    }

    private int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}*/

