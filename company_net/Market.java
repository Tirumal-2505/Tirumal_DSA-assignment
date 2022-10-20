package company_net;

import java.util.*;


public class Market {

	public static void main(String[] args) {
		int N; //no of  
	    double d; //share price;
	    double arr[];
	    double array[];
	    boolean status;
	    
	   int rosecompanies = 0;
	   int declinecompanies = 0;
	    
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number of companies: ");
	    N = sc.nextInt();
	   arr = new double[N];
	    
	    
	   for(int i=0;i<arr.length;i++){
	       System.out.println("Enter the current stock price of company "+ (i+1));
	       arr[i]= sc.nextDouble();
	       System.out.println(arr[i]);
	       
	       System.out.println("Whether the company's stock price rose today compared to yesterday?");
	       status = sc.nextBoolean();
	       System.out.println(status);
			if(status)
			{
				rosecompanies ++;
			}
			else{
				declinecompanies ++;
			}
		   
	   }
	       
	   
	 
	   System.out.println("==========================================================");
	   System.out.println("Enter the operation that you want to perform");
	   System.out.println();
	   
	   System.out.println("1. Display the companies stock prices in ascending order");
	   System.out.println("2. Display the companies stock prices in descending order");
	   System.out.println("3. Display the total no of companies for which stock prices rose today");
	   System.out.println("4. Display the total no of companies for which stock prices declined today.");
	   System.out.println("5. Search a specific stock price");
	   System.out.println("0.Exit");
	   System.out.println();
	   
	   System.out.println("==========================================================");
	   
	   int input = sc.nextInt();
	   
	   switch(input){
	       case 1:{
	    	   System.out.println("Stock prices in ascending order are: ");
	    	   Selectionsort selection = new Selectionsort(arr);
	    	    selection.ascendingorder();
	    	    selection.order(arr);
	           break; 
	       }
	       case 2:{
	    	   System.out.println("Stock prices in descending order are: ");
	    	   Bubblesort bubble = new Bubblesort(arr);
	           bubble.descendingorder1();
	           bubble.order(arr);
	           break;
	       }
	       case 3:{
	    	   System.out.println("total no of companies for which stock prices rose today: "+ rosecompanies);
	    	   
	           break;
	       }
	       case 4:{
	    	   System.out.println("total no of companies for which stock prices decline today: " + declinecompanies);
	    	   
	           break;
	       }
	       case 5:{
	    	   LinearSearch linear = new LinearSearch(arr);
	    	   linear.search(arr, input);
	    	   
	    	 
	           break;
	       }
	       default:{
	           System.out.println("Invalid option");
	       }
	   }
	   System.out.println("Exited successfully");

	}

}

