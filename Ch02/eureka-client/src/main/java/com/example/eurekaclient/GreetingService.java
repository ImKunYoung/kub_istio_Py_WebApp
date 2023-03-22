package com.example.eurekaclient;

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
@Service
@RequiredArgsConstructor
public class GreetingService {

    private final RestTemplate restTemplate;


    public String greet(String username) {
        URI uri = URI.create("http://localhost:8080/greeting/" + username);
        return this.restTemplate.getForObject(uri, String.class);
    }



}
