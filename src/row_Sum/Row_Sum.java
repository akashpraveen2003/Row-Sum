package row_Sum;

import java.util.Arrays;
import java.util.Scanner;
/*
 * You are given a 2D integer matrix A, return a 1D integer array containing row-wise sums of original matrix.
 */
public class Row_Sum {
	
	private static void calculate_row_sum(int[][] array, int row, int column) {
		
		int row_sum[]=new int[row];
		int sum=0;
		for(int i=0;i<row;i++)
		{
			sum=0;
			for(int j=0;j<column;j++)
			{
				sum+=array[i][j];
			}
			row_sum[i]=sum;
		}
		System.out.println(Arrays.toString(row_sum));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int row=scanner.nextInt();
		int column=scanner.nextInt();
		int array[][]=new int[row][column];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				array[i][j]=scanner.nextInt();
			}
		}
		calculate_row_sum(array,row,column);
	}
}
/*
  	Input
	[
	 [1,2,3,4]
  	 [5,6,7,8]
  	 [9,2,3,4]
  	 ]

	Output
	[10, 26, 18]
*/