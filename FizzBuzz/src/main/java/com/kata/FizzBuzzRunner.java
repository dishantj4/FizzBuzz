package com.kata;

public class FizzBuzzRunner {

	public static void main(String[] args) {
		
		fizzBuzzRunner(1, 100);
	}
	
	public static void fizzBuzzRunner(int startNumner, int endNumber) {
		for(int i = startNumner; i<=endNumber; i++) {
			System.out.println(new FizzBuzz().computeFizzBuzz(i));
		}
	}

}
