/* 
* Author:Dhareppa Metri
* File:StringTemplate.java
* Date:11/10/2016
* Purpose:To dispaly the message with proper usrename i.e "Hello <username> how are you" on screen.
**/
import com.bridgelabz.java.StringTemplate;
import java.util.Scanner;
class StringTemplate{
  	public static void main(String[] args){
  	System.out.println("Enter the User name");
  	Scanner sc1=new Scanner(System.in);
  	//To read the integer from the keyboard.
  	String str=sc1.next();
  	System.out.println("Hello"+" "+str+" "+"how are you");
	}
}
