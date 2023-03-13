package com.example.rutasspring.Controllers;

import com.example.rutasspring.dto.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public List <UserDto> getAll(){
        UserDto user1 = new UserDto();
        log.info("soy un log");
        UserDto user2 = UserDto.builder().name("stiven").build();
        return List.of(user1);
    }

}
