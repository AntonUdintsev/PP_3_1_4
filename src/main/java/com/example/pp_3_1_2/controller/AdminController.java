package com.example.pp_3_1_2.controller;


import com.example.pp_3_1_2.model.User;
import com.example.pp_3_1_2.service.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(value = "/admin")
public class AdminController {
	private final UserService userService;


	public AdminController(UserService userService) {
		this.userService = userService;
	}


	@GetMapping()
	public String printAdmin(ModelMap model) {
		model.addAttribute("users", userService.getUsers());
		return "/admin/users";
	}
	@GetMapping(value = "/new")
	public String newUser (@ModelAttribute("user") User user){
		return "/admin/form";
	}

	@PostMapping ()
	public  String createUser (@ModelAttribute("user") User user) {
		userService.addUser(user);
		return "redirect:/admin";
	}

	@GetMapping (value = "/{id}")
	public String showUser (@PathVariable ("id") int id, ModelMap model){
		model.addAttribute("user",userService.showUser(id));
		return  "/admin/showUser";
	}
	@GetMapping (value = "/{id}/edit")
	public String editUser (ModelMap model, @PathVariable ("id") int id) {
		model.addAttribute("user", userService.showUser(id));
		return "/admin/edit";
	}

	@PatchMapping (value = "/{id}")
	public String updateUser (@ModelAttribute("user") User user, @PathVariable("id") int id){
		userService.updateUser(id,user);
		return "redirect:/admin";
	}
	@DeleteMapping (value = "/{id}")
	public String deleteUser (@PathVariable ("id") int id) {
		userService.deleteUser(id);
		return "redirect:/admin";
	}

}