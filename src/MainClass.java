import java.util.Scanner;

public class MainClass {

	public static void main(String args[])
	{
		
		boolean exit = false;
		Scanner in = new Scanner(System.in);
					
			System.out.println("> ���������������� � ������������ ��������� >> 1");
			System.out.println("> ������ >> 2");
			System.out.println("> ����� >> 0");
			System.out.print("\n  >> ");
			
			int input = 0;			
			
			try { 
				input = in.nextInt();				
				if (input == 0) exit = true;				
			} catch (Exception e) { 
				System.out.println("\n> �������� ����\n");
			}
			
			if (!exit) {
				
				switch (input) {
					case 1 : { 
						
						System.out.println();
						System.out.print("> ���������� ������ (16 -- 4096) >> ");
						
						int count = 0;						
						try { 
							count = in.nextInt();				
							if (count == 0 || count < 16 || count > 4096) throw new Exception();				
						} catch (Exception e) { 
							System.out.println("\n> �������� ����\n");
							break;
						}
						
						int A[][] = Matrix.createINT(count);
						System.out.println("> ���������������� �������� >\n");
						int D[] = Linear.run(A, 6);
						
						System.out.print("> ������������ �������� >");
						Parallel.run(A, 6);
						
						break;
					}
					case 2 : {
						
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
								
						int D[] = Linear.run(A, 6);
						System.out.println("  >> ���������� ���� >\n");
						Matrix.printINT_VECTOR(D);
						
						break;
					}
				}
								
			}

		in.close();
		
	}
	
}
