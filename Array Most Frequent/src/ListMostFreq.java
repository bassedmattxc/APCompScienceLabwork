//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;

public class ListMostFreq
{
	//method go will return the value 
	//that appears the most
	//if several numbers all appear
	//the same number of times
	//return the first number found
   public static int go( ArrayList<Integer> ray )
   {
      int numToCheckCount = 0;
      
      int numMaxCount = 0;
      int numMaxValue = 0;
      //write a for loop that iterates over all elements in the ArrayList
      for (int i = 0; i < ray.size(); i++) {
         int numToCheck = ray.get(i);
         //second for loop
         for(int j = 0; j < ray.size(); j++) {
            
            if (numToCheck == ray.get(j)) {
               //We found a match
               numToCheckCount = numToCheckCount + 1;
            }
            
         }
         
         if (numToCheckCount > numMaxCount) {
            numMaxCount = numToCheckCount;
            numMaxValue = numToCheck;
         }
      }
   
      return numMaxValue;
   }
}