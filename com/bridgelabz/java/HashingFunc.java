/* 
* @Author:Dhareppa Metri
* File:HashingFunc.java
* Date:21/10/2016
* Purpose:Hashing Function to search a Number in a slot.
**/
import com.bridgelabz.java.HashingFunc;
import com.bridgelabz.java.FileUtility;
import com.bridgelabz.java.HashTable;
import java.io.File;
public class HashingFunc{
	public static void main(String[] args){
		FileUtility u = new FileUtility();
		boolean check = true;
		System.out.print("Please Enter Table Size:");
		int size = u.inputInteger();
		HashTable ht = new HashTable(size);
		File file = new File("SlotValues.txt");
		String string = u.readFile(file);
		String str[] = string.split(" ");
		for(int i=0;i<str.length;i++){
			ht.addValue(Integer.parseInt(str[i]));
		}

		while(check){
			System.out.println("Please Choose Your Option:\n1.search Value\n2.Show HashTable\n3.Exit");
			int choice = u.inputInteger();
			switch(choice){
				case 1:{
					System.out.print("Please Enter a value: ");
					int value = u.inputInteger();
					ht.search(value);
					break;
				}
				case 2:{
					System.out.println("Hash table is");
					ht.showTable();
					System.out.println();
					break;
				}
				case 3:{
					check = false;
					break;
				}
				default :{
					System.out.println("Wrong Choice");
					break;
				}

			}//end of switch
		}//end of while
	}
}

