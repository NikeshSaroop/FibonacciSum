/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author Nikesh
 */
public class Fibonacci {

 
  public static double calcfibnocci()
  {
    int total = 0;
    int highest = 4000000;
    int next = 1;
    int last = 1; 
      
 
    while (next < highest) 
    {
	int temp = next;
	next = next + last;
	last = temp;
 
        if (next % 2 == 0) 
        {
		total += next;
	}
    }
 
    return total;
      }
       public static void main(String[] args)
    {
         System.out.println(calcfibnocci());
    }
}
     
 
