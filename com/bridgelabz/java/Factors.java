/* 
* @Author:Dhareppa Metri
* File:Factors.java
* Date:12/10/2016
* Purpose:Computes the prime factorization of N using brute force.
*/
import com.bridgelabz.java.Factors;
import java.util.Scanner;
class Factors{
      public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number ");
      //To read the number from the keyboard
      int num=sc.nextInt();
      System.out.println("The prime frctors are;");
      //To calculate the prime factors
      for(int i=2;i<=num;i++){
          while(num%i == 0){
             num=num/i;
             System.out.print(i+" ");
          }
      } 
      System.out.println();
   }
}
