package DynamicProgramming;

import java.util.Scanner;
import java.util.Arrays;

public class SubsetSum {

	static int[] arr = new int[20];
	static int[][] memo;
	
	

	// 12,5 | 2,7,4,5,19 | TEST INPUT

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Sum");
		int sum = sc.nextInt();
		System.out.println("Enter the arraysize");
		int arraySize = sc.nextInt();
		
		 memo = new int[arraySize][sum+1];

		System.out.println("Enter array elements with a 'enter key' after every element");
		for (int i = 0; i < arraySize; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<arraySize; i++)
			Arrays.fill(memo[i], -1);
		
		
		System.out.println("is subset sum possisble ? : " + subsetSum(arraySize-1, sum));

	}

	private static boolean subsetSum(int idx, int sum) {
		boolean ans = false;

		if (idx == -1)
			return sum == 0;
		
		if(memo[idx][sum] != -1) return memo[idx][sum] == 1;
		
		System.out.println(ans);

		if (arr[idx] <= sum)
			ans |= subsetSum(idx - 1, sum - arr[idx]);

		ans |= subsetSum(idx - 1, sum);

		//return subsetSum(idx - 1, sum - arr[idx])||subsetSum(idx - 1, sum);
		
		memo[idx][sum] = ans ? 1:0;

		return ans;
	}
}