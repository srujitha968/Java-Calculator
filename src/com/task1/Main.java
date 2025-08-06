package com.task1;

import java.util.Scanner;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	public void run() {
		Main m = new Main();
		try {
			boolean flag = true;
			while(flag) {
				
				System.out.println("====================");
				System.out.println("choose any one operation");
				System.out.println("1. Addition");
				System.out.println("2. Subtraction");
				System.out.println("3. Multiplication");
				System.out.println("4. Division");
				System.out.println("5. Exit");
				System.out.println("=====================");
				int ch = sc.nextInt();
				
				switch(ch) {
					case 1: m.add();
							break;
							
					case 2: m.sub();
							break;
							
					case 3: m.mult();
							break;
							
					case 4: m.div();
							break;
							
					case 5: System.out.println("You are exited");
							flag= false;
							break;
					
					default : System.out.println("Please choose in the given options"); 
							   break;
				}
			}
		}catch(Exception e) {
			System.out.println(e + " Please Enter numbers only");
			sc.nextLine();
		}
	sc.close();	
	}
	
	public void add() {
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		
		int c = a+b;
		System.out.println("The sum of "+ a + " and "+b+ " is:- "+c);
	}
	
	public void mult() {
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		
		int c = a*b;
		System.out.println("The multiplication of "+ a + " and "+b+ " is:- "+c);
	}
	
	public void div() {
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		
		if(b==0) {
			System.out.println("Divisor shoould not be zero(0)");
			System.out.println("Enter the second number again: ");
			int d = sc.nextInt();
			int c = a/d;
			System.out.println("The division of "+ a + " and "+d+ " is:- "+c);
		}else {
			int c = a/b;
			System.out.println("The division of "+ a + " and "+b+ " is:- "+c);
		}
	}
	
	public void sub() {
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		
		int c = a-b;
		System.out.println("The subtraction of "+ a + " and "+b+ " is:- "+c);
	}
}
