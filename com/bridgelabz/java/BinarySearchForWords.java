/* 
* @Author:Dhareppa Metri
* File:BinarySearch.java
* Date:8/10/2016
* Purpose:Read the file content and search the given word in the file using Binary search algorithm, it the
* word found in the file print "search found" else "search not found" message on the screen.
**/
import com.bridgelabz.java.BinarySearchForWord;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
class BinarySearchForWord{
	public static void main(String[] args){
	int size,start,end,mid,count = 0; 
	String search=null;
	String[] wordsArray=null;
	Scanner sc=new Scanner(System.in);
		try{
                //To read the text file	
        		BufferedReader buf=new BufferedReader(new FileReader("/home/bridgeit/java/javaApplications/content.txt"));
   			String lineFetched = null;
   			//To each line from the text file
   		   	while(true){
            			lineFetched = buf.readLine();
               			if(lineFetched == null){  
                			break; 
                		}
                		//split each line based on the " "(sapce) and storing these words in the string array.
                		else{
                			wordsArray = lineFetched.split(" ");
                  		} 
                	}
                	//once the reading each lines from the file is done,closeing the text file.
           			 buf.close();
          }
    catch(Exception e){
    	e.printStackTrace();
       }  
    //Sorting each words in the string array in the ascending order.   
    for(int i=1;i<wordsArray.length;i++){
		for(int j=i;j>0;j--){
			if(wordsArray[j-1].compareTo(wordsArray[j])>0){
				String temp = wordsArray[j];
				wordsArray[j] = wordsArray[j-1];
				wordsArray[j-1] = temp;
			}
		}
	}
	//To display all the sorted words present in the string array. 
	System.out.println("The sorted elements are;");
    for(int i=0;i<wordsArray.length;i++){
		 System.out.println(wordsArray[i]);
	    }
	System.out.println("Enter the String need to be search");
	search=sc.next();
	start = 0;
    end  = wordsArray.length-1;
    //To search the given word  in the array,using binary search.
    while(start <= end){
		mid = (start+end)/2;
		if (search.compareTo(wordsArray[mid])==0){
		    System.out.println("Search found at position :"+mid);
		    count++;
		    break;
		}
		if(search.compareTo(wordsArray[mid])<0)
		end = mid-1;
	    else
		start = mid+1;		
	}
		if(count == 0)
			      System.out.println("\nSearch not found");
	  }
}
