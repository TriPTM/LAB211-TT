
package model;

public class CalculatorModel {

    public CalculatorModel() {
    }
    
    public boolean checkRowColumn(String input){
        try{
            int value = Integer.parseInt(input);
            if (value <= 0){
                throw new RuntimeException("Number must be greater than 0");
            } else {
                return true;
            }
        }catch(NumberFormatException e){
            throw new RuntimeException("Please enter number");
        }
    }
    
    public boolean checkValue(String input){
        try{
            int value = Integer.parseInt(input);
            return true;
        }catch(NumberFormatException e){
            throw new RuntimeException("Values of matrix must be the number");
        }
    }
    
    public int[][] additionMatrix (int[][] matrix1, int[][]matrix2){
        if(matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length){
            throw new RuntimeException("Cannot be added!!!");
        }
        int row = matrix1.length;
        int col = matrix1[0].length;
        int[][] matrixResult = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrixResult[i][j] = 0;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrixResult[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return matrixResult;
    }
    
    public int[][] subtractionMatrix (int[][] matrix1, int[][]matrix2){
        if(matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length){
            throw new RuntimeException("Cannot be subtracted!!!");
        }
        int row = matrix1.length;
        int col = matrix1[0].length;
        int[][] matrixResult = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrixResult[i][j] = 0;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrixResult[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return matrixResult;
    }
    
    public int[][] multiplicationMatrix(int[][] matrix1, int[][]matrix2){
        if(matrix1[0].length != matrix2.length){
            throw new RuntimeException("Cannot be multiplied!!!");
        }
        int row = matrix1.length;
        int col = matrix2[0].length;
        int[][] matrixResult = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrixResult[i][j] = 0;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int k = 0; k < col; k++) {
                    matrixResult[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return matrixResult;
    }
}
