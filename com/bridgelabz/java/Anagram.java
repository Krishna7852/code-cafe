/* 
* @Author:Dhareppa Metri
* File:Anagram.java
* Date:8/10/2016
* Program:To check the given two strings are Anagram or not.
**/
import com.bridgelabz.java.Anagram;
import java.util.Scanner;
class Anagram{
	/**
	* This method is used to check two strings are anagram or not
	* @param String first parameter for this method
	* @param String second parameter for this method
	* @return boolean,true if the two strings are anagram else false.
	*/
	public static boolean checkAnagram(String st1,String st2){
   	if(st1.length()!=st2.length())
   	return false;
   	boolean anagram=true;
   	for(int i=0;i<st1.length();i++)
   	{ 
         	if(st2.indexOf(st1.charAt(i))==-1)
         	anagram=false;
   	}
   	return anagram; 
}
   	public static void main(String[] args){
   	System.out.println("Enter the first string");
   	Scanner sc=new Scanner(System.in);
   	String st1=sc.next();
   	System.out.println("Enter the second string");
   	String st2=sc.next();
   	boolean isAnagram=checkAnagram(st1,st2);
   	//if the value of isAnagram is true then the strings are Anagram else not.
   	if(isAnagram)
   	{
         	System.out.println(st1+" "+"and"+" "+st2+" "+"are anagrams");
   	}
   	else
   	{
         	System.out.println(st1+" "+"and"+" "+st2+" "+"not are anagrams");
   		}
 	}
}

