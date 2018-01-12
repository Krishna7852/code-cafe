package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatedNumber {
	
	public static void main(String args[]) {
		List<Integer> numbers = new ArrayList<>();
		for (int i = 0; i <= 100; i++) {
			numbers.add(i);
		}
		System.out.println("Enter the number in array" );
		int number = new Scanner(System.in).nextInt();
		numbers.add(number);
		
		findRepeatedNumber(numbers);

		
	}

	private static void findRepeatedNumber(List<Integer> numbers) {
		for (int i = 0; i < numbers.size()-1; i++) {
			for (int j = i+1; j < numbers.size(); j++) {
				if (numbers.get(i) == numbers.get(j)) {
					System.out.println("Dupicate Found " + numbers.get(j));
				}
			}
		}
		
		 
	}
*****************************************************************************************
/*Second Way of Finding Duplicate Number*/

public class DuplicateNumber2 {
	 public int findDuplicateNumber(List<Integer> numbers){
         
	        int highestNumber = numbers.size() - 1;
	        int total = getSum(numbers);
	        int duplicate = total - (highestNumber*(highestNumber+1)/2);
	        return duplicate;
	    }
	     
	    public int getSum(List<Integer> numbers){
	         
	        int sum = 0;
	        for(int num:numbers){
	            sum += num;
	        }
	        return sum;
	    }
	     
	    public static void main(String a[]){
	        List<Integer> numbers = new ArrayList<Integer>();
	        for(int i=1;i<10;i++){
	            numbers.add(i);
	        }
	        //add duplicate number into the list
	        numbers.add(9);
	        DuplicateNumber2 dn = new DuplicateNumber2();
	        System.out.println("Duplicate Number: "+dn.findDuplicateNumber(numbers));
	    }
}

***********************************************************************************************************
