package com.kata;

public class FizzBuzz {

	

	public String computeFizzBuzz(int number) {	

		if (numberDivisibleBy3(number) && numberDivisibleBy5(number))
			return "FizzBuzz";
		else if (numberDivisibleBy3(number))
			return "Fizz";
		else if (numberDivisibleBy5(number))
			return "Buzz";
		else
			return String.valueOf(number);

	}
	
	public boolean numberDivisibleBy3 (int number) {
		
		if (number % 3 == 0)
		return true;
		else
		return false;
		
	}

	
   public boolean numberDivisibleBy5 (int number) {
		
		if (number % 5 == 0)
		return true;
		else
		return false;
		
	}
}
