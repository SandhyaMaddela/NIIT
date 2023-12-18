package com.jap.calculator;

public class ScientificCalculator {

	public double cielOfANumber(float num) throws CalculatorException
	{
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
		//or else call ceil method of Math class and return the value
		if(num<=0){
			throw new CalculatorException("num less than zero");
		}else{
			return Math.ceil(num);
		}
	}
	
	public double floorOfANumber(float num) throws CalculatorException
	{
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
		//or else call floor method of Math class and return the value
		if(num<=0){
			throw new CalculatorException("can't be zero");
		}
		else{
			return Math.floor(num);
		}

	}
	
    public long power(int num1, int num2) throws CalculatorException {
		//if num1 is less than num2 than throw the userdefined exception with proper message
		//else use Math pow method and return the value
		if(num1<num2){
			throw new CalculatorException("can't be zero");
		}
		else{
			return (long)Math.pow(num1,num2);
		}

    }
    
    public double squareRoot(int num) throws CalculatorException
    {
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
			//or else call sqrt method of Math class and return the value

		if(num<=0){
			throw new CalculatorException("can't be less than zero");
		}
		else{
			return Math.sqrt(num);
		}
    }

	public static void main(String[] args) {
		ScientificCalculator scientificCalculator = new ScientificCalculator();
		try {
			scientificCalculator.cielOfANumber(10);
		} catch (CalculatorException e) {
			throw new RuntimeException(e);
		}
		//Call all the methods one by one and surround them by try and respective catch blocks.
		try{
			scientificCalculator.floorOfANumber(9.8f);
		} catch (CalculatorException e){
			throw new RuntimeException(e);
		}

		try{
			scientificCalculator.power(2,3);
		} catch (CalculatorException e){
			throw new RuntimeException(e);
		}

		try{
			scientificCalculator.squareRoot(-5);
		} catch (CalculatorException e){
			throw new RuntimeException(e);
		}

	}
}
