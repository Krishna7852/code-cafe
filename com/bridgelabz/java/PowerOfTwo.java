/** 
* @Author:Dhareppa Metri
* File:PowerOfTwo.java
* Date:11/10/2016
* Purpose:This program takes a command-line argument N and prints a table of the powers of 2 that are less than or equal to 2^N.
*/
import com.bridgelabz.java.PowerOfTwo;
import java.util.Scanner;
class PowerOfTwo{
	public static void main(String[] args) {
     	System.out.println("Enter the number?less than 31");
        Scanner sc=new Scanner(System.in);
        /*To read the integer value from the keyboard.*/
      	int n=sc.nextInt();
      	int pow=1;
      	/*To calculate the power 2^n */
      	for(int i=0;i<=n;i++){
       	pow=pow*2;
       	System.out.println("2^"+i+"="+pow);
	}
}

}
