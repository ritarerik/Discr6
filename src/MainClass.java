import java.util.Scanner;

public class MainClass {

	public static void main(String args[])
	{
		
		System.out.println("> ������� ������ >\n");
		int A[][] = {{0,  2,  5,  3,  0,  4,  0, 0},
					 {4,  0,  0,  8,  0, 15,  0, 0},
					 {9,  1,  0,  2,  5,  0, 13, 0},
					 {0,  8,  2,  0, 16,  0,  3, 0},
					 {0,  0,  5, 16,  0,  0,  0, 4},
					 {4, 15,  0,  0,  0,  6,  7, 0},
					 {0,  0, 13,  0,  0,  7,  0, 3},
					 {0,  0,  0,  0,  4,  0,  0, 0}};
		Matrix.printINT(A);
				
		// ���������������
		System.out.println("> ���������������� �������� >\n");
		int D[] = Linear.run(A, 6);
		System.out.println("  >> ���������� ���� >\n");
		Matrix.printINT_VECTOR(D);
				
		// �����������
//		System.out.print("> ������������ �������� >");
//		Parallel.run(A, 6);				
		
	}
	
}
