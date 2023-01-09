import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		
		int n= sc.nextInt();
		
		int denominations[]= new int[n];
		
		System.out.println("Enter the currency denominations value: ");
		
		for(int i=0; i<n;i++) {
			denominations[i]=sc.nextInt();
		}
		System.out.println("enter the amount you wamt to pay: ");
		
		int amount=sc.nextInt();
		sc.close();
		
		MergeSort sorting=  new MergeSort();
		sorting.mergeSort(denominations, 0,  n-1);
		
		System.out.println("your payment approach in order to give min number of note will be ");
		
		int payment=0;
		
		for(int i=0; i<n;i++) {
			int numNotes=amount/denominations[i];
			
			if (numNotes>0) {
				payment+=denominations[i]*numNotes;
				System.out.println(denominations[i]+" :"+numNotes);
				
				amount-=denominations[i]*numNotes;
			}
		}

	}

}
