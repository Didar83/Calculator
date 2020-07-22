package learn.javamentor.calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String greeting = "Input numbers: ";
		System.out.println(greeting);
		String toCalculate = scanner.nextLine();
		String[] twoNumbers = toCalculate.split("[+-/*]");
		int num1 = 0;
		int num2 = 0;
		String strNum1 = twoNumbers[0];
		String strNum2 = twoNumbers[1];
		String[] arabNums = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
		String[] romanNums = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
		char[] operation = {'+', '-', '*', '/'};
		
//		if ((strNum1.equals(arabNums[0-9]) && strNum2.equals(romanNums[0-9])) ||  (strNum2.equals(arabNums[0-9]) && strNum1.equals(romanNums[0-9]))) {
//			System.out.println("Error, you inputted arabic and roman digits");
//		}
		
		if (strNum1.equals(arabNums[0]) || strNum1.equals(romanNums[0])) {
			num1 = 1;
		} else if (strNum1.equals(arabNums[1]) || strNum1.equals(romanNums[1])) {
			num1 = 2;
		} else if (strNum1.equals(arabNums[2]) || strNum1.equals(romanNums[2])) {
			num1 = 3;
		} else if (strNum1.equals(arabNums[3]) || strNum1.equals(romanNums[3])) {
			num1 = 4;
		} else if (strNum1.equals(arabNums[4]) || strNum1.equals(romanNums[4])) {
			num1 = 5;
		} else if (strNum1.equals(arabNums[5]) || strNum1.equals(romanNums[5])) {
			num1 = 6;
		} else if (strNum1.equals(arabNums[6]) || strNum1.equals(romanNums[6])) {
			num1 = 7;
		} else if (strNum1.equals(arabNums[7]) || strNum1.equals(romanNums[7])) {
			num1 = 8;
		} else if (strNum1.equals(arabNums[8]) || strNum1.equals(romanNums[8])) {
			num1 = 9;
		} else if (strNum1.equals(arabNums[9]) || strNum1.equals(romanNums[9])) {
			num1 = 10;
		} else {
			System.out.println("Error, repeat operation1");
		}
		
		System.out.println(num1);
		
		if (strNum2.equals(arabNums[0]) || strNum2.equals(romanNums[0])) {
			num2 = 1;
		} else if (strNum2.equals(arabNums[1]) || strNum2.equals(romanNums[1])) {
			num2= 2;
		} else if (strNum2.equals(arabNums[2]) || strNum2.equals(romanNums[2])) {
			num2 = 3;
		} else if (strNum2.equals(arabNums[3]) || strNum2.equals(romanNums[3])) {
			num2 = 4;
		} else if (strNum2.equals(arabNums[4]) || strNum2.equals(romanNums[4])) {
			num2 = 5;
		} else if (strNum2.equals(arabNums[5]) || strNum2.equals(romanNums[5])) {
			num2 = 6;
		} else if (strNum2.equals(arabNums[6]) || strNum2.equals(romanNums[6])) {
			num2 = 7;
		} else if (strNum2.equals(arabNums[7]) || strNum2.equals(romanNums[7])) {
			num2 = 8;
		} else if (strNum2.equals(arabNums[8]) || strNum2.equals(romanNums[8])) {
			num2 = 9;
		} else if (strNum2.equals(arabNums[9]) || strNum2.equals(romanNums[9])) {
			num2 = 10;
		} else {
			System.out.println("Error, repeat operation2");
		}

		System.out.println(num2);
//		char[] operationArray = toCalculate.toCharArray();
//		int result = 0;
//		
//		for (int i = 1; i < operationArray.length; i++) {
//			if (operationArray.equals(operation[0])) {
//				result = num1+num2;
//				System.out.println("Plus");
//			} else if (operationArray.equals(operation[1])) {
//				result = num1-num2;
//				System.out.println(result);
//			} else if (operationArray.equals(operation[2])) {
//				result = num1*num2;
//				System.out.println(result);
//			} else if (operationArray.equals(operation[3])) {
//				result = num1/num2;
//				System.out.println(result);
//			} else {
//				System.out.println("Error, reapeat operation3");
//			}
//		}
		
//		if (toCalculate.contains("+") {
//			System.out.println(num1+num2);
//		}
		if (toCalculate.indexOf("+") !=-1) {
			System.out.println(num1+num2);
			System.out.println("+");
		} else if (toCalculate.indexOf("-") !=-1) {
			System.out.println(num1-num2);
			System.out.println("-");
		} else if (toCalculate.indexOf("*") !=-1) {
			System.out.println(num1*num2);
			System.out.println("*");
		} else if (toCalculate.indexOf("/") !=-1) {
			System.out.println(num1/num2);
			System.out.println("/");
		} else {
			System.out.println("Error, reapeat operation3");
		}
		
	}

}
