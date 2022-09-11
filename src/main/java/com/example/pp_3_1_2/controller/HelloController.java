package com.example.pp_3_1_2.controller;


import com.example.pp_3_1_2.model.User;
import com.example.pp_3_1_2.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


@Controller
public class HelloController {

	@GetMapping("/")
	public String printWelcome() {
		return "/index";
	}

}