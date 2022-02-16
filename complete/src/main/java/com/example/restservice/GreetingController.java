package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@GetMapping("/person")
	public Person getPerson(@RequestParam(value = "fName") String firstName,@RequestParam(value = "lName") String lastName){

		return new Person(firstName,lastName);
	}

	@PostMapping("/person")
//	@RequestMapping(value="/person",method=RequestMethod.Post)
	public String createPerson(@RequestBody Person person){
		System.out.println(person);
		return "person is created";
	}
}
