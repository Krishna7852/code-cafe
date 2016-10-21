/* 
* @Author:Dhareppa Metri
* File:Gambler.java
* Date:13/10/2016
* Purpose:Implementation of gambler problem.
**/
import com.bridgelabz.java.Gambler;
import java.util.Scanner;
class Gambler{
	public static void main(String[] args){
		int stake,goal = 100,trials,win=0,lose=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Stake");
		/* To read integer value from the keyboard.*/
		stake = sc.nextInt();
		System.out.println("Enter number of trials");
		/*To read integer value from the keyboard.*/
		trials = sc.nextInt();
		int points =stake;
		int m = trials;
		/*To calculate the points i.e increment ponts value by 1 when he won,else decrement by 1.*/
		while(points>0 && points<goal && trials>0){
				double rand = Math.random(); 
				/*Threshold value.*/
				if(rand<0.5){s
					points++;
					win++;
				}
				else{
					points--;
					lose++;
				}
				trials--;
			}
	
		System.out.println("percentage of winning bet :"+100*win/m+"%");
		System.out.println("percentage of Losing bet :"+100*lose/m+"%");
		
		if(points == goal){
			System.out.println("player Won, Stake = "+points);
		}
		else{
			System.out.println("Player Lose, Stake = "+points);
		}
	}
}
