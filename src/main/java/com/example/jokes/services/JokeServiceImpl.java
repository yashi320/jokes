package com.example.jokes.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {

	@Override
	public String getJokes() {
		return (new ChuckNorrisQuotes()).getRandomQuote();
	}
}
