package com.example.demo.io.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class IndexController {
	@GetMapping
	public String getIndex() {
		return "Aww.. shit here we go again!";
	}
}
