package com.functional.programs;
import com.fucntion.utilities.*;
/*
 * @Purpose:In this class we display the matrix in form of integer and double values
 * @author Rishabh
 * @version 1.0
 * @since 12-12-2018
 */
public class Array2DLibraray {
    public static void main(String[] args) {
    	/*
    	 * this method is used for reading integer type value in our matric
    	 */
		int matrix[][]=Utility.readMatrix();
		/*
		 * this method is used to display the matrix
		 * @param matrix 
		 */
		Utility.displayMatrix(matrix);   
		/*
		 * this method is used for reading double type value in our matrix
		 */
		double matrix2[][]=Utility.readMatrix1(); 
		/*
		 *  this method takes double type 2d array as an argument 
	     * and display the matrix                                             
		 */
		Utility.displayMatrix1(matrix2);    
	}
}
