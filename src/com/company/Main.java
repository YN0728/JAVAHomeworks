package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/////////////// HW 1 ////////////////

		// 1.1
		Scanner scanner = new Scanner(System.in);
		//
		//        int number1 = scanner.nextInt();
		//        int number2 = scanner.nextInt();
		//        System.out.println(number1+number2);

		// 1.2
		//        int num1 = scanner.nextInt();
		//        int divisor = scanner.nextInt();
		//        System.out.println(num1/divisor);

		// 1.3
		//        System.out.println(-5 + 8 * 6);
		//        System.out.println((55+9) % 9);
		//        System.out.println(20 + -3*5 / 8);
		//        System.out.println(5 + 15 / 3 * 2 - 8 % 3);

		// 1.4
		//        System.out.print("Input first number: ");
		//        int number1 = scanner.nextInt();
		//        System.out.print("Input second number: ");
		//        int number2 = scanner.nextInt();
		//        System.out.println(number1 + " x " + number2 + " = " + number1*number2);

		// 1.5
		//        System.out.print("Input a number: ");
		//        int number = scanner.nextInt();
		//        for (int i = 1; i < 11; i++) {
		//            System.out.println( number + " x " + i + " = " + number*i);
		//        }

		// 1.6
		//        System.out.print("Radius = ");
		//        double radius = scanner.nextDouble();
		//        System.out.println("Perimeter is - " + 2*Math.PI*radius);
		//        System.out.println("Area is - " + Math.PI*Math.pow(radius,2));

		// 1.7
		//        System.out.print("Input a degree in Fahrenheit: ");
		//        float fahrenheit = scanner.nextFloat();
		//        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + (fahrenheit-32)*5/9 + " in Celsius");

		// 1.8
		//        System.out.print("Input value for inch: ");
		//        float inch = scanner.nextFloat();
		//        double inchToMeter = 0.0245;
		//        System.out.println(inch + " inch is " + inch*inchToMeter + " meters");

		// 1.9
		//        System.out.print("Input number: ");
		//        int input = scanner.nextInt();
		//        System.out.println("Number is " + (input>=0?"positive":"negative"));

		// 1.10
		//        System.out.print("Input the 1st number: ");
		//        int number1 = scanner.nextInt();
		//        int maximumNumber = number1;
		//        System.out.print("Input the 2nd number: ");
		//        int number2 = scanner.nextInt();
		//        maximumNumber = maximumNumber>number2?maximumNumber:number2;
		//        System.out.print("Input the 3rd number: ");
		//        int number3 = scanner.nextInt();
		//        maximumNumber = maximumNumber>number3?maximumNumber:number3;
		//        System.out.println("The greatest: "+maximumNumber);

		//1.11
		//        int sum = 0;
		//        System.out.println("Input the 5 numbers : ");
		//        for (int i = 0; i < 5; i++) {
		//            int input = scanner.nextInt();
		//            sum+=input;
		//        }
		//        System.out.println("The sum of 5 no is : " + sum);
		//        System.out.println("The Average is " + (float)sum/5);

		// 1.12
		//        System.out.print("Input ");
		//        int number = scanner.nextInt();
		//        System.out.println(number%2==0?"Even":"Odd");


		////////////// HW 2 ////////////////

		// 2.1
		Random random = new Random();
		//        int number1 = random.nextInt(100-10) + 10;
		//        int number2 = random.nextInt(100-10) + 10;
		//        int sum = number1+number2;
		//        long sumLong = sum;
		//        System.out.println(sumLong);

		// 2.2
		//        int number1 = random.nextInt(100-10) + 10;
		//        int number2 = random.nextInt(100-10) + 10;
		//        int product = number1+number2;
		//        if(product%2 == 0) {
		//            long productLong = product;
		//            System.out.println(productLong);
		//
		//        }else{
		//            double productDouble = product;
		//            System.out.println(productDouble);
		//        }

		// 2.3
		//        int number = random.nextInt(100-10) + 10;
		//        double squareOfNumber = Math.pow(number,2);
		//        String squareToString = String.valueOf(squareOfNumber);
		//        System.out.println(squareToString);

		// 2.4
		//        int number = scanner.nex=tInt();
		//        int randomToChange;
		//        switch (number/100){
		//            case 0:
		//                randomToChange = random.nextInt(50);
		//                break;
		//            default:
		//                randomToChange = random.nextInt(number-50)+50;
		//        }
		//        String randomToString = String.valueOf(randomToChange);
		//        System.out.println(randomToString);

		// 2.5
		//        int number1 = random.nextInt();
		//        int number2 = random.nextInt();
		//        String sign = scanner.next();
		//        switch (sign){
		//            case "+":
		//                System.out.println(number1+number2);
		//                break;
		//            case "-":
		//                System.out.println(number1-number2);
		//                break;
		//            case "*":
		//                System.out.println(number1*number2);
		//                break;
		//            case "/":
		//                System.out.println(number1/number2);
		//                break;
		//            default:
		//                System.out.println("Enter one of the followings: +, -, *, /");
		//        }

		// 2.6
		//        int weekdayInt = scanner.nextInt();
		//        switch (weekdayInt){
		//            case 1:
		//                System.out.println("Monday");
		//                break;
		//            case 2:
		//                System.out.println("Tuesday");
		//                break;
		//            case 3:
		//                System.out.println("Wednesday");
		//                break;
		//            case 4:
		//                System.out.println("Thursday");
		//                break;
		//            case 5:
		//                System.out.println("Friday");
		//                break;
		//            case 6:
		//                System.out.println("Saturday");
		//                break;
		//            case 7:
		//                System.out.println("Sunday");
		//                break;
		//            default:
		//                System.out.println("Enter numbers from 1 to 7");
		//        }

		// 2.7
		//        String monthName = scanner.nextLine();
		//        switch (monthName){
		//            case "January": case "March": case "May": case "July": case "August": case "October": case "December":
		//                System.out.println("Month have 31 days");
		//                break;
		//            case "April": case "June": case "September": case "November":
		//                System.out.println("Month have 30 days");
		//                break;
		//            case "February":
		//                System.out.println("Month have 28 days");
		//                break;
		//            default:
		//                System.out.println("Enter valid month");
		//        }

		// 2.8
		//        int radius = 5;
		//        System.out.println("------------MENU-----------\n---> enter 1 for calculating area of the circle\n---> enter 2 for calculating perimeter of the circle\n---> enter 3 for exit.");
		//        int enteredNumber = scanner.nextInt();
		//        while (enteredNumber!=3){
		//            switch (enteredNumber){
		//                case 1:
		//                    System.out.println((double) Math.PI*Math.pow(radius,2));
		//                    break;
		//                case 2:
		//                    System.out.println((double) Math.PI*2*radius);
		//                    break;
		//                default:
		//                    System.out.println("Enter 1,2 or 3");
		//            }
		//            System.out.println("------------MENU-----------\n---> enter 1 for calculating area of the circle\n---> enter 2 for calculating perimeter of the circle\n---> enter 3 for exit.");
		//            enteredNumber = scanner.nextInt();
		//        }


		////////////// HW 3 ////////////////

		// 3.1
		//        for (int number = 1; number < 21; number++){
		//            System.out.println(number);
		//        }

		// 3.2
		//        for (int number = 1; number < 21; number++){
		//            if(number%3==0)
		//                continue;
		//            System.out.println(number);
		//        }

		// 3.3
		//		for (int number = -20; number < 61; number++) {
		//			if (number%2==0)
		//                System.out.println(number);
		//		}

		// 3.4
		//        for (int number = -20; number < 61; number++) {
		//            if (number%2!=0)
		//                System.out.println(number);
		//        }

		// 3.5
		//        System.out.println(100*(100+1)/2);

		// 3.6
		//        int count = (100-1)/2+1;
		//        int difference = 2;
		//        int sum = (2*1 + (count-1)*difference)*count/2;
		//        System.out.println(sum);

		// 3.7
		// as numbers are even(meaning symmetric, it is enough to find average of first and last)
		//        int first = 2;
		//        int last = 100;
		//        int sum = (first+last)/2;
		//        System.out.println(sum);

		// 3.8
		//        int sum = 0;
		//        for (int count = 0; count<10;count++){
		//            sum+= scanner.nextInt();
		//        }
		//        System.out.println("Sum of all inputs is "+sum);
		//        System.out.println("Aveareg of all inputs is "+(float)sum/10);

		// 3.9
		//        System.out.print("Input number of terms : ");
		//        int givenInteger = scanner.nextInt();
		//            for(int number =1;number<=givenInteger;number++){
		//                System.out.printf("Number is : %d and cube of the %d is : %d %n", number, number, (int)Math.pow(number,3));
		//            }

		// 3.10
		//        System.out.print("Input the number (Table to be calculated) : ");
		//        int givenInteger = scanner.nextInt();
		//        for (int count = 1; count < 11; count++){
		//            System.out.println(givenInteger + " X " + count + " = " + givenInteger*count);
		//        }

		// 3.11
		//        System.out.print("Input a number: ");
		//        int givenNumber = scanner.nextInt();
		//        Boolean isPrime = true;
		//        for(int i = 1;i<=Math.sqrt(givenNumber);i++){
		//            if (givenNumber%i==0 && i!=1 || givenNumber ==1){
		//                isPrime = false;
		//                break;
		//            }
		//        }
		//        System.out.println(isPrime?givenNumber + " is a prime number":givenNumber + " is Not a prime number.");

		// 3.12
		//        System.out.print("Input number of terms to display : ");
		//        int givenInteger = scanner.nextInt();
		//        int fibonacciPrevious = 0;
		//        int fibonacciNext = 1;
		//        System.out.println("Here is the Fibonacci series upto to " + givenInteger +" terms :");
		//        System.out.print (fibonacciPrevious + " ");
		//        for(int i = 1;i<givenInteger;i++){
		//            System.out.print(fibonacciNext + " ");
		//            int temporary = fibonacciNext;
		//            fibonacciNext += fibonacciPrevious;
		//            fibonacciPrevious = temporary;
		//        }

		// 3.13
		String givenString = "ROBOTS_WILL_KILL_ALL_HUMANZ";
		String reversedString = "";
		for (int index = givenString.length() - 1; index >= 0; index--) {
			reversedString += givenString.charAt(index);
		}
		System.out.println("Reversed string is: " + reversedString);


		scanner.close();
	}
}
