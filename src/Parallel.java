import java.util.ArrayDeque;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Parallel {
	
	private static final int INFINITY = 100000;
	private static CyclicBarrier BARRIER = new CyclicBarrier(4);
	
	public static int[] run(int A[][], int startVertex) {
		
		long startTime = System.currentTimeMillis();
		
		//----------------------------------------------------------//
		for (int i = 0; i < A.length; i++)
			for (int j = 0; j < A.length; j++)
				if (A[i][j] == 0) A[i][j] = INFINITY;		
		
		//----------------------------------------------------------//
		int 	D[] = new int[A.length]; // минимальные расстояния
		boolean V[] = new boolean[A.length]; // посещённые вершины
		int 	temp = 0, 
				minIndex = 0, 
				min = 0;
		
		// инициализация вершин и расстояний
		for (int i = 0; i < A.length; i++) {
			D[i] = INFINITY;
			V[i] = false;			
		}
		
		D[startVertex] = 0;
		
		CommonResource CR = new CommonResource(min, minIndex, A, D, V);
		
		do {
			minIndex = INFINITY;
			min 	 = INFINITY;
			
			for (int i = 0; i < A.length; i++) {
				// если вершину ещё не обошли и вес меньше min
				if ((!V[i]) && (D[i] < min)) {
					// переприсваиваем значения
					min 	 = D[i];
					minIndex = i;
				}
			}
			
			// добавляем найденный минимальный вес
		    // к текущему весу вершины
		    // и сравниваем с текущим минимальным весом вершины
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
		System.out.println("  >> t = " + timeSpent + "мс\n");
		
		return D;
		
	}
}

class CommonResource {
    
	private static int min, minIndex;
	private static int A[][], D[];
	private static boolean V[];
	
	CommonResource(int min, int minIndex, int A[][], int D[], boolean V[]) {
		this.min = min;
		this.minIndex = minIndex;
		this.A = A;
		this.D = D;
		this.V = V;
	}	
	
    synchronized void writeA() {
    	
    }
    
    synchronized void writeD() {
    	
    }

	synchronized void writeMin(int min) {
		this.min = min;
	}
	
	synchronized void writeMinIndex(int minIndex) {
		this.minIndex = minIndex;
	}
	
	int getMin() {return min;}	
	int getMinIndex() {return minIndex;}
	int[][] getA() {return A;}
	int[] getD() {return D;}
	boolean[] getV() {return V;}
    
}

//class Worker implements Runnable {
//	
//	private static CyclicBarrier BARRIER;
//	private static CommonResource CR;
//	
//	Worker(CyclicBarrier BARRIER, CommonResource CR) {
//		this.BARRIER = BARRIER;
//		this.CR = CR;
//	}
//	
//	@Override
//    public void run() {
//		
//		int temp = 0;
//		int A[][] = CR.getA();
//		int D[] = CR.getD();
//		int min
//		
//		
//		for (int i = 0; i < A.length; i++) {
//			if (A[minIndex][i] > 0) {
//				temp = min + A[minIndex][i];
//				if (temp < D[i]) D[i] = temp;
//			}
//		}
//		V[minIndex] = true;
//		
//	}
//
//}