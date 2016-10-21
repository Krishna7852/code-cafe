/* 
* Author:Dhareppa Metri
* File:ImplStopWatch.java
* Date:10/10/2016
* Purpose:Implementation of stopwatch to find the elapsed time between start and stop.
**/
import com.bridgelabz.java.ImplStopWatch;
import java.lang.System;
class ImplStopWatch{
	long mStart = 0;
	long mStop = 0;
	boolean mRunning = false;
	/*
	* This method is used to calculate start time of watch
	**/ 
	public void startWatch(){ 
      		this.mStart = System.currentTimeMillis();
      		this.mRunning = true;
   		}
   	/* 
   	* This method is used to calculate end time of watch
   	**/
        public void stopWatch(){
   		this.mStop = System.currentTimeMillis();
       		this.mRunning = false;
   	} 
   	/*
   	* This method is used to calculate elapsed time between start and end
   	* @return long,elapsed time between start and end.
   	**/
    	public long getElapsedTime(){
       		long elapsed;
       		if (mRunning) {
                	elapsed = ((System.currentTimeMillis() - mStart));
       		}
      		else{
        		elapsed = ((mStop - mStart));
      		}
      	return elapsed;
  }
 	public static void main(String[] args) {
    	implStopWatch s = new implStopWatch();
    	s.startWatch();
    	/*To create the delay.*/
    	for(int i=0;i<500;i++)
     	{
       		System.out.println(i);
     	}
    		s.stopWatch();
    		System.out.println("elapsed time in seconds: " + s.getElapsedTime());
 	}
}

