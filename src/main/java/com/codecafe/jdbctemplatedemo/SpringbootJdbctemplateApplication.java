package com.codecafe.jdbctemplatedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.codecafe.jdbctemplatedemo.dao.PersonJdbcDAO;
import com.codecafe.jdbctemplatedemo.entity.Person;

@SpringBootApplication
public class SpringbootJdbctemplateApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(SpringbootJdbctemplateApplication.class);

    @Autowired
    private PersonJdbcDAO personJdbcDAO;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJdbctemplateApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        logger.info("All users before -> {}", personJdbcDAO.findAll());

        logger.info("User id 10001 -> {}", personJdbcDAO.findById(10001));

        logger.info("Deleting id 10002 -> No of Rows Deleted - {}", personJdbcDAO.deleteById(10002));

        logger.info("Inserting id 10004 -> {}", personJdbcDAO.insert(new Person(10004, "Tom", "Germany", new Date())));

        Person p = personJdbcDAO.findById(10003);
        p.setLocation("Amsterdam");
        logger.info("Update id 10003 -> No of Rows Updated - {}", personJdbcDAO.update(p));

        logger.info("All users after -> {}", personJdbcDAO.findAll());

    }

}
