package lab13;
import java.util.Scanner;
public class ColumnSums {

	public static int[] sumColumn(int[][] myArray) {
		int[] sum = new int[myArray[0].length];
		
		for(int i =0;i<myArray[0].length;++i) {
			int sums = 0;
			for(int a= 0; a<myArray.length;++a){	
				sums += myArray[a][i];
		}
			sum[i] = sums;
		}
			return sum;
	}
	
	
	public static void main(String [] args) {
	Scanner scan = new Scanner(System.in);
	int rows = 3;
	int columns =4;
	int[][] myArray = new int[rows][columns];
	
	
	System.out.println("Enter a 3-by-4 array: ");
	for(int i= 0; i<3;i++){
		for(int a= 0; a<4;a++){
			myArray[i][a] = scan.nextInt();
	}
		}
	System.out.println("The entered matrix: ");
	for(int i= 0; i<3;i++){
		for(int a= 0; a<4;a++){
			System.out.print(myArray[i][a]+ " ");
		}
		System.out.println();
	}
	int[] sum = sumColumn(myArray);
	System.out.println();
	for(int i= 0; i<sum.length;i++){
		System.out.println("Sum of column " + i + " is " +sum[i]);
	}
}
	}
