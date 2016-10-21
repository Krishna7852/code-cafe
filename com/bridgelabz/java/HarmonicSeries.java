/* 
* @Author:Dhareppa Metri
* File:HarmonicSeries.java
* Date:10/10/2016
* Purpose:To find the sum of a given number haramonic series.
**/
import com.bridgelabz.java.HarmonicSeries;
import java.util.Scanner;
class HarmonicSeries{
    public static void main(String args[]) {
        int i=1;
        double result=0.0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        /*To read the integer value from the keyboard.*/
        int n = in.nextInt();
        /*To calculate the sum of the H series s*/
        while(i <= n){
             System.out.print("1/"+i+" +");
             result = result + (double) 1 / i;
             i++;
        }
        System.out.println();
        System.out.println("Sum of Harmonic Series is "+result); 
    }
}
