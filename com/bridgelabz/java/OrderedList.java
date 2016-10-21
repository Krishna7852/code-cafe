/* 
* @Author:Dhareppa Metri
* File:OrderedList.java
* Date:20/10/2016
* Purpose:Read a List of numbers from a file and arrange it ascending Order in a Linked List. Take user input for a 
* number, if found then pop the number out of the list else insert the number in appropriate position.
**/
import com.bridgelabz.java.OrderedList;
import com.bridgelabz.java.OrderedNode;
import com.bridgelabz.java.FileUtility;
import java.io.File;
public class OrderedList{
	public static void main(String[] args){
		FileUtility u = new FileUtility();
		OrderedNode node = new OrderedNode();
		File file = new File("OrderNumber.txt");
		String string= u.readFile(file); //reading file method of Utility class is called.
		System.out.println("Contents of file are: "+string);
		string = string.trim();
		String strArray[] = string.split(" ");
		
		for(int i=0;i<strArray.length;i++){
			node.addNode(Integer.parseInt(strArray[i]));
		}
		
		System.out.print("List Elements are: ");
		node.showList();

		System.out.print("\nPlease Enter the element you want to Search: ");
		int value = u.inputInteger();
		node.search(value); 
	}
}

