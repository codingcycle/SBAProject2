package com.eval.coronakit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eval.coronakit.service.ProductService;

@Controller
public class HomeController {
	private static final int INITIAL_PAGE = 0;
	private ProductService productService = null;

	@Autowired
	public HomeController(ProductService productService) {
		this.productService = productService;
	}

	@RequestMapping("/")
	public String index() {
		return "index";

	}

	@RequestMapping("/home")
	public String home() {
		return "main-menu";
	}

}
