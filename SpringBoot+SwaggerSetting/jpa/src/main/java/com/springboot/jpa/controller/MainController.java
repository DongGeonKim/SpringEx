package com.springboot.jpa.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.jpa.data.dto.ProductResponseDto;

@Controller
public class MainController {
	
	@GetMapping("/")
    public String main() {
        return "main";
    }
}
