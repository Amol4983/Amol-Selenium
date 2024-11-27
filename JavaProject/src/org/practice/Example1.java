package org.practice;

public class Example1
{
	    public static int[] output(int [] currency,int money)
	    {
	        int[] array = new int[100];
	        int i=0;
	        int j=0;
	        while(money!=0)
	        {
	            if(currency[i]<=money)
	            {
	                money = money - currency[i];
	                array[j]=currency[i];
	                j++;
	            }
	            else
	            {
	                i++;   
	            }
	        }
	        return array;
	    }
	    public static void main(String[] args) 
	    {
	        int [] currency = {2000,500,200,100,50,20,10,5,2,1};
	        int [] outputdata = output(currency,36521);
	        for(int x:outputdata)
	        {
	           if (x!=0)
	            {
	                System.out.print(x+" ");
	            }
	           else
	           {
	        	  System.out.println("l");
	           }
	           
	        }
	        
	                
        }	
	    
	    
}
	        


