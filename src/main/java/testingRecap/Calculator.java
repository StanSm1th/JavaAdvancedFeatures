package testingRecap;

import org.apache.log4j.Logger;

public class Calculator {

    private static final Logger LOGGER = Logger.getLogger(Calculator.class);

    public int add (int firstNumber, int secondNumber){
        LOGGER.info("Adding two numbers " + firstNumber + " and " + secondNumber);
        return firstNumber + secondNumber;
    }

    public int addMultipleNumbers (int[] numbers) {
        int totalSum = 0;
        for (int number : numbers) {
            totalSum += number;
        }

        return totalSum;
    }
}
