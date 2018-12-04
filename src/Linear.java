
public class Linear {
	
	private static final int INFINITY = 100000;
	
	public static int[] run(int A[][], int startVertex) {
		
		long startTime = System.currentTimeMillis();
		
		//----------------------------------------------------------//
		for (int i = 0; i < A.length; i++)
			for (int j = 0; j < A.length; j++)
				if (A[i][j] == 0) A[i][j] = INFINITY;		
		
		//----------------------------------------------------------//
		int 	D[] = new int[A.length]; // ����������� ����������
		boolean V[] = new boolean[A.length]; // ���������� �������
		int 	temp = 0, 
				minIndex = 0, 
				min = 0;
		
		// ������������� ������ � ����������
		for (int i = 0; i < A.length; i++) {
			D[i] = INFINITY;
			V[i] = false;			
		}
		
		D[startVertex] = 0;
		
		do {
			minIndex = INFINITY;
			min 	 = INFINITY;
			
			for (int i = 0; i < A.length; i++) {
				// ���� ������� ��� �� ������ � ��� ������ min
				if ((!V[i]) && (D[i] < min)) {
					// ��������������� ��������
					min 	 = D[i];
					minIndex = i;
				}
			}
			
			// ��������� ��������� ����������� ���
		    // � �������� ���� �������
		    // � ���������� � ������� ����������� ����� �������
			if (minIndex != INFINITY) {
				for (int i = 0; i < A.length; i++) {
					if (A[minIndex][i] > 0) {
						temp = min + A[minIndex][i];
						if (temp < D[i]) D[i] = temp;
					}
				}
				V[minIndex] = true;
			}
			
		} while (minIndex < INFINITY);
		
		long timeSpent = System.currentTimeMillis() - startTime;
		System.out.println("  >> t = " + timeSpent + "��\n");
		
		return D;
		
	}
		
}
