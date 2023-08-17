package DynamicProgramming;

import java.util.Scanner;

public class SubsetSumRepeatingNumbers {
	
	static int arr[];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sum : ");
		int sum = sc.nextInt();
		System.out.println("Enter the Array Size : ");
		int size = sc.nextInt();
		arr = new int[size];
		System.out.println("Enter Array Elements with Enter with every element");
		for(int i=0; i<size; i++)
			arr[i] = sc.nextInt();
		
		System.out.println("is subset sum possible : " + subsetSumRepeatingNumber(size, sum));
		
	}
	private static boolean subsetSumRepeatingNumber(int size, int sum) {
		if(size == -1 ) return sum == 0;
		return subsetSumRepeatingNumber(size-1, sum) || subsetSumRepeatingNumber(size, sum-arr[size]);
	}

}
