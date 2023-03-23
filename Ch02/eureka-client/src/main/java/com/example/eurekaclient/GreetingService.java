package com.example.eurekaclient;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

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
@RequiredArgsConstructor
@Service
public class GreetingService {

    private final RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "fallbackGreeting", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000")
    })
    public String greet(String username) throws InterruptedException {
        URI uri = URI.create("http://localhost:8080/greeting/" + username);
        return this.restTemplate.getForObject(uri, String.class);
    }

    public String fallbackGreeting(String username) {
        return "Hi! there";
    }

}
