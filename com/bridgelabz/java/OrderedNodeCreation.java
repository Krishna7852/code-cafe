/* 
* @Author:Dhareppa Metri
* File:OrderedNodeCreation.java
* Date:20/10/2016
* Purpose:Implementation of ordered linked list utility methods.
**/
import com.bridgelabz.java.OrderedNodeCreation;
public class OrderedNodeCreation{
	int mData;
	OrderedNodeCreation mNext;
	//Assigning the data value
	public void setData(int value){
		mData = value;
	}
	//getting data value
	public int getData(){
		return mData;
	}
	//Assigning next node
	public void setNext(OrderedNodeCreation node){
		mNext = node;
	}
	//getting next node
	public OrderedNodeCreation getNext(){
		return mNext;
	}

	
}
