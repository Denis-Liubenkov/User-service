package com.example.userservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;

@SpringBootTest
class UserServiceApplicationTests {

    @Autowired
    private DataSource dataSource;
    @Test
    void contextLoads() {
        assertNotNull(dataSource);
    }

}
