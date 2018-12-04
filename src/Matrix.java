
public class Matrix {
	
	public static void printINT(int A[][]) {	  	
		
		System.out.print("        |");
		for (int i = 0; i < A.length; i++) {
			System.out.print("(" + i + ") ");
		}
		System.out.println();
		
		
		System.out.print("        |———");
		for (int i = 0; i < A.length - 1; i++) {
			System.out.print("————");
		}
		System.out.println();
		
		
		for (int i = 0; i < A.length; i ++) {
			System.out.print("   x(" + i + ") |");
			for (int j = 0; j < A.length; j++) {
				System.out.print(" " + A[i][j] + " ");	        				
				if (j < A.length - 1) System.out.print(" ");	        				
			}			
			if (i < A.length - 1) System.out.print("\n");	        			
		}		
	}
	
}
