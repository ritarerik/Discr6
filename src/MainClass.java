import java.util.Scanner;

public class MainClass {

	public static void main(String args[])
	{
		boolean exit = false;
		Scanner in = new Scanner(System.in);
					
		System.out.println();
		System.out.print("> Количество вершин (16 -- 4096) >> ");
								
		int count = 0;						
		try { 
			count = in.nextInt();				
			if (count == 0 || count < 16 || count > 4096) throw new Exception();				
		} catch (Exception e) { 
			System.out.println("\n> Неверный ввод\n");
			System.exit(0);
		}						
				
		int A[][] = {{0,  2,  5,  3,  0,  4,  0, 0},
					 {4,  0,  0,  8,  0, 15,  0, 0},
					 {9,  1,  0,  2,  5,  0, 13, 0},
					 {0,  8,  2,  0, 16,  0,  3, 0},
					 {0,  0,  5, 16,  0,  0,  0, 4},
					 {4, 15,  0,  0,  0,  6,  7, 0},
					 {0,  0, 13,  0,  0,  7,  0, 3},
					 {0,  0,  0,  0,  4,  0,  0, 0}};
		Matrix.printINT(A);
		
		// последовательно
		System.out.println("\n> Последовательный алгоритм >\n");
		Linear.run(A, 6);
				
		// параллельно
		System.out.print("> Параллельный алгоритм >");
		Parallel.run(A, 6);				
		
		in.close();
	}
	
}
