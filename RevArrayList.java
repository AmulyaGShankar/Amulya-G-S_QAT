import java.io.*;
import java.util.*;
public class RevArrayList {


	    public static void main(String[] args)
	    {
	    	Scanner sc=new Scanner(System.in);
	       ArrayList<String> arrayli = new ArrayList<String>();
	 
	       System.out.println("Enter the Size of the ArrayList");
	       int n = sc.nextInt();
	       for(int i=0;i<n;i++) {
	    	   arrayli.add(sc.next());
	       }
	     
	        System.out.print("Elements before reversing:\n");
	        printElements(arrayli);
	 
	       
	        Collections.reverse(arrayli);
	        System.out.print("\nElements after reversing:\n");
	        printElements(arrayli);
	    }
	 

	    public static void printElements(ArrayList<String> arrayli)
	    {
	        for (int i = 0; i < arrayli.size(); i++) {
	            System.out.println(arrayli.get(i) + " ");
	        }
	    }
	}
