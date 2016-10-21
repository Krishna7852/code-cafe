/* 
* @Author:Dhareppa Metri
* File:UnOrderedNodeCreation.java
* Date:20/10/2016
* Purpose:Creation of node for unordered linkedlist.
**/
import com.bridgelabz.java.UnOrderedNodeCreation;
public class UnOrderedNodeCreation<T>{
	T mData;
	UnOrderedNodeCreation mNext;
	//Assigning the data value
	public void setData(T value){
		mData = value;
	}
	//getting data value
	public T getData(){
		return mData;
	}
	//Assigning next node
	public void setNext(UnOrderedNodeCreation node){
		mNext = node;
	}
	//getting next node
	public UnOrderedNodeCreation getNext(){
		return mNext;
	}
}
