package class6;

import java.util.Scanner;

public class LogicalExGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *
Write a program that will read three inputs of scores (quiz, mid term, and final scores) 
and determine the grade based on the following rules: 
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your Quiz score ");
		double quiz = input.nextInt();
		System.out.println("Please enter your midterm score ");
		double midterm = input.nextInt();
		System.out.println("Please enter your Final score ");
		double fina = input.nextInt();
		
		double average=(quiz+midterm+fina)/3;
		String grade;

		if (average >= 90 && average<=100) {
			grade = "A";

		} else if (average >= 70 && average <90) {
			grade = "B";

		} else if (average >=50 && average <70) {
			grade = "C";

		} else if (average< 50 && average>0) {
			grade = "F";
		} else {
			System.out.println("Please enter valid score!");
			grade = "None";
		}
		System.out.println("Grade "+grade);
		
		
		
	}

}
