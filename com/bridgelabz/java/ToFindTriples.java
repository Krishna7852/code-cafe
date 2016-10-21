/* 
* @Author:Dhareppa Metri
* File:ToFindTriples.java
* Date:11/10/2016
* Purpose:A program with cubic running time. Read in N integers and counts the   number of triples that sum to 
* exactly 0.
**/
import com.bridgelabz.java.ToFindTriples;
import java.util.Scanner;
class ToFindTriples{
	public static void main(String[] args){
	        int capacity=0,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		capacity=sc.nextInt();
		int arr[]=new int[capacity];
		System.out.println("Enter the elements");
		for(int i=0;i<capacity;i++){
		//To read the integer values from the keyboard.
			arr[i]=sc.nextInt();
			}
		//To identityfy the triples that sum is exactly zero.
		for(int i=0;i<capacity-2;i++){
			for(int j=i+1;j<capacity-1;j++){
				for(int k=j+1;k<capacity;k++){
					if(arr[i]+arr[j]+arr[k]==0){
						count++;
						System.out.println("The triple combination are:"+arr[i]+","+arr[j]  								+","+arr[k]);
						}
					}
				}		
			}	
	    if(count==0){
	    System.out.println("Triple not found");
	    }
	    else{
	    System.out.println(count+" "+"triple found");
	   }
}
} 
