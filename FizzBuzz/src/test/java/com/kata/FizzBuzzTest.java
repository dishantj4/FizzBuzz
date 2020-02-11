package com.kata;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	private FizzBuzz fizzBuzz;
	
	 @Before
	    public void init() {
		  fizzBuzz = new FizzBuzz();	
	    }
	
	
	
	@Test
	public void numberMultipleBy3ShouldReurnFizz() {
		
	    assertEquals("Fizz", fizzBuzz.computeFizzBuzz(3));
			
	}
	
	@Test
	public void numberMultipleBy5ShouldReurnBuzz() {
			
	    assertEquals("Buzz", fizzBuzz.computeFizzBuzz(5));
			
	}

	
	@Test
	public void numberMultipleBy3and5ShouldReurnFizzBuzz() {
			
	    assertEquals("FizzBuzz", fizzBuzz.computeFizzBuzz(15));
			
	}
	
	@Test
	public void numberOtherThanMultiplesOf3and5ShouldReurnSameNumber() {
	
	    assertEquals("16", fizzBuzz.computeFizzBuzz(16));
			
	}
	
	
	
}
