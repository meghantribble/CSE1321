package lab13;

import java.util.Scanner;

public class Largest {

	public static void locateLargest(int[][] myArray) {
		int largest = myArray[0][0];
		int maxR = 0; int maxC = 0; 
		for(int i =0;i<myArray.length;i++) {
			for(int a= 0; a<myArray[0].length;a++){
			if(largest < myArray[i][a]) {
				largest = myArray[i][a];	 		
				maxR = i;
				 maxC = a;
				}
			}
			
			}
		System.out.println("First largest value is located at row " +maxR+ " and column " +maxC);
			
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
	
     locateLargest(myArray);
		
	}
}

	
