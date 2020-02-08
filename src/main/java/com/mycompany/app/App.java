package com.mycompany.app;
import java.util.ArrayList;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
	      public static boolean search(ArrayList<Integer> array,ArrayList<Integer> array2, int e,int k) {
        System.out.println("inside search");
        if (array == null) return false;
  
        for (int elt : array) {
		for(int elt2:array2){
			if (elt*elt2 == e*k) return true;

		}
          
        }
        return false;
      }
}
