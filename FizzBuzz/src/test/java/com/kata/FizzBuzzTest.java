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
	public void printForNumberMultipleBy3() {
		
	    assertEquals("Fizz", fizzBuzz.compute(3));
			
	}
	
	@Test
	public void printForNumberMultipleBy5() {
			
	    assertEquals("Buzz", fizzBuzz.compute(5));
			
	}

	
	@Test
	public void printForNumberMultipleBy3and5() {
			
	    assertEquals("FizzBuzz", fizzBuzz.compute(15));
			
	}
	
	@Test
	public void printForNumberOtherThanMultiplesOf3and5() {
	
	    assertEquals("16", fizzBuzz.compute(16));
			
	}
}
