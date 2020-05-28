package com.company;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		/////////////// HW 3 = homework5+homework6 ////////////////

//		Scanner scanner = new Scanner(System.in);
//		Random random = new Random();

		// 5.1
//		System.out.println("Sum of numbers in array is "+sumOfNumbers(generateSeveralNumbers(2)));

		// 5.2
//		System.out.println("Product of numbers in array is "+ productOfNumbers(generateSeveralNumbers(2)));

		// 5.3
//		System.out.println("Cube of product of numbers in array is " + cubeOfProductOfNumbers(generateSeveralNumbers(2)));
//		int product = productOfNumbers(generateNumbers(2));
//		System.out.println("Cube of product of numbers in array is " + cubeOfNumber(product));

		// 5.4
//		System.out.println("Smallest number among inputs is " + findMinimum(generateSeveralNumbers(3)));

		// 5.5
//		System.out.println("Middle character of given word is: " + getMiddleCharacter(generateString()));

		// 5.6
//		System.out.println("Number of words in sentence is: " + countNumberOfWords(generateString()));

		// 5.7
//		System.out.println("Fact of given year being leap is: " + isYearLeap(2012));

		// 5.8
//		printIfPasswordValid(generateString());

		// 5.9
//		int radius = generateNumber();
//		System.out.println("Area of circle with radius = " + radius + " is " + areaOfCircle(radius));
//		System.out.println("Circumference of circle with radius = " + radius + " is " + circumferenceOfCircle(radius));

		// 5.10
//		printAreaPerimeterOfTriangle(generateSeveralNumbers(3));

		// 5.11
//		int[] array = new int[10];
//		fillArrayWithRandomIntegers(array);
//		System.out.print("Array : ");
//		printArray(array);

		// 5.12
//		int[] array = new int[10];
//		fillArrayWithRandomIntegers(array);
//		System.out.print("Array : ");
//		printArray(array);
//		System.out.print("Array sorted in ascending order is : ");
//		printArray(sortAscendingOrder(array));

		// 5.13
//		int[] array = new int[10];
//		fillArrayWithRandomIntegers(array);
//		System.out.print("Array : ");
//		printArray(array);
//		System.out.print("Array sorted in descending order is : ");
//		printArray(sortAscendingOrder(array));

		// 5.14
//		printPrimesTillGivenNumber(100);

		// 5.15
//		int[] array = new int[10];
//		System.out.println("Array: ");
//		fillArrayWithRandomIntegers(array);
//		printArray(array);
//		reverseArray(array);
//		System.out.println("Reversed array will be: ");
//		printArray(array);

		// 5.16
//		System.out.println(isPalindrome(generateString()));

		// 5.17
//		System.out.println("Factorial of given number is: "+factorial(generateNumber()));
	}

	// TODO: Methods public or private?
	public static int[] generateSeveralNumbers(int countToGenerate){
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[countToGenerate];
		for (int i = 0; i < countToGenerate; i++) {
			System.out.print("Number " + (i+1) + ": ");
			array[i] = scanner.nextInt();
		}
		return array;
	}

	public static int sumOfNumbers(int[] array){
		int sum = 0;
		for (int element:array) {
			sum+=element;
		}
		return sum;
	}

	public static int productOfNumbers(int[] array){
		int product = 1;
		for (int element:array) {
			product*=element;
		}
		return product;
	}

	// which one out of following two is wanted?
	public static int cubeOfProductOfNumbers(int[] array){
		int product = 1;
		for (int element:array) {
			product*=element;
		}
		return (int)Math.pow(product,3);
	}

	public static int cubeOfNumber(int number){
		return (int)Math.pow(number,3);
	}

	public static int findMinimum(int[] array){
		int smallest = array[0];
		for (int element: array) {
			if(smallest > element) smallest = element;
		}
		return smallest;
	}

	public static String generateString(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Your string is : ");
		return scanner.nextLine();
	}

	public static char getMiddleCharacter(String word){
		return word.charAt(word.length()/2 + 1);
	}

	public static int countNumberOfWords(String sentence){
		return sentence.split(" ").length;
	}

	public static int generateNumber(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Insert a number - ");
		return scanner.nextInt();
	}

	public static Boolean isYearLeap(int year){
		if (year%400==0) return true;
		if(year%4==0 && year%100!=0) return true;
		return false;
	}

	public static void printIfPasswordValid(String password){
		if(password.length()>=10 && password.matches("[a-zA-Z0-9]*")){
			int count = 0;
			for (int i = 0; i < password.length(); i++) {
				if(Character.isDigit(password.charAt(i))) count+=1;
			}
			System.out.println("Your password is " + (count>=2?"Valid":"Not Valid"));
		}
		else System.out.println("Your password is Not Valid");
	}

	public static double areaOfCircle(int radius){
		return Math.PI*Math.pow(radius,2);
	}

	private static double circumferenceOfCircle(int radius){
		return Math.PI*2*radius;
	}

	private static boolean ifTriangleValid(int[] sidesOfTriangle){
		return sidesOfTriangle[0]+sidesOfTriangle[1]>sidesOfTriangle[2] && sidesOfTriangle[2]+sidesOfTriangle[1]>sidesOfTriangle[0] && sidesOfTriangle[0]+sidesOfTriangle[2]>sidesOfTriangle[1];
	}

	private static int perimeterOfTriangle(int[] sidesOfTriangle){
		return sidesOfTriangle[0]+sidesOfTriangle[1]+sidesOfTriangle[2];
	}

	private static double areaOfTriangle(int[] sides){
		int halfPerimeter = perimeterOfTriangle(sides)/2;
		return Math.sqrt(halfPerimeter*(halfPerimeter-sides[0])*(halfPerimeter-sides[1])*(halfPerimeter-sides[2]));
	}

	private static void printAreaPerimeterOfTriangle(int[] sidesOfTriangle){
		if(ifTriangleValid(sidesOfTriangle)){
			System.out.println("Area of triangle is " + areaOfTriangle(sidesOfTriangle));
			System.out.println("Perimeter of triangle is " + perimeterOfTriangle(sidesOfTriangle));
		}
		else System.out.println("Triangle is not valid");
	}

	public static int[] fillArrayWithRandomIntegers(int[] array) {
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(99 - 10) + 10;
		}
		return array;
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static int[] sortAscendingOrder(int[] array) {
		Arrays.sort(array);
		return array;
	}

	public static int[] sortDescendingOrder(int[] array) {
		sortAscendingOrder(array);
		for (int i = 0; i < array.length / 2; i++) {
			int temporary = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temporary;
		}
		return array;
	}

	public static Boolean isPrime(int givenNumber){
		for(int i = 1;i<=Math.sqrt(givenNumber);i++){
			if (givenNumber%i==0 && i!=1 || givenNumber ==1){
				return false;
			}
		}
		return true;
	}

	public static void printPrimesTillGivenNumber(int number){
		System.out.println("All primes less than " + number + " are:");
		for (int i = 2; i < number; i++) {
			if(isPrime(i)) System.out.println(i);
		}
	}

	public static int[] reverseArray(int[] array){
		for(int i = 0; i < array.length / 2; i++)
		{
			int temporary  = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temporary;
		}
		return array;
	}

	public static String isPalindrome(String word){
		for (int i = 0; i < word.length()/2; i++) {
			if(word.charAt(i)!=word.charAt(word.length()-1-i)) return "Word is Not palindrome.";
		}
		return "Word is a palindrome.";
	}

	public static int factorial(int number){
		int product = 1;
		for (int i = 1; i <= number; i++) {
			product*=i;
		}
		return product;
	}



}
