package com.project.cloud.as;

import com.project.cloud.as.service.impl.AccountServiceImpl;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class AccountServiceApplicationTest {
    public static void main(String[] args) {
        SpringApplication.run(AccountServiceApplicationTest.class, args);
    }

}
