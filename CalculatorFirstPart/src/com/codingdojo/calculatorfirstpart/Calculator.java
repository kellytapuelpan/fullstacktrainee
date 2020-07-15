package com.codingdojo.calculatorfirstpart;
import java.io.*;

public class Calculator implements Serializable {
	private double operandOne;
	private double operandTwo;
	private String operation;
	private double result;
	
	public double getOperandOne() {
		return operandOne;
	}
	
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	
	public double getOperandTwo() {
		return operandTwo;
	}
	
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	
	public String getOperation() {
		return operation;
	}
	
	public void setOperation(String operation) {
		if(operation == "+" || operation == "-" || operation == "*" || operation == "/") {
			this.operation = operation;
		} else {
			System.err.println("ERROR");
		}
	}
	
	public void getResult() {
		System.out.println(this.result);
	}
	
	public void performOperation() {
		if(getOperation() == "+") {
			this.result = getOperandOne() + getOperandTwo();
		} else if(getOperation() == "-") {
			this.result = getOperandOne() - getOperandTwo();
		} else if(getOperation() == "*") {
			this.result = getOperandOne() * getOperandTwo();
		} else if(getOperation() == "/") {
			this.result = getOperandOne() / getOperandTwo();
		} else {
			System.err.println("ERROR");
		}
	}
}