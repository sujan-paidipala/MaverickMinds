package DynamicProgramming;

import java.util.Scanner;

public class SubsetSumRecursion{

    


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int[] arr=null;
        int sum = sc.nextInt();
        int arraySize=sc.nextInt();

        for(int i=0; i<arraySize; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Result is " + subsetSum(sum, arr));

    }

    private static boolean subsetSum(int sum, int[] arr) {

        return false;
    }
}