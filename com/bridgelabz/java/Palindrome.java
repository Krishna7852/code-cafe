/* 
* @Author:Dhareppa Metri
* File:Palindrome.java
* Date:22/10/2016
* Purpose:To check the given string is palindrome or not using deQueue class.
**/
import com.bridgelabz.java.Palindrome;
import com.bridgelabz.java.deQueue;
import java.util.Scanner;
class Palindrome{
	public static void main(String[] args){
        int count=0;
		Scanner sc=new Scanner(System.in);
		deQueue dq=new deQueue();
		System.out.println("Enter the string");
		/* 
		* To read the string from the keyboard.
		**/
		String str=sc.next();
		/*
		* To add the elements to the deQueue
		**/
		for(int i=0;i<str.length();i++){
			dq.enQueue(str.charAt(i));
		}
		int size=dq.getSize();
		System.out.println(size);
		while(count<size/2){
		     count++;
			if(dq.removeFront().equals(dq.removeRear())!=true){
				System.out.println("The given  string is not  palindrome");
				break;
			}
		}
		if(count>=size/2){
		System.out.println("The given String is palindrome");    		
	}	        		
}
}
	                      
	                      
	               
