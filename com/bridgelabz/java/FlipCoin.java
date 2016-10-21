/* 
* @Author:Dhareppa Metri
* File:FlipCoin.java
* Date:13/10/2016
* Purpose:Flip Coin and print percentage of Heads and Tails.
**/
import com.bridgelabz.java.FlipCoin;
import java.util.Scanner;
class FlipCoin{
	public static void coinFlip(int num){
		double head=0,tail=0,random;
		for(int i=1; i<=num; i++){
			/*To get random value between 0 to 1 */
			random = Math.random(); 
			/*threshold value 0.5 */
			if(random<0.5){
					tail++;	
			}
			else{
					head++;
			}
		}
		System.out.println("Percentage of heads ="+(head/num)*100+"%");
		System.out.println("Percentage of tails ="+(tail/num)*100+"%");
			
	}

		public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of times want to flip the coin");
		/*To read the integer from the keyboard.*/
		int count=sc.nextInt();
		coinFlip(count);
		
	}
}
