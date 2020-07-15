package com.codingdojo.calculatorfirstpart;
import java.io.*;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		calc.setOperandOne(10.5);
		calc.setOperation("+");
		calc.setOperandTwo(5.2);
		calc.performOperation();
        calc.getResult();
	}
}