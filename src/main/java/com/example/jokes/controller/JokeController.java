package com.example.jokes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.jokes.services.JokeServiceImpl;

@Controller
public class JokeController {

	JokeServiceImpl jokeServiceImpl;
	
	@Autowired
	public JokeController(JokeServiceImpl jokeServiceImpl) {
		this.jokeServiceImpl=jokeServiceImpl;
	}
	@RequestMapping("/")
	public String getJokes(Model model) {
		
		model.addAttribute("jokes", jokeServiceImpl.getJokes());
		return "chucknorris";
	}
}


/*
 * private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){

        model.addAttribute("books", bookRepository.findAll());

        return "books";
    }
 */