package learn.javamentor.calculator;

import java.util.List;
import java.util.Scanner;

public class Calculator {

	
	public static String IntegerToRomanNumeral(int input) {
	    if (input < 1 || input > 100)
	        return "Invalid Roman Number Value";
	    String s = "";
	    while (input >= 100) {
	        s += "C";
	        input -= 100;
	    }
	    while (input >= 90) {
	        s += "XC";
	        input -= 90;
	    }
	    while (input >= 50) {
	        s += "L";
	        input -= 50;
	    }
	    while (input >= 40) {
	        s += "XL";
	        input -= 40;
	    }
	    while (input >= 10) {
	        s += "X";
	        input -= 10;
	    }
	    while (input >= 9) {
	        s += "IX";
	        input -= 9;
	    }
	    while (input >= 5) {
	        s += "V";
	        input -= 5;
	    }
	    while (input >= 4) {
	        s += "IV";
	        input -= 4;
	    }
	    while (input >= 1) {
	        s += "I";
	        input -= 1;
	    }    
	    return s;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String greeting = "Input numbers: ";
		System.out.println(greeting);
		String toCalculate = scanner.nextLine();
		String[] twoNumbers = toCalculate.split("[+-/*]");
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		String strNum1 = twoNumbers[0];
		String strNum2 = twoNumbers[1];
		String[] arabNums = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
		String[] romanNums = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
		char[] operation = {'+', '-', '*', '/'};
		
		try {
			num1 = Integer.parseInt(twoNumbers[0]);
//			System.out.println(num1);
		}
		catch (Exception e) {
			if (strNum1.equals(romanNums[0])) {
				num3 = 1;
			} else if (strNum1.equals(romanNums[1])) {
				num3 = 2;
			} else if (strNum1.equals(romanNums[2])) {
				num3 = 3;
			} else if (strNum1.equals(romanNums[3])) {
				num3 = 4;
			} else if (strNum1.equals(romanNums[4])) {
				num3 = 5;
			} else if (strNum1.equals(romanNums[5])) {
				num3 = 6;
			} else if (strNum1.equals(romanNums[6])) {
				num3 = 7;
			} else if (strNum1.equals(romanNums[7])) {
				num3 = 8;
			} else if (strNum1.equals(romanNums[8])) {
				num3 = 9;
			} else if (strNum1.equals(romanNums[9])) {
				num3 = 10;
			} else {
				System.out.println("Error, repeat operation1");
			}
		}
		
		try {
			num2 = Integer.parseInt(twoNumbers[1]);
//			System.out.println(num2);
		}
		catch (Exception e) {
			if (strNum2.equals(romanNums[0])) {
				num4 = 1;
			} else if (strNum2.equals(romanNums[1])) {
				num4 = 2;
			} else if (strNum2.equals(romanNums[2])) {
				num4 = 3;
			} else if (strNum2.equals(romanNums[3])) {
				num4 = 4;
			} else if (strNum2.equals(romanNums[4])) {
				num4 = 5;
			} else if (strNum2.equals(romanNums[5])) {
				num4 = 6;
			} else if (strNum2.equals(romanNums[6])) {
				num4 = 7;
			} else if (strNum2.equals(romanNums[7])) {
				num4 = 8;
			} else if (strNum2.equals(romanNums[8])) {
				num4 = 9;
			} else if (strNum2.equals(romanNums[9])) {
				num4 = 10;
			} else {
				System.out.println("Error, repeat operation2");
			}
		}
		
		
		
		
		int result1 = 0;
		int result2 = 0;
		String result3 = "";
		
		if (num1 != 0 && num2 != 0) {
			if (toCalculate.indexOf("+") !=-1) {
				result1 = num1+num2;
//				System.out.println("+");
			} else if (toCalculate.indexOf("-") !=-1) {
				result1 = num1-num2;
//				System.out.println("-");
			} else if (toCalculate.indexOf("*") !=-1) {
				result1 = num1*num2;
//				System.out.println("*");
			} else if (toCalculate.indexOf("/") !=-1) {
				result1 = num1/num2;
//				System.out.println("/");
			} else {
				System.out.println("Error, reapeat operation3");
			}
			System.out.println(result1);
		} else if (num3 != 0 && num4 != 0){
			if (toCalculate.indexOf("+") !=-1) {
				result2 = num3+num4;
//				System.out.println("+");
			} else if (toCalculate.indexOf("-") !=-1) {
				result2 = num3-num4;
//				System.out.println("-");
			} else if (toCalculate.indexOf("*") !=-1) {
				result2 = num3*num4;
//				System.out.println("*");
			} else if (toCalculate.indexOf("/") !=-1) {
				result2 = num3/num4;
//				System.out.println("/");
			} else {
				System.out.println("Error, reapeat operation3");
			}
			result3 = IntegerToRomanNumeral(result2);
			System.out.println(result3);
		} else {
			System.out.println("Error input data");
		}
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
