/* 
* @Author:Dhareppa Metri
*File:BankingUtility.java
* Date:15/10/2016
* Purpose:Bank application utility class[contains deposit(),withdraw(),balanceEnquery() and to know about number of
* transactions].
**/
import com.bridgelabz.java.BankingUtility;
import com.bridgelabz.java.QueueImpl;
import java.util.Scanner;
class BankingUtility{
	double mBalance=0;
	int mcount;
	Scanner sc=new Scanner(System.in);
	QueueImpl q=new QueueImpl();
	/*deposit() takes input as an integer and adds it to the queue read the amount 
	to deposit,adds the deposit   amount to the mBalance.*/
	void deposit(int option){
	        q.enQueue(option);
	        System.out.println("Enter the amount to deposit:");
	 	double amt1=sc.nextDouble();
	        System.out.println("Deposting Rs."+amt1);
		mBalance=mBalance + amt1;
		System.out.println(mBalance);
		mcount++;
		q.deQueue();
	}
	/*deposit() takes input as an integer and adds it to the queue read the amount 
	to need to withdraw,reduces the withdraw amount from the mBalance.*/
	void withdarw(int option){
		q.enQueue(option);
		System.out.println("Enter the amount to withdraw:");
		double amt=sc.nextDouble();
		if(amt <= balance){
			System.out.println("Enter the amount to withdraw:");
		    	System.out.println("Withdrawing Rs."+amt);
			mBalance=mBalance - amt;
			mcount++;
		    	q.deQueue();
	        }
	        else
	        	System.out.println("Insuuficient balance");
	}
	//This method display the avialable balance in the account.
	void balanceEnquery(){
	    
		System.out.println("The available balance"+mBalance);
	}
	//This method dispaly the number of transaction done
	void transactionCount(){
		System.out.println("The number of transaction so far:"+mcount);
	}
}
	
	 
	
