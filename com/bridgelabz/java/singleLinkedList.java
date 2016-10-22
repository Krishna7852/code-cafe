s/* 
* @Author:Dhareppa Metri
* File:Node.java
* Date:20/10/2016
* Purpose:Implemenation of singly linked list.
**/
import com.bridgelabz.java.singleLinkedList;
public class singleLinkedList
{
    Node mHead;
    singleLinkedList(){
    	mHead=null;
    }
    /*
    * This method is used to add the elements to the list
    * @param Object,first parameter for this method
    * @return boolean,true if the element is added to list else false
    **/
    boolean add(Object obj){
   	 Node n=new Node(obj);
   	 if(mHead==null){
     mHead=n;
     return true;
    }
    Node t=mHead;
    while(t.link!=null){
      t=t.link;
    }
    t.link=n;
    return true;
    }
    /*
    * This method is used to display all the elements from the list
    **/
    void display(){
     Node t=mHead; 
     while(t!=null){
     System.out.print(t.data+" ");
     t=t.link;
     }
    System.out.println();
    }
    /*
    * This method is used to add the elements to the list at the first position
    * @param Object,first parameter for this method
    * @return boolean,true if the element is added to list else false
    **/
   public boolean addFirst(Object obj) {
    Node n=new Node(obj);
    Node t=mHead;
    mHead=n;
    mHead.link=t;
    return true;
  }
  /*
    * This method is used to insert the element to the list
    * @param Object,first parameter for this method
    * @return boolean,true if the element is inserted to list else false
    **/
  boolean insert(Object obj1,Object obj2){
    Node n=new Node(obj2);
    Node t=mHead;
    while(t!=null){ 
      if(t.data==obj1){
        break;
      }
    t=t.link;
    }
   if(t==null)
   return false;
   else{
       n.link=t.link;
       t.link=n;
   return true;
   }
   }
   /*
    * This method is used to search the element from the list
    * @param Object,first parameter for this method
    * @return boolean,true if the element is found in the list else false
    **/
   public boolean search(Object obj){
     int count=0;
     Node t=mHead;
     while(t!=null){
      count++;
      if(t.data==obj){
        break;
      }
     t=t.link;	
  }
  if(t==null)
  return false;
  else
  return true;
  }
  /*
   * This method is used to remove the element from the list
   * @param Object,first parameter for this method
   * @return boolean,true if the element is removed from the list else false
   **/
  public boolean remove(Object obj){
  	if(mHead.data==obj){
  	mHead=mHead.link;
 	 return true;
  }
  Node t=mHead.link;
  Node p=mHead;
  while(t!=null){
   if(t.data==obj){
     break;
   }
  p=t;
  t=t.link;
  }
  if(t!=null){
    p.link=t.link;
    return true;
  }
  else
  return false;
  }
}
