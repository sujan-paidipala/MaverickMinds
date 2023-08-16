package DynamicProgramming;

import java.util.Scanner;

public class SubsetSumRecursion {

	static int[] arr = new int[20];

	// 12,5 | 2,7,4,5,19 | TEST INPUT

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Sum");
		int sum = sc.nextInt();
		System.out.println("Enter the arraysize");
		int arraySize = sc.nextInt();

		System.out.println("Enter array elements with a 'enter key' after every element");
		for (int i = 0; i < arraySize; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("is subset sum possisble ? : " + subsetSum(arraySize, sum));

	}

	private static boolean subsetSum(int idx, int sum) {
		boolean ans = false;

		if (idx == -1)
			return sum == 0;

		if (arr[idx] <= sum)
			ans |= subsetSum(idx - 1, sum - arr[idx]);

		ans |= subsetSum(idx - 1, sum);

		return ans;
	}
}