
public class p1149 {	
	private static final int RGB_NUBMER = 3;
	private int[][] matrix;
	private int maxRow;	
	
	public p1149(int maxRow, int[][] matrix) {
		this.maxRow = maxRow;
		this.matrix = matrix;		
	}	
	
	public int getSolve() {
		int value = Integer.MAX_VALUE;
		
		for (int i = 1; i < maxRow; i++) {
			for (int j = 0; j < RGB_NUBMER; j++) {
				int col1 = (j + 1) % RGB_NUBMER;
				int col2 = (j + 2) % RGB_NUBMER;
				int min = matrix[i - 1][col1];

				if (matrix[i - 1][col2] < matrix[i - 1][col1]) {
					min = matrix[i - 1][col2];
				}
					
				matrix[i][j] += min;
			}
		}
		
		for (int i = 0; i < 2; i++) {
			if (matrix[maxRow - 1][i] < value ) {
				value = matrix[maxRow - 1][i];
			}			
		}

		return value;
	}
}
