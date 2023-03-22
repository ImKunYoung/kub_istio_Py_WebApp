package com.example.eurekaclient;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
@RestController
public class ApplicationRestController {

    @RequestMapping
    public String greeting(@PathVariable String user) {
        return "Hello! "+user;
    }
}
