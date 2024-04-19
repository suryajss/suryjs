package com.numbers;
import java.util.*;
public class Smallest {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the 1st number");
		int a=sc.nextInt();
		System.out.println("enter the 2nd number");
		int b=sc.nextInt();
		System.out.println("enter the 3rd number");
		int c=sc.nextInt();
		if(a<b&&a<c) {
			System.out.println("the smallest is ="+a);
		}
		else if(b<a&&b<c) {
			System.out.println("the smallest is ="+b);

		}
		else {
			System.out.println("the smallest is ="+c);

		}
		
	}
}


