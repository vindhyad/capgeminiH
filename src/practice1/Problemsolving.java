package practice1;
import java.util.Scanner;
public class Problemsolving {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Number Of Matrix Rows");
        int matrixRow = s.nextInt();
         
        System.out.println("Enter The Number Of Matrix Columns");
        int matrixCol = s.nextInt();
      
        int[][] matrix = new int[matrixRow][matrixCol];
        
        enterMatrixData(s, matrix, matrixRow, matrixCol);
        
       
        printMatrix(matrix, matrixRow, matrixCol);
  }

	 public static void enterMatrixData (Scanner s, int[][] matrix, int matrixRow, int matrixCol){
	     System.out.println("Enter Matrix Data");
	         
	          for (int i = 0; i < matrixRow; i++)
	          {
	              for (int j = 0; j < matrixCol; j++)
	              {
	                  matrix[i][j] = s.nextInt();
	                  
	              }
	             
	          }  
	          
	  }
	  public static void printMatrix(int[][] matrix, int matrixRow, int matrixCol){
	    System.out.println("Your Matrix is : ");
	        
	        for (int i = 0; i < matrixRow; i++)
	        {
	            for (int j = 0; j < matrixCol; j++)
	            {
	                System.out.print(matrix[i][j]+"\t");
	                
	            }
	             
	        }
	  }
	}

