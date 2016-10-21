/* 
* @Author:Dhareppa Metri
* File:UnOrderedList.java
* Date:20/10/2016
* Purpose:Read the Text from a file, split it into words and arrange it as Linked List. Take a user input to search a * Word in the List. If the Word is not found then add it to the list, and if it found then remove the word from the 
* List. In the end save the list into a file.
**/
import com.bridgelabz.java.UnOrderedList;
import com.bridgelabz.java.FileUtility;
import java.io.File;
public class UnOrderedList{
	public static void main(String[] args){
		FileUtility fu = new FileUtility();
		UnOrderedNode node = new UnOrderedNode();
		File file = new File("UnOrderedStringList.txt");
		String string = fu.readFile(file);
		System.out.println("File Contents are: "+string);
		string = string.trim();
		String[] str = string.split(" ");
		
		for(int i=0;i<str.length;i++){
			node.addNode(str[i]);
		}
		
		System.out.print("Please Enter String You want to search: ");
		String searchStr = fu.inputString();
		node.search(searchStr);
	}
}
