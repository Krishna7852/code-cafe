/* 
* @Author:Dhareppa Metri
* File:LeapYear.java
* Date:10/10/2016
* Purpose:To find out the entered 4-digit year is leap year or not.
**/
import com.bridgelabz.java.LeapYear;
import java.util.Scanner;
class LeapYear{
	public static void main(String[] args){
  		System.out.println("Enter the year to check leapyear?not:should be 4-digit");
  		Scanner sc=new Scanner(System.in);
  		/*To read the integer from the keyboard.*/
  		int year=sc.nextInt();
  		/*To check whether entered year is leap year or not.*/
  		boolean isLeap=((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
  		if(isLeap)
  			System.out.println(year+" "+"is a leapyear");
  		else
  			System.out.println(year+" "+"is not a leapyear");
	}	
}
