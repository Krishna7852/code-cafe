/* 
* @Author:Dhareppa Metri
* File:CreationOfArray.java
* Date:12/10/2016
* Purpose:A library for reading in 2D arrays of integers, doubles, or booleans from standard input and printing them out to standard output.
**/
import com.bridgelabz.java.CreationOfArray;
import java.util.Scanner;
class CreationOfArray{
	public static void main(String[] args){
		int row,col,option=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the option which array you want to create:");
		System.out.println("1.Interger Array \n 2.Double Array \n 3.Boolean Array \n 4.Exit");
		option=sc.nextInt();
		//To dispaly user interactive interface,to choose the options.
		switch(option)
		{
			case 1:
				{
					System.out.println("Enter the number of rows");
					//To read the number of rows from the keyboard.
					row=sc.nextInt();
					System.out.println("Enter the number of columns");
					//To read the number of columns from the keyboard.
					col=sc.nextInt();
					//integer 2-dimensional array
				    Integer[][] arr=new Integer[row][col];
					System.out.println("Enter the array elements");
					//To read the integer array elements from the keyboard. 
					for(int i=0;i<row;i++){
						for(int j=0;j<col;j++){
							arr[i][j]=sc.nextInt();
							}
					}
				    System.out.println("The array elements are;");
				    //To display all the array elements. 
				    for(int i=0;i<row;i++){
				    	for(int j=0;j<col;j++){
				    		System.out.println(arr[i][j]);
				    		}
				    	}
				    break;
                }	
           case 2:
           		{
           			System.out.println("Enter the number of rows");
           			//To read the number of rows from the keyboard.
					row=sc.nextInt();
					//To read the number of columns from the keyboard.
					System.out.println("Enter the number of columns");
					col=sc.nextInt();
					//Double 2-dimensional array
					Double[][] arr=new Double[row][col];
					System.out.println("Enter the array elements");
					//To read the double array elements from the keyboard.
					for(int i=0;i<row;i++){
						for(int j=0;j<col;j++){
							arr[i][j]=sc.nextDouble();
							}
					}
				    System.out.println("The array elements are;");
				    //To display all the array elements.
				    for(int i=0;i<row;i++){
				    	for(int j=0;j<col;j++){
				    		System.out.println(arr[i][j]);
				    		}
				    	}
				    	break;
                }	
           case 3:
           		{	
					System.out.println("Enter the number of rows");
					//To read the number of rows from the keyboard.
					row=sc.nextInt();
					System.out.println("Enter the number of columns");
					//To read the number of columns from the keyboard.
					col=sc.nextInt();
					//Double 2-dimensional array
					Boolean[][] arr=new Boolean[row][col];
					System.out.println("Enter the array elements");				  
		 			System.out.println("Enter the array elements");
		 			//To read the double array elements from the keyboard.
					for(int i=0;i<row;i++){
						for(int j=0;j<col;j++){
							arr[i][j]=sc.nextBoolean();
							}
					}
				    System.out.println("The array elements are;");
				    //To display all the array elements
				    for(int i=0;i<row;i++){
				    	for(int j=0;j<col;j++){
	   			    		System.out.println(arr[i][j]);
				    		}
		      		 }
		      		 break;
				}
			case 4:
				 {
				    break;
				 }
	  }
	 }
}	 
	 
	 			  
				    	
				    	
