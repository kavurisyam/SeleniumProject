package org.sam.ConditionalStatements;

import java.util.Scanner;

public class Elseif {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);  // To scan the entered value from the user.
	
	System.out.println("Enter a number:"); //To give the value from the user.
	
	int num= sc.nextInt(); // To store the user entered value.
	
	if(num>85) {
		System.out.println("A grade");
	}
		else if(num>70) {
			System.out.println("B grade");
		}
		else if(num>55) {
			System.out.println("C grade");
		}
		else if(num>45) {
			System.out.println("D grade");
		}
		else {
			System.out.println("Fail");
		}
	}
}

