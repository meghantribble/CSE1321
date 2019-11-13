package lab13;

import java.util.Scanner;

public class Matrices {
public static int[][] Addition(int[][] matrixA, int[][] matrixB) {
	int[][] sum = new int[3][3];
	for(int i =0;i<matrixA.length;i++) {
		for(int a = 0; a<matrixB.length; a++) {
			sum[i][a] = matrixA[i][a] + matrixB[i][a];
		}
	}
	return sum;
}

	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int rows = 3;
		int columns =3;
		int[][] matrixA = new int[rows][columns];
		int[][] matrixB = new int[rows][columns];
		
		System.out.println("Enter a 3-by-3 matrix: ");//user input for matrix A
		for(int i= 0; i<3;i++){
			for(int a= 0; a<3;a++){
				matrixA[i][a] = scan.nextInt();
		}
			}
		
		System.out.println("Enter a second 3-by-3 matrix: ");//looping user input for matrix B
		for(int i= 0; i<3;i++){
			for(int a= 0; a<3;a++){
				matrixB[i][a] = scan.nextInt();
		}
			}	
		System.out.println("Matrix A: ");//printing matrix A
		for(int i= 0; i<3;i++){
			for(int a= 0; a<3;a++){
				System.out.print(matrixA[i][a]+ " ");
			}
			System.out.println();	
		}
	
		System.out.println("Matrix B: ");//printing matrix B
		for(int i= 0; i<3;i++){
			for(int a= 0; a<3;a++){
				System.out.print(matrixB[i][a]+ " ");
			}
			System.out.println();	
		}
		
		int [][] sum = Addition(matrixA,matrixB);//calling method for sum of matrix
		System.out.println("Matrix A+B: ");//printing sum of matrix 
		for(int i= 0; i<3;i++){
			for(int a= 0; a<3;a++){
				System.out.print(+sum[i][a]+ " ");
			}
			System.out.println();
	}
}
}

