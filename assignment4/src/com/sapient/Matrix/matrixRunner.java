package com.sapient.Matrix;

public class matrixRunner {

	public static void main(String[] args) {
		
		 Matrix m1 = new Matrix(4,4);
		 
		 m1.readMatrix();
		 m1.displayMatrix();
		 
		 int matrix[][] = new int[4][4];

		 for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				matrix[i][j] = 1;
			}
		 }

		 Matrix m2 = new Matrix(matrix);
		 m2.displayMatrix();
		 
		 Matrix m3 = m1.addMatrix(m2);
		 m3.displayMatrix();
		 
		 Matrix m4 = m1.multiplyMatrix(m2);
		 m4.displayMatrix();
		
	}

}
