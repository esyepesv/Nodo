package com.spring.clasespring.Controllers;
import com.spring.clasespring.dto.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Hello {
    Person yo;
    @GetMapping
    public String fun(){
        return "hola";
    }
}
