package com.numbers;
import java.util.*;
public class Pattern {
public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
System.out.println();
int n=sc.nextInt();
int i,j,k;
for(i=n;i>=1;i--) {
	for(j=n;j>=i;j--) {
		System.out.print(j);
	}
	for(k=1;k<i;k++) {
		System.out.print(i);
	}
	System.out.println();
}
}
}

