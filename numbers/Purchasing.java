package com.numbers;
import java.util.*;
public class Purchasing {
public static void main(String[] args) {
	float purchase,discount,costpaid;
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the your purchasing amount");
	purchase=sc.nextFloat();
	if(purchase<500) {
		costpaid=purchase;
		System.out.println("\nSorry, there is no discount to apply.");
	}
	else if(purchase<=500 && purchase<=1000){
		discount=(purchase*10)/100;
		costpaid=purchase-discount;
		System.out.println("\nYou've got 10% discount on the total Purchase!\"");
		System.out.println("\ndiscount amount is :"+discount);
		System.out.println("\nnow your pay only :" +costpaid);
	}
	else {
		discount=(purchase*20)/100;
		costpaid=purchase-discount;
		System.out.println("\nYou've got 20% discount on the total Purchase!\"");
		System.out.println("\ndiscount amount is :"+discount);
		System.out.println("\nnow your pay only:" +costpaid);
		
}
}
}