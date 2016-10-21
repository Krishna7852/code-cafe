/**
 * @author:Dhareppa Metri
 * @file:InventoryDataManagement.java
 * @date:19/10/2016
 * @purpose:To read the .json file content
 */
package com.bridgelabz.json;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class InventoryDataManagement {
	public static void main(String[] args) {
		/*
		 * To read the .json file
		 * */
		JSONParser parser = new JSONParser();
		try{
			Object ob = parser.parse(new FileReader("/home/bridgeit/packge/com/bridgelabz/assignments/Information.json"));
			JSONObject object = (JSONObject) ob;//json object created
			
			
			 JSONArray data = (JSONArray) object.get("data");
			 String[] str = {"rice","pulses","wheats"};
			 /*
			  * To read the .json file content i.e Object and each Object [name,values]
			  * */
			 for(int i=0;i<data.size();i++){
				 JSONObject itemObj = (JSONObject) data.get(i);
				 JSONArray item = (JSONArray) itemObj.get(str[i]);
				 System.out.println(str[i]+" Data:");
				 /*
				  * To display the array elements[name,value]
				  * */
				 for (int y = 0; y < item.size(); y++) {
				        JSONObject itemData = (JSONObject) item.get(y);
				        System.out.println("name: "+itemData.get("name"));
				      
				        Object quantObject = itemData.get("weight");
				        int quantity = Integer.parseInt((String)quantObject);
				        System.out.println("Weight: "+quantity+" Kg");
				        
				        Object priceObject = itemData.get("price");
				        double price = Double.parseDouble((String) priceObject);
				        System.out.println("price: "+price+" Rs/Kg");
				  }
				 System.out.println("*********************");
			 }

		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}