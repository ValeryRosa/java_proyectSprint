package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class IndexControl {
	
	@GetMapping({"/index","/","/home"})
	public String index(Model model) {
		return "index";	
	}
	@GetMapping({"/catalogo","catalog"})
	public String catalogo(Model model) {
		return "catalogo";	
	}
	@GetMapping({"/about"})
	public String about(Model model) {
		return "about";	
	}
	@GetMapping({"/bot","/Bot"})
	public String bot(Model model) {
		return "index";	
	}
}
