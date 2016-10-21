/* 
* @Author:Dhareppa Metri
* File:BubbleSort.java
* Date:8/10/2016
* Purpose:Reads in integers prints them in sorted order using Bubble Sort.
**/
import com.bridgelabz.java.BubbleSort;
import java.util.Scanner;
class BubbleSort{
	public static void main(String[] args){
	System.out.println("Enter the size of the arry");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] array=new int[n];
	System.out.println("Enter the array elements");
	//To read the 'n' array elements from the keyboard
	for(int i=0;i<n;i++){ 
      		array[i]=sc.nextInt();
      		}
      	//To sort the array elements in the ascending order
	for(int i=0;i<(n-1);i++){
		for(j=0;j<(n-1);j++){
        		if(array[j]>array[j+1]){
         			int temp=array[j];
          			array[j]=array[j+1];
          			array[j+1]=temp;         
          		       		}
          			
   		        	}
  	      		}
  	System.out.println("The sorted list elements are;");
  	//To display sorted elements from the array.
  	for(i=0;i<n;i++){
  		System.out.println(array[i]);
  		}
	}
}
