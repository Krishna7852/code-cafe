/* 
* @Author:Dhareppa Metri
* File:BinarySearchUtility.java
* Date:17/10/2016
* Purpose:Sorting the array elemnts using Utility class.
**/
import com.bridgelabz.java.BinarySearchUtility;
import java.util.Scanner;
class BinarySearchUtility{
	public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
		Integer arr[]=new Integer[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
			}
		//Utility class method to sort the elements using bubble sort
		Integer[] arr1=ut.bubbleSortInt(arr);
		System.out.println("Sorted array elements are;");
		for(int i=0;i<arr1.length;i++){
			System.out.println(arr1[i]);
		}
	}
}
