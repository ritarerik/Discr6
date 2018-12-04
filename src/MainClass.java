import java.util.Scanner;

public class MainClass {

	public static void main(String args[])
	{
		
		System.out.println("> Матрица связей >\n");
//		int A[][] = {{0,  2,  5,  3,  0,  4,  0, 0},
//					 {4,  0,  0,  8,  0, 15,  0, 0},
//					 {9,  1,  0,  2,  5,  0, 13, 0},
//					 {0,  8,  2,  0, 16,  0,  3, 0},
//					 {0,  0,  5, 16,  0,  0,  0, 4},
//					 {4, 15,  0,  0,  0,  6,  7, 0},
//					 {0,  0, 13,  0,  0,  7,  0, 3},
//					 {0,  0,  0,  0,  4,  0,  0, 0}};
		int A[][] = {{0, 7, 9, 0, 0, 14},
					 {7, 0, 10, 15, 0, 0},
					 {9, 10, 0, 11, 0, 2},
					 {0, 15, 11, 0, 6, 0},
					 {0, 0, 0, 6, 0, 9},
					 {14, 0, 2, 0, 9, 0}};
		Matrix.printINT(A);
//		Matrix.printINT(transpose(A));
				
		// последовательно
		System.out.println("> Последовательный алгоритм >\n");
		Linear.run(A, 6);
				
		// параллельно
//		System.out.print("> Параллельный алгоритм >");
//		Parallel.run(A, 6);				
		
	}
	
	public static int[][] transpose(int A[][]) {
		
		int B[][] = new int[A.length][A.length];
		
		for (int i = 0; i < A.length; i++) 
			for (int j = 0; j < A.length; j++) 
				B[j][i] = A[i][j];
			
		return B;		
		
	}
	
}
