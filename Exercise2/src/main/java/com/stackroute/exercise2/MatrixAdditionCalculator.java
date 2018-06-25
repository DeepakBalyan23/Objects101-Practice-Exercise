package com.stackroute.exercise2;

public class MatrixAdditionCalculator {

	private int rows;
	private int columns;
	private int[][] matrix1;
	private int[][] matrix2;
	
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getColumns() {
		return columns;
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}
	public int[][] getMatrix1() {
		return matrix1;
	}
	public void setMatrix1(int[][] matrix1) {
		this.matrix1 = matrix1;
	}
	public int[][] getMatrix2() {
		return matrix2;
	}
	public void setMatrix2(int[][] matrix2) {
		this.matrix2 = matrix2;
	}
	
	public int[][]matrixAddition(){
		int[][] sumMatrix = new int[rows][columns];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				sumMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		return sumMatrix;
	}
}
