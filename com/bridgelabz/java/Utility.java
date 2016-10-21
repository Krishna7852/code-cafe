/*
* @Author:Dhareppa Metri
* File:Utility.java
* Date:17/10/2016
* Purpose:Utility class which contains method to sort the integer and string using bubble sort and insertion sort
* alogoritms,binary search alorithm for to search integer and given string in an array.
**/
import com.bridgelabz.java.Utility;
class Utility{
	/**
	* This method is used to sort the integer array elements using bubble sort
	* @param Integer[], is the parameter for this method
	* @return Integer[],sorted array elements
	*/
	public Integer[] bubbleSortInt(Integer[] array){
		for(int i=1;i<array.length;i++){
			for(int j=0;j<array.length-i;j++){
				if(array[j]>array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}

	/**
	* This method is used to sort the string array elements using bubble sort
	* @param String[], is the parameter for this method
	* @return String[],sorted array elements
	*/
	public String[] bubbleSortString(String[] array){
		for(int i=1;i<array.length;i++){
			for(int j=0;j<array.length-i;j++){
				if(array[j].compareTo(array[j+1])>0){
					String temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}

	/**
	* This method is used to sort the integer array elements using insertion sort
	* @param Integer[], is the parameter for this method
	* @return Integer[],sorted array elements
	*/
	public Integer[] insertionSortInt(Integer[] array){
		for(int i=1;i<array.length;i++){
			for(int j=i;j>0;j--){
				if(array[j-1]>array[j]){
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}
		return array;
	}

	/**
	* This method is used to sort the string array elements using insertion sort
	* @param String[], is the parameter for this method
	* @return String[],sorted array elements
	*/
	public String[] insertionSortString(String[] array){
		for(int i=1;i<array.length;i++){
			for(int j=i;j>0;j--){
				if(array[j-1].compareTo(array[j])>0){
					String temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}
		return array;
	}

	/**
	* This method is used to search the integer element from the integer array using binary search
	* @param Integer[], is the first parameter for this method
	* @param int,is second parameter for this method,it is the search element
	*/
	public void binarySearchInt(Integer[] array,int num){
		int size = array.length;
		array = this.bubbleSortInt(array);
		int start,end,mid,count=0;
		
		start = 0;
		end  = size-1;

		while(start <= end){
			mid = (start+end)/2;
			if (num==array[mid]){
				System.out.println("Search found at position :"+mid);
				count++;
				break;
			}
			if(num<array[mid])
				end = mid-1;
			else
				start = mid+1;		
		}
		if(count == 0)
			System.out.println("Search not found");	

	}
	/**
	* This method is used to search the string element from the string array using binary search
	* @param String[], is the first parameter for this method
	* @param String,is second parameter for this method,it is the search element
	*/
	public void binarySearchString(String[] array, String str){
		int size = array.length;
		array = this.bubbleSortString(array);
		int start,end,mid,count=0;
		start = 0;
		end  = size-1;
		
		while(start <= end){
			mid = (start+end)/2;
			if (str.compareTo(array[mid])==0){
				System.out.println("Search found at position :"+mid);
				count++;
				break;
			}
			if(str.compareTo(array[mid])<0)
				end = mid-1;
			else
				start = mid+1;		
		}
		if(count == 0)
			System.out.println("Search not found");	

	}	
}

