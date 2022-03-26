package org.sam.ConditionalStatements;

import java.util.Scanner;

/*
 The switch statement or switch case in java is a multi-way branch statement. Based on the value of the expression given, 
 different parts of code can be executed quickly. The given expression can be of a primitive data type such as 
 int, char, short, byte, and char.
 */

public class Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a rank:");
		int rank= sc.nextInt();
		
		switch(rank){
		case 1 : System.out.println("1st Rank");
		break; //If we do not use this break it will print the all ranks while execution
		
		case 2 : System.out.println("2nd Rank");
		break;
		
		case 3 : System.out.println("3rd Rank");
		break;
		
		default : System.out.println("Enter correct value");
		}
	}

}
