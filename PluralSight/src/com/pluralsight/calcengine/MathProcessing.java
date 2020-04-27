package com.pluralsight.calcengine;

public interface MathProcessing {

	String SEPARATOR = " ";

    // m�todos
    String getKeyword(); // add
    char getSymbol(); // +
    double doCalculation (double leftVal, double rightVal);

}
