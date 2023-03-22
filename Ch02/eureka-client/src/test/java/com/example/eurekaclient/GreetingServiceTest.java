package com.example.eurekaclient;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.BDDAssertions.then;

/**
 * @author : ImKunYoung
 * @since : 2023-03-22
 * description    :
 * <p>
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-03-22        ImKunYoung       최초 생성
 */
@SpringBootTest
@ActiveProfiles("test")
class GreetingServiceTest {

    @Autowired
    GreetingService greetingService;


    @Test
    void testGreetingService() {
        String response = greetingService.greet("user");
        then(response).contains("Hi! User");
    }
}
