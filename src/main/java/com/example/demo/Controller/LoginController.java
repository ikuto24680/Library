package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.form.LoginForm;

@Controller
@RequestMapping("/")
public class LoginController {

	@GetMapping("/")
	public String toLogin() {
		return "login";
	}
	
	@PostMapping("/login")
	public String login(LoginForm form) {
		System.out.println("loginlogin");
		return "top";
	}
}