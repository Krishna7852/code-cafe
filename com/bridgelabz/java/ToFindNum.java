/* 
* @Author:Dhareppa Metri
* File:ToFindNum.java
* Date:13/10/2016
* Purpose:To take an command-line argument N, asks you to think of a number between 0 and N-1, where N = 2^n, and 
* always guesses the answer with n questions.
**/
import com.bridgelabz.java.ToFindNum;
import java.util.Scanner;
class ToFindNum{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of steps you want");
		//Read integer from the keyboard
		int steps=sc.nextInt();
		int result = 1,N;
		boolean check;
		//To calculate N value
		for(int i=1;i<=steps;i++){
			result = result*2;
		}
		N = result;
		System.out.println("Imagine the number between 1 to "+N);
		int first = 1;
		int last = N/2;
		int i=2,j=4;
		//To perform n Number of trials
		for(int k=1;k<steps;k++){
			System.out.println("Is Your number Present Between "+first+" to "+last+"??\ntrue or false");
			check = sc.nextBoolean();
			if(check){
			      N=N/2;
			      last = last-((last-first+1)/2);
		
			}
			else{
				first = first+N/i;
				last = last+N/j;
				i = i+i;
				j = j+j;	
			}
		}
		System.out.println("Is Your number is "+first+"?? \ntrue or false");
		check = sc.nextBoolean();
		if(check)
			System.out.println("Your number is: "+(first));
		else
			System.out.println("Your number is: "+(last+1));
	}
}
		
		
		
