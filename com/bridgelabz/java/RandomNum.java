/* 
* @Author:Dhareppa Metri
* File:RandomNum.java
* Date:13/10/2016
* Purpose:Given N distinct Coupon Numbers, how many random numbers do you need to generate distinct coupon number? 
* this program simulates this random process.
**/
import com.bridgelabz.java.RandomNum;
import java.util.Scanner;
class RandomNum{
	
	static void mRandomGenerator(int count){
	Random rn=new Random();
	//To generate the coupon number.
	for(int i=0;i<count;i++){
	      System.out.println(rn.nextInt(100));
		}
	}
	
	public static void main(String[] args){
	System.out.println("Enter the number of random number need:");
	Scanner sc=new Scanner(System.in);
	//To read the integer value from the keyboard.
	int count=sc.nextInt();
	mRandomGenerator(count);
	}
}
