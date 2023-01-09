import java.util.Scanner;

public class TransactionDetails {
	

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
         System.out.println("Enter the size of transaction array");
         int size= scan.nextInt();
         int transcations[]= new int[size];
         System.out.println("enter the values of array");
         for(int i=0; i<size;i++) {
        	 transcations[i]=scan.nextInt();
         }
     System.out.println("Enter the total no of targets that needs to be achieved");
     int totalTargets= scan.nextInt();
     

  
     while(totalTargets--!=0) {
    	int flag=0; 
     System.out.println("enter the value of target");
    	int  targetvalue=scan.nextInt();
    	 long sum=0;
    	 for(int i=0;i<size;i++) {
    		 sum+=transcations[i];
    		 if(sum>=targetvalue) {
    			 System.out.println("Target achieved after "+(i+1) +" Transcations");
    			 flag=1;
    			 break;
    		 }
    	 }
     
   if(flag==0)
    	System.out.println("Given target is not  achieved");
     }  	 
     
     }
   
	}


