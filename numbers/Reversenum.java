package com.numbers;
import java.util.*;

public class Reversenum {
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	System.out.println("enter the nummber");
	int num=scanner.nextInt();
	int rev=0;
	while(num>0) {
		rev=rev*10 + num%10;
		num=num/10;
	}
	System.out.println(rev);
}
}
