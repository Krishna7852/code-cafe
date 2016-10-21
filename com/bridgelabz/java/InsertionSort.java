/* 
* @Author:Dhareppa Metri
* File:InsertionSort.java
* Date:12/10/2016
* Purpose: Reads in strings from standard input and prints them in sorted order using insertion sort.
**/
import com.bridgelabz.java.InsertionSort;
import java.util.Scanner;
class InsertionSort{
	public static void main(String[] args){
    	System.out.println("Enter the total number of elements");
    	Scanner sc=new Scanner(System.in);
    	/*To read the integer value from the keyboard.*/
    	int capacity=sc.nextInt();
    	/*String array with size 'capacity'*/
    	String[] arr=new String[capacity];
    	System.out.println("Enter the elements need to be sort;");
    	for(int i=0;i<arr.length;i++){
       	arr[i]=sc.next();
  	}
  	/*To sort the array elemetns from the array in the ascending order.*/
  	  for(int i=0;i<arr.length;i++){
	  	for(int j=i;j>0;j--){
			if(arr[j-1].compareTo(arr[j])>0){
				String temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}

     	System.out.println("Sorted array elements are;");
     	/*To display array elements.*/
     	for(int i=0;i<arr.length;i++) {
        System.out.println(arr[i]);
        }
  }
}
