/* 
* @Author:Dhareppa Metri
* File:JsonTest.java
* Date:19/10/2016
* Purpose: Json Object Test.
**/
import com.bridgelabz.java.JsonTest;
import json.simple.JSONObject;    
public class JsonTest{    
	public static void main(String args[]){    
		JSONObject obj=new JSONObject();    
		obj.put("name","sonoo");    
      		obj.put("age",new Integer(27));    
      		obj.put("salary",new Double(600000));    
       		System.out.print(obj);    
   		}
  }    
