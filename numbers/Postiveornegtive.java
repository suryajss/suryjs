package com.numbers;
import java.util.*;
public class Postiveornegtive {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		int number = scanner.nextInt();
			if(number>0) {
				System.out.println("postive number");
			}
			else if(number<0) {
				System.out.println("negative number");
			}
			else {
				System.out.println("exit");
			}

			
		
		System.out.println("exit the program");
	}
}
